package telasJogo;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Constants;

public class TabMonstros extends JPanel {

	private static final long serialVersionUID = 1L;
	public static final ImageIcon TABMONSTROS = new ImageIcon( Constants.class.getResource("../Imagens/mapa/tabDrag.png"));
	
	int alt = 45;
	int lar = 325;
	
	JLabel imagemTabMonstro;

	public TabMonstros() {
		inicializaComponents();
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemTabMonstro = new JLabel();
		imagemTabMonstro.setSize(lar, alt);
		imagemTabMonstro.setIcon(new ImageIcon(TABMONSTROS.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemTabMonstro);
		
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setVisible(false);
	}		
}
