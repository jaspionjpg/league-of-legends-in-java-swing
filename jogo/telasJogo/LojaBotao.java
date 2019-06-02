package telasJogo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import utils.Constants;

public class LojaBotao extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon LOJABOTAO = new ImageIcon( Constants.class.getResource("../Imagens/mapa/lojaBotao.png"));
	
	int alt = 22;
	int lar = 127;
	JLabel textoGold;
	JLabel imagemLojaBotao;
	Jogo jogo;
	
	public LojaBotao(Jogo jogo) {
		this.jogo = jogo;
		inicializaComponents();
	}

	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
		imagemLojaBotao = new JLabel();
		imagemLojaBotao.setSize(lar, alt);
		imagemLojaBotao.setIcon(new ImageIcon(LOJABOTAO.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemLojaBotao);
		
		textoGold = new JLabel("500");
		textoGold.setBounds(61, 0, 80, 20);
		textoGold.setForeground(Color.YELLOW);
		add(textoGold,0);
		
		setFocusable(false);
		setBackground(new Color(255,255,255,0));
        setOpaque(false);

		addActionListener(this);
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jogo.loja.setVisible(!jogo.loja.isVisible());
	}
}
