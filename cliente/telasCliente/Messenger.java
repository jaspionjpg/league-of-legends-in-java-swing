package telasCliente;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Messenger extends JPanel {
	private static final long serialVersionUID = 1L;
	int alt;
	int lar;
	
	JLabel fundo;
	JButton minimizar;
	JButton fechar;
	
	public Messenger(int lar, int alt) {
		this.lar = (int) (lar * 0.2);
		this.alt = (int) alt;
		inicializaComponents();
		setVisible(true);
	}

	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		setFocusable(true);
		setBackground(new Color(0,0,0));
		
		minimizar = new JButton();
		minimizar.setBounds(lar - 45, 3, 20, 20);
		
		fechar = new JButton();
		fechar.setBounds(lar -23, 3, 20, 20);
		
		add(minimizar);
		add(fechar);
	}
}
