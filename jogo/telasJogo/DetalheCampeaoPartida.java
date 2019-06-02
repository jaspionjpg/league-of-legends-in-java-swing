package telasJogo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entidades.CampeaoPartida;
import utils.Constants;
import utils.MinhaProgressBar;

public class DetalheCampeaoPartida extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon DETALHECAMPEAOPARTIDA = new ImageIcon( Constants.class.getResource("../Imagens/mapa/detalheCampeao.png"));
	
	int lar = 700;
	int alt = 120;
	
	JLabel imagemDetalhe;
	JLabel rosto;
	
	Jogo jFrame;
	
	MinhaProgressBar barraExp;
	MinhaProgressBar vida;
	MinhaProgressBar mana;
	
	Recall recall;
	LojaBotao lojaBotao;
	
	CampeaoPartida campeao;
	
	JLabel gold;
	JLabel danoAtaque;
	JLabel danoMagico;
	JLabel critico;
	JLabel defesaMagica;
	JLabel armadura;
	JLabel velocidadeMovimento;
	JLabel velocidadeAtaque;
	JLabel tempoRecarga;
	JLabel level;
	JLabel descricaoPassiva;
	JLabel descricaoHabilidadeQ;
	JLabel descricaoHabilidadeW;
	JLabel descricaoHabilidadeE;
	JLabel descricaoHabilidadeR;
	
	public DetalheCampeaoPartida(CampeaoPartida campeao, Jogo jFrame) {
		this.jFrame = jFrame;
		this.campeao = campeao;
		inicializaComponents();
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemDetalhe = new JLabel();
		imagemDetalhe.setSize(lar, alt);
		imagemDetalhe.setIcon(new ImageIcon(DETALHECAMPEAOPARTIDA.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		imagemDetalhe.setBackground(new Color(255,255,255,0));
		imagemDetalhe.setOpaque(false);
		
		barraExp = new MinhaProgressBar(30, 75, 50d, false, Color.yellow, "");
		barraExp.setLocation(195, 14);
		
		vida = new MinhaProgressBar(295, 15, 100d, true, Color.GREEN, campeao.getVidaAtual()+" /" + campeao.getVida());
		vida.setLocation(236, 79);
		
		mana = new MinhaProgressBar(295, 15, 0d, true, Color.BLUE, campeao.getManaAtual()+" /" + campeao.getMana());
		mana.setLocation(236, 95);
		
		campeao.getCampeaoRosto().setLocation(135, 20);
		
		campeao.getCampeaoPassiva().setLocation(235, 19);
		campeao.getCampeaoPassiva().addMouseListener(this);
		
		campeao.getCampeaoQ().setLocation(270, 19);
		campeao.getCampeaoQ().addActionListener(campeao);
		campeao.getCampeaoQ().addMouseListener(this);
		
		campeao.getCampeaoW().setLocation(317, 19);
		campeao.getCampeaoW().addActionListener(campeao);
		campeao.getCampeaoW().addMouseListener(this);
		
		campeao.getCampeaoE().setLocation(364, 19);
		campeao.getCampeaoE().addActionListener(campeao);
		campeao.getCampeaoE().addMouseListener(this);
		
		campeao.getCampeaoR().setLocation(412, 19);
		campeao.getCampeaoR().addActionListener(campeao);
		campeao.getCampeaoR().addMouseListener(this);
		
		recall = new Recall(campeao);
		recall.setLocation(661,57);

		level = new JLabel(" "+campeao.getLevel());
		level.setForeground(Color.WHITE);
		level.setBounds(189,88,20,20);
		
		lojaBotao = new LojaBotao(jFrame);
		lojaBotao.setForeground(Color.YELLOW);
		lojaBotao.setLocation(555,92);
		
//		gold = new JLabel(campeao.getGold()+"");
//		gold.setForeground(Color.YELLOW);
//		gold.setBounds(613,92,50,20);
		
		danoAtaque = new JLabel(Math.round(campeao.getDanoAtaque())+"");
		danoAtaque.setForeground(Color.WHITE);
		danoAtaque.setBounds(27, 20, 50,20);
		
		armadura = new JLabel(Math.round(campeao.getArmadura())+"");
		armadura.setForeground(Color.WHITE);
		armadura.setBounds(27, 45, 50,20);

		velocidadeAtaque = new JLabel(campeao.getAtaqueSpeed()+"");
		velocidadeAtaque.setForeground(Color.WHITE);
		velocidadeAtaque.setBounds(27, 68, 50,20);
		
		critico = new JLabel(Math.round(campeao.getCritico())+"");
		critico.setForeground(Color.WHITE);
		critico.setBounds(27, 92, 50,20);

		danoMagico = new JLabel(Math.round(campeao.getDanoMagico())+"");
		danoMagico.setForeground(Color.WHITE);
		danoMagico.setBounds(95, 20, 50,20);
		
		defesaMagica = new JLabel(Math.round(campeao.getDefesaMagica())+"");
		defesaMagica.setForeground(Color.WHITE);
		defesaMagica.setBounds(95, 45, 50,20);
		
		tempoRecarga = new JLabel(Math.round(campeao.getTempoRecarga())+"%");
		tempoRecarga.setForeground(Color.WHITE);
		tempoRecarga.setBounds(95, 68, 50,20);
		
		velocidadeMovimento = new JLabel(Math.round(campeao.getVelocidadeMovimento())+"");
		velocidadeMovimento.setForeground(Color.WHITE);
		velocidadeMovimento.setBounds(95, 92, 50,20);
		
		add(vida);
		add(mana);
		add(recall);
		add(lojaBotao);
		
		add(level);
		add(danoAtaque);
		add(armadura);
		add(velocidadeAtaque);
		add(critico);
		add(danoMagico);
		add(defesaMagica);
		add(tempoRecarga);
		add(velocidadeMovimento);
		
		add(imagemDetalhe);
		add(campeao.getCampeaoRosto());
		add(barraExp);
		
		add(campeao.getCampeaoPassiva());
		add(campeao.getCampeaoQ());
		add(campeao.getCampeaoW());
		add(campeao.getCampeaoE());
		add(campeao.getCampeaoR());
		
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource().equals(campeao.getCampeaoPassiva())){
			if(descricaoPassiva == null){
				descricaoPassiva = campeao.getCampeaoPassiva().getDescricao();
			}
			descricaoPassiva.setVisible(true);
			jFrame.add(descricaoPassiva, 0);
		} else if(e.getSource().equals(campeao.getCampeaoQ())){
			if(descricaoHabilidadeQ == null){
				descricaoHabilidadeQ = campeao.getCampeaoQ().getDescricao();
			}
			descricaoHabilidadeQ.setVisible(true);
			jFrame.add(descricaoHabilidadeQ, 0);
		} else if(e.getSource().equals(campeao.getCampeaoW())){
			if(descricaoHabilidadeW == null){
				descricaoHabilidadeW = campeao.getCampeaoW().getDescricao();
			}
			descricaoHabilidadeW.setVisible(true);
			jFrame.add(descricaoHabilidadeW, 0);
		} else if(e.getSource().equals(campeao.getCampeaoE())){
			if(descricaoHabilidadeE == null){
				descricaoHabilidadeE = campeao.getCampeaoE().getDescricao();
			}
			descricaoHabilidadeE.setVisible(true);
			jFrame.add(descricaoHabilidadeE, 0);
		} else if(e.getSource().equals(campeao.getCampeaoR())){
			if(descricaoHabilidadeR == null){
				descricaoHabilidadeR = campeao.getCampeaoR().getDescricao();
			}
			descricaoHabilidadeR.setVisible(true);
			jFrame.add(descricaoHabilidadeR, 0);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource().equals(campeao.getCampeaoPassiva())){
			descricaoPassiva.setVisible(false);
		} else if(e.getSource().equals(campeao.getCampeaoQ())){
			descricaoHabilidadeQ.setVisible(false);
		} else if(e.getSource().equals(campeao.getCampeaoW())){
			descricaoHabilidadeW.setVisible(false);
		} else if(e.getSource().equals(campeao.getCampeaoE())){
			descricaoHabilidadeE.setVisible(false);
		} else if(e.getSource().equals(campeao.getCampeaoR())){
			descricaoHabilidadeR.setVisible(false);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}