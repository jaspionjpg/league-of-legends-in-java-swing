package utils;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MinhaProgressBar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private Integer lar;
	private Integer alt;

	private JLabel barra;
	private JLabel texto;

	public MinhaProgressBar(Integer lar, Integer alt, Double porcentagem, Boolean horizontal, Color cor, String descricao) {
		this.lar = lar;
		this.alt = alt;
		
		setSize(lar, alt);
		setLayout(null);
		setBackground(Color.BLACK);
		
		barra = new JLabel();
		if(horizontal)
			barra.setSize((int)(lar * porcentagem) / 100, alt);
		else
			barra.setSize(lar, (int)(alt * porcentagem) / 100);
		barra.setOpaque(true);
		barra.setBackground(cor);
		
		texto = new JLabel(descricao);
		texto.setBounds((lar - 6 * descricao.length()) / 2, 1, 6 * descricao.length(), alt);
		add(texto);
		add(barra);
		
		setVisible(true);
	}
	
	public void atualiza(Double porcentagem, String descricao, Boolean horizontal) {
		if(horizontal)
			barra.setSize((int)(lar * porcentagem) / 100, alt);
		else
			barra.setSize(lar, (int)(alt * porcentagem) / 100);
		texto.setText(descricao);
		texto.setBounds((lar - 6 * descricao.length()) / 2, 1, 6 * descricao.length(), alt);
	}
}