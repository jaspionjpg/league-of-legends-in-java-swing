package telasJogo;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import campeoes.Garen;
import entidades.CampeaoPartida;
import utils.Constants;

public class Mapa extends JPanel implements MouseMotionListener, MouseWheelListener, MouseListener{
	private static final long serialVersionUID = 1L;
	public static final ImageIcon MAPA = new ImageIcon(Constants.class.getResource("../Imagens/mapa/mapa.jpg"));
	
	int lar;
	int alt;
	int larMapa = Constants.LARGURAMAPA;
	int altMapa = Constants.ALTURAMAPA;
	public Boolean prenderMapa = false;
	
	JLabel imagemMapa;
	
	CampeaoPartida campeaoPrincipal;

	public Mapa(Integer lar, Integer alt) {
		this.lar = lar;
		this.alt = alt;
		inicializaComponents();
		
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		addMouseListener(this);
	}
	
	public void inicializaComponents() {
		setSize(larMapa, altMapa);
		setLayout(null);
		
		campeaoPrincipal = new Garen("JaspionJpg", this, true);
		campeaoPrincipal.setLocation(400,400);
		add(campeaoPrincipal);
		
		imagemMapa = new JLabel();
		imagemMapa.setSize(larMapa, altMapa);
		imagemMapa.setIcon(new ImageIcon(MAPA.getImage().getScaledInstance(larMapa, altMapa, Image.SCALE_DEFAULT)));
		add(imagemMapa);
	}

	public void zoom() {
        imagemMapa.setSize(larMapa, altMapa);
		imagemMapa.setIcon(new ImageIcon(MAPA.getImage().getScaledInstance(larMapa, altMapa, Image.SCALE_DEFAULT)));
    }
    
	public void centralizarNoCampeao(){
		int x = -1 * ((campeaoPrincipal.getX() + campeaoPrincipal.getLar())- lar/2);
		int y = -1 * ((campeaoPrincipal.getY()  + campeaoPrincipal.getAlt())- alt/2);
		
		if(x < -(larMapa - lar) && y < -(altMapa - alt))
			setLocation(-(larMapa - lar), -(altMapa - alt));
		else if(x > 0 && y > 0)
			setLocation(0, 0);
		else if(x > 0 && y < -(altMapa - alt))
			setLocation(0, -(altMapa - alt));
		else if(x < -(larMapa - lar) && y > 0)
			setLocation(-(larMapa - lar), 0);
		else if(x < -(larMapa - lar))
			setLocation(-(larMapa - lar), y);
		else if(y < -(altMapa - alt))
			setLocation(x, -(altMapa - alt));
		else if(x > 0)
			setLocation(0, y);
		else if(y > 0)
			setLocation(x, 0);
		else
			setLocation(x, y);
	}
	
	public void mover(int x, int y){
		if(x > -(larMapa - lar))
			if(y > -(altMapa - alt))
				if(x < 0)
					if(y < 0)
						setLocation(x, y);
	}	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		if(!prenderMapa){
			if(e.getXOnScreen() > lar - 100){
				if(getLocation().getX() > -(larMapa - lar - 4))
					setLocation(getX()-5, getY());
			} else if(e.getYOnScreen() > alt - 100){
				if(getLocation().getY() > -(altMapa - alt - 4))
					setLocation(getX(), getY()-5);
			} else if(e.getXOnScreen() < 100){
				if(getLocation().getX() < -5)
					setLocation(getX()+5, getY());
			} else if(e.getYOnScreen() < 100){
				if(getLocation().getY() < -5)
					setLocation(getX(), getY()+5);
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
//		int notches = e.getWheelRotation();
//		if (notches < 0) {
//			larMapa += 200;
//			altMapa += 200;
//		} else {
//			larMapa -= 200;
//			altMapa -= 200;
//		}
//		zoom();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3){
			campeaoPrincipal.andar(e.getX(),e.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}