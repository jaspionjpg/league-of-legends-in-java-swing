package campeoes;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entidades.CampeaoPartida;
import interfaces.Campeao;
import telasJogo.Mapa;
import utils.Constants;
import utils.MinhaProgressBar;

public class Garen extends CampeaoPartida implements Campeao {
	private static final long serialVersionUID = 1L;
	public static final Image GAREN = new ImageIcon( Constants.class.getResource("../Imagens/garen/1.gif")).getImage();
	public static final Image ROSTO = new ImageIcon( Constants.class.getResource("../Imagens/garen/Garen.png")).getImage();
	public static final Image PASSIVA = new ImageIcon( Constants.class.getResource("../Imagens/garen/habilidades/Garen_Passive.png")).getImage();
	public static final Image Q = new ImageIcon( Constants.class.getResource("../Imagens/garen/habilidades/GarenQ.png")).getImage();
	public static final Image W = new ImageIcon( Constants.class.getResource("../Imagens/garen/habilidades/GarenW.png")).getImage();
	public static final Image E = new ImageIcon( Constants.class.getResource("../Imagens/garen/habilidades/GarenE.png")).getImage();
	public static final Image R = new ImageIcon( Constants.class.getResource("../Imagens/garen/habilidades/GarenR.png")).getImage();

	Mapa mapa;
	int movimento = 0;
	public Thread andar = new Thread();
	public Thread recall = new Thread();
	
	public Garen(String nick, Mapa mapa, Boolean timeAzul) {
		super(nick, timeAzul);
		this.mapa = mapa;
		comecaStatus(timeAzul);
		inicializaComponents();
	}

	private void inicializaComponents() {
		setSize(140, getAlt()+42);
		setImagemCampeao(GAREN);
		setCampeaoRosto(ROSTO);
		setCampeaoPassiva(PASSIVA, "Perseverança", "Se Garen não foi recentemente atingido por dano ou habilidades inimigas, ele regenera um percentual de sua Vida máxima a cada segundo. O dano das tropas não interrompe Perseverança.");
		setCampeaoQ(Q, "Acerto Decisivo", "Garen recebe Velocidade de Movimento adicional, libertando-se de todos os efeitos debilitantes. Seu próximo ataque atinge uma área vital do inimigo, causando dano adicional e silenciando-o.");
		setCampeaoW(W, "Coragem", "Garen passivamente aumenta a própria Armadura e Resistência Mágica ao abater inimigos. Ele também pode ativar esta habilidade para conceder a si mesmo um escudo que reduz o dano recebido por um curto período de tempo.");
		setCampeaoE(E, "Julgamento", "Garen realiza uma dança mortal com sua espada, causando dano ao seu redor e reduzindo a Armadura dos Campeões inimigos atingidos enquanto durar o efeito.");
		setCampeaoR(R, "Justiça Demaciana", "O campeão inimigo com mais abates recentes torna-se o Vilão. Os ataques de Garen causam Dano Verdadeiro adicional a esse campeão. Garen pode evocar o poder de Demacia para causar um golpe fatal a um campeão inimigo, causando dano com base em quanta Vida seu alvo já tiver perdido. O Vilão recebe Dano Verdadeiro.");
	}

	@Override
	public void comecaStatus(Boolean timeAzul) {
		setNomeCampeao("Garen");
		setLar(80);
		setAlt(130);
		addVida(616.28d);
		addDanoAtaque(57.88d);
		addArmadura(27.536d);
		addAtaqueRange(175d);
		addVelocidadeMovimento(340d);
		addDefesaMagica(32.1d);
		addVidaRegen(7.84d);
	}
	
	@Override
	public void usarQ() {
		this.getCampeaoQ().usarHabilidade(10);
	}

	@Override
	public void usarW() {
		this.getCampeaoW().usarHabilidade(10);
	}

	@Override
	public void usarE() {
		this.getCampeaoE().usarHabilidade(10);
	}

	@Override
	public void usarR() {
		this.getCampeaoR().usarHabilidade(10);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void andar(int x, int y) {
		if(andar.isAlive()){
			andar.stop();
		}
		andar = new Thread(new Andar(x, y));
		andar.start();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void recall(){
		if(recall.isAlive()){
			recall.stop();
		}
		recall = new Thread(new Recall(getTimeAzul()));
		recall.start();
	}
	
	class Andar extends Thread {
		int x,y;
		public Andar(int x, int y) {
			this.x = x - getLar();
			this.y = y - getAlt();
		}
		@Override
		public void run() {
			movimento = 1;
			int distancia = 0;
			int distanciax = 0;
			int distanciay = 0;
			Boolean direita = true;
			Boolean baixo = true;
			if(x < getLocation().getX()){
				distanciax = (int) (getLocation().getX() - x);
				direita = false;
			} else {
				distanciax = (int) (x - getLocation().getX());
			}
			
			if(y < getLocation().getY()){
				distanciay = (int) (getLocation().getY() - y);
				baixo = false;
			} else {
				distanciay = (int) (y - getLocation().getY());
			}
			
			distancia = (int) Math.sqrt(Math.pow(distanciax, 2) + Math.pow(distanciay, 2));
			int movimentos = (int) (distancia / getVelocidadeMovimento() * 100);
			
			for(double i = -1; i < movimentos; i++) {
				try {
					Thread.sleep((int) (10));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				setLocation((int)(getLocation().getX()  + (direita ? 1 : -1 * (distanciax / movimentos))), (int) (getLocation().getY() + (baixo ? 1 : -1 * (distanciay / movimentos))));
				if(mapa.prenderMapa){
					mapa.centralizarNoCampeao();
				}
			}
			movimento = 0;
		}
    }	
	
	class Recall extends Thread {
		Boolean timeAzul;
		public Recall(Boolean timeAzul) {
			this.timeAzul = timeAzul;
		}
		@Override
		public void run() {
			movimento = 2;
			MinhaProgressBar recallBar = new MinhaProgressBar(300, 20, new Double(0), true, Color.GREEN, "Recall");
			recallBar.setLocation(getX(), getY());
			mapa.add(recallBar, 0);
			Boolean concluido = true;
			for(int i = 100; i <= 8000; i+=100){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println("Thread cancelada");
				}
				if(movimento != 2){
					concluido = false;
					break;
				}
				recallBar.atualiza(new Double(i) / 8000d * 100d, "Recall", true);
			}
			recallBar.setVisible(false);
			mapa.remove(recallBar);
			movimento = 0;
			
			if(concluido){
				if(this.timeAzul ){
					setLocation(Constants.MEIOBASEAZULX, Constants.MEIOBASEAZULY);
				} else {
					setLocation(Constants.MEIOBASEVERMELHOX, Constants.MEIOBASEVERMELHOY);
				}
				mapa.centralizarNoCampeao();
			}
		}
    }	
}
