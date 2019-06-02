package telasCliente;

import java.awt.Color;

import javax.swing.JPanel;

public class Colecao extends JPanel {
	private static final long serialVersionUID = 1L;
	int alt;
	int lar;
	
	public Colecao(int lar, int alt) {
		this.lar = (int) (lar * 0.8);
		this.alt = (int) alt;
		inicializaComponents();
		setVisible(true);
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		setFocusable(true);
		setBackground(new Color(0,0,0));
	}
}
