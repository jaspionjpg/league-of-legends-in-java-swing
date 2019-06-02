package telasJogo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import entidades.CampeaoPartida;
import utils.Constants;

public class Recall extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon RECALL = new ImageIcon( Constants.class.getResource("../Imagens/mapa/recall.png"));
	
	int alt = 30;
	int lar = 28;
	CampeaoPartida campeao;
	
	JLabel imagemRecall;

	public Recall(CampeaoPartida campeao) {
		this.campeao = campeao;
		
		inicializaComponents();
	}

	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemRecall = new JLabel();
		imagemRecall.setSize(lar, alt);
		imagemRecall.setIcon(new ImageIcon(RECALL.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemRecall);
		
		setFocusable(false);
		setBackground(new Color(255,255,255,0));
        setOpaque(false);

		addActionListener(this);
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		campeao.recall();
	}
}
