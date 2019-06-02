package telasCliente;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import utils.Constants;

public class BotaoTopo extends JButton implements MouseListener{
	private static final long serialVersionUID = 1L;
	public static final ImageIcon FUNDOBOTAO = new ImageIcon(Constants.class.getResource("../imagensCliente/fundoBotaoTopo.png"));
	
	Boolean ativado = false;
	int lar;
	int alt;
	
	JLabel imagemFundo;
	JLabel imagemTexto;
	public BotaoTopo(String texto, int lar, int alt) {
		this.lar = lar;
		this.alt = alt;
		
		setSize(lar, alt);
		setBackground(new Color(255,255,255,0));
		setOpaque(true);
		
		imagemTexto = new JLabel(texto);
		imagemTexto.setForeground(Color.WHITE);
		imagemTexto.setFont(new Font("liberation serif",14,14));
		imagemTexto.setHorizontalAlignment(JLabel.CENTER);
		imagemTexto.setVerticalAlignment(JLabel.CENTER);
		
		add(imagemTexto);
		
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusable(false);
		setVisible(true);
		
		addMouseListener(this);
	}
	
	public void ativa() {
		ativado = !ativado;
		if(ativado){
			setIcon(new ImageIcon(FUNDOBOTAO.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		} else {
			setIcon(null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}