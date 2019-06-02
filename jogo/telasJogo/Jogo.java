package telasJogo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import entidades.CampeaoPartida;
import utils.Constants;

public final class Jogo extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon MAPA = new ImageIcon(Constants.class.getResource("../Imagens/mapa/mapa.jpg"));
	
	int alt;
	int lar;
	
	Mapa mapa;
	MiniMapa miniMapa;
	DetalheCampeaoPartida detalheCampeaoPartida;
	BarraFrag barraFrag;
	TabMonstros tabMonstros;
	TabJogadores tabJogadores;
	Loja loja;
	
	List<CampeaoPartida> jogadores; 
	Timer timer;
	public Jogo() {
		inicializaTela();
		inicializaComponents();
		timer = new Timer(100, this);
	    timer.start();
		setVisible(true);
	}

	private void inicializaTela() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setLayout(null);
		
		setFocusable(true);
		Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();  

		lar = tamTela.width;  
		alt = tamTela.height;
	}

	private void inicializaComponents() {
		mapa = new Mapa(lar, alt);
		
		miniMapa = new MiniMapa(mapa);
		miniMapa.setLocation(lar - miniMapa.lar, alt - miniMapa.alt);
		
		detalheCampeaoPartida = new DetalheCampeaoPartida(mapa.campeaoPrincipal, this);
		detalheCampeaoPartida.setLocation((lar - detalheCampeaoPartida.lar) / 2, alt - detalheCampeaoPartida.alt);
		
		barraFrag = new BarraFrag();
		barraFrag.setLocation(lar - barraFrag.lar, 0);
		
		tabMonstros = new TabMonstros();
		tabMonstros.setLocation((lar - tabMonstros.lar) / 2, 0);
		
		tabJogadores = new TabJogadores();
		tabJogadores.setLocation((lar - tabJogadores.lar) / 2, (alt - tabJogadores.alt) / 2);
		
		loja = new Loja();
		loja.setLocation((lar - loja.lar) / 2, (alt - loja.alt) / 2);
		
		add(loja);
		add(tabJogadores);
		add(tabMonstros);
		add(barraFrag);
		add(detalheCampeaoPartida);
		add(miniMapa);
		add(mapa);

		addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_F3){
			System.exit(0);
		} else if(e.getKeyCode() == KeyEvent.VK_B){
			mapa.campeaoPrincipal.recall();
		} else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			mapa.centralizarNoCampeao();
		} else if(e.getKeyCode() == KeyEvent.VK_C){
			tabJogadores.setVisible(true);
			tabMonstros.setVisible(true);
		} else if(e.getKeyCode() == KeyEvent.VK_L){
			loja.setVisible(!loja.isVisible());
		} else if(e.getKeyCode() == KeyEvent.VK_Y){
			mapa.prenderMapa = !mapa.prenderMapa;
			if(mapa.prenderMapa){
				mapa.centralizarNoCampeao();
			}
		} else if(e.getKeyCode() == KeyEvent.VK_Q){
			mapa.campeaoPrincipal.usarQ();
		} else if(e.getKeyCode() == KeyEvent.VK_W){
			mapa.campeaoPrincipal.usarW();
		} else if(e.getKeyCode() == KeyEvent.VK_E){
			mapa.campeaoPrincipal.usarE();
		} else if(e.getKeyCode() == KeyEvent.VK_R){
			mapa.campeaoPrincipal.usarR();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_C){
			tabJogadores.setVisible(false);
			tabMonstros.setVisible(false);
		} 
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}