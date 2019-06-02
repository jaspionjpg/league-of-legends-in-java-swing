package telasJogo;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Constants;

public class MiniMapa extends JPanel implements MouseMotionListener {
	private static final long serialVersionUID = 1L;
	
	public static final ImageIcon MINIMAPA = new ImageIcon(Constants.class.getResource("../Imagens/mapa/minimap.png"));
	int lar = 200;
	int alt = 200;
	
	Mapa mapa;
	
	JLabel imagemMapa;

	public MiniMapa(Mapa mapa) {
		this.mapa = mapa;
		inicializaComponents();
	}

	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemMapa = new JLabel();
		imagemMapa.setSize(lar, alt);
		imagemMapa.setIcon(new ImageIcon(MINIMAPA.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemMapa);
		
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getX() < 0 && e.getY() < 0){
			mapa.setLocation(0, 0);
		} else if(e.getY() < 0 && e.getX() * mapa.larMapa / (mapa.larMapa - mapa.lar)  > lar){
			mapa.setLocation(-(mapa.larMapa - mapa.lar), 0);		
		} else if(e.getY() * mapa.altMapa / (mapa.altMapa - mapa.alt)  > alt && e.getX() * mapa.larMapa / (mapa.larMapa - mapa.lar)  > lar){
			mapa.setLocation(-(mapa.larMapa - mapa.lar), -(mapa.altMapa - mapa.alt));
		}  else if(e.getY() * mapa.altMapa / (mapa.altMapa - mapa.alt)  > alt && e.getX() < 0){
			mapa.setLocation(0, -(mapa.altMapa - mapa.alt));
		} else if(e.getX() < 0){
			mapa.setLocation(0, -(mapa.altMapa / alt * e.getY()));
		} else if(e.getY() < 0){
			mapa.setLocation(-(mapa.altMapa / alt * e.getX()), 0);
		} else if(e.getX() * mapa.larMapa / (mapa.larMapa - mapa.lar)  > lar){
			mapa.setLocation(-(mapa.larMapa - mapa.lar), -(mapa.altMapa / alt * e.getY()));
		} else if(e.getY() * mapa.altMapa / (mapa.altMapa - mapa.alt)  > alt){
			mapa.setLocation(-(mapa.larMapa / lar * e.getX()), -(mapa.altMapa - mapa.alt));
		} else {
			mapa.setLocation(-(mapa.larMapa / lar * e.getX()), -(mapa.altMapa / alt * e.getY()));
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}