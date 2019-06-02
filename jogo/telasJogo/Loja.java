package telasJogo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Constants;

public class Loja extends JPanel implements MouseMotionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon LOJA = new ImageIcon( Constants.class.getResource("../Imagens/mapa/loja.png"));

	int lar = 860;
	int alt = 637;
	
	JLabel imagemLoja;
	
	public Loja() {
		inicializaComponents();
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemLoja = new JLabel();
		imagemLoja.setSize(lar, alt);
		imagemLoja.setIcon(new ImageIcon(LOJA.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemLoja);
		
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setFocusable(false);
        setVisible(false);
	}
	
	int x = 0;
	int y = 0;
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getY() < 40){
			setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}		
}
