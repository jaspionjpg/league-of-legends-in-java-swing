package telasJogo;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Constants;

public class TabJogadores extends JPanel {

	private static final long serialVersionUID = 1L;
	public static final ImageIcon TABJOGADORES = new ImageIcon( Constants.class.getResource("../Imagens/mapa/tab.png"));
	
	int alt = 334;
	int lar = 838;
	
	JLabel imagemTabJogadores;

	public TabJogadores() {
		inicializaComponents();
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemTabJogadores = new JLabel();
		imagemTabJogadores.setSize(lar, alt);
		imagemTabJogadores.setIcon(new ImageIcon(TABJOGADORES.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemTabJogadores);
		
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setVisible(false);
	}		
}
