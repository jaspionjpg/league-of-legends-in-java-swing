package entidades;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Habilidade extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;

	String descricao;
	String nome;
	
	Timer timer;
	
	JLabel tempoRecarga;
	JLabel descricaoLabel;
	Integer tempo;
	
	public Habilidade(Image imagem, String nome, String descricao, Boolean passiva) {
		this.descricao = "<html><body>" + descricao + "</body></html>";
		this.nome = nome;
		if(passiva){
			setSize(28, 32);
		} else {
			setSize(40, 45);
		}
		setIcon(new ImageIcon(imagem.getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT)));
	}

	public JLabel getDescricao() {
		descricaoLabel = new JLabel(descricao);
		descricaoLabel.setFont(new Font("arial",10,10));
		descricaoLabel.setSize(300,100);
		descricaoLabel.setLocation((int)(getLocationOnScreen().getX()), (int)(getLocationOnScreen().getY() - descricaoLabel.getHeight()));
		descricaoLabel.setFocusable(true);
		descricaoLabel.setBackground(Color.BLUE);
		descricaoLabel.setForeground(Color.GRAY);
		descricaoLabel.setOpaque(true);
		descricaoLabel.setVisible(false);
		return descricaoLabel;
	}
	
	public void usarHabilidade(Integer tempo) {
		this.tempo = tempo;
		setContentAreaFilled(false);
		setFocusable(false);
		setEnabled(false);
		
		tempoRecarga = new JLabel(tempo + "");
		tempoRecarga.setFocusable(true);
		tempoRecarga.setFont(new Font("arial",20,20));
		tempoRecarga.setSize(getWidth(), getHeight());
		tempoRecarga.setHorizontalAlignment(JLabel.CENTER);		
		tempoRecarga.setVerticalAlignment(JLabel.CENTER);
		tempoRecarga.setForeground(Color.BLUE);
		tempoRecarga.setBackground(Color.GRAY);
		add(tempoRecarga, 0);
		
		if(timer != null){
			timer.start();
		} else {
			timer = new Timer(1000, this);
			timer.start();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((tempo--) != 0){
			tempoRecarga.setText(tempo.toString());
		} else {
			setContentAreaFilled(true);
			setEnabled(true);
			tempoRecarga.setVisible(false);
			timer.stop();
		}
	}
}
