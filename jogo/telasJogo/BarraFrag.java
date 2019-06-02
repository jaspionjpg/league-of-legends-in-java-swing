package telasJogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import utils.Constants;
import utils.Utils;

public class BarraFrag extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon BARRAFRAG = new ImageIcon( Constants.class.getResource("../Imagens/mapa/barraFrag.png"));
	
	int alt = 30;
	int lar = 370;
	
	JLabel imagemBarra;
	JLabel tempo;	
	JLabel iconeTempo;
	JLabel minions;
	JLabel iconeMinions;
	JLabel ama;
	JLabel iconeAma;
	JLabel scoreRed;
	JLabel vs;
	JLabel scoreBlue;
    
	Integer tempoEmExecucao = 0;
	final int DELAY = 1000;
    Timer timer;
	
	public BarraFrag() {
		inicializaComponents();
	}
	
	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		
        timer = new Timer(DELAY, this);
        timer.start();
		
		tempo = new JLabel("00:00");
		tempo.setBounds(lar-45, 3, 40, 20);
		tempo.setForeground(Color.WHITE);
		add(tempo);
		
		iconeTempo = new JLabel();
		iconeTempo.setBounds(lar-68, 4, 20, 20);
		iconeTempo.setIcon(new ImageIcon(Constants.RELOGIO.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT)));
		iconeTempo.setBackground(new Color(255,255,255,0));
		iconeTempo.setOpaque(false);
		add(iconeTempo);
		
		minions = new JLabel("0");
		minions.setBounds(lar-120, 3, 40, 20);
		minions.setForeground(Color.WHITE);
		add(minions);
		
		iconeMinions = new JLabel();
		iconeMinions.setBounds(lar-145, 6, 20, 20);
		iconeMinions.setIcon(new ImageIcon(Constants.FARME.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT)));
		iconeMinions.setBackground(new Color(255,255,255,0));
		iconeMinions.setOpaque(false);
		add(iconeMinions);

		ama = new JLabel("0/0/0");
		ama.setBounds(lar-230, 3, 60, 20);
		ama.setForeground(Color.WHITE);
		add(ama);
		
		iconeMinions = new JLabel();
		iconeMinions.setBounds(lar-250, 9, 20, 20);
		iconeMinions.setIcon(new ImageIcon(Constants.AMA.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT)));
		iconeMinions.setBackground(new Color(255,255,255,0));
		iconeMinions.setOpaque(false);
		add(iconeMinions);
		
		scoreRed = new JLabel("0");
		scoreRed.setBounds(lar-305, 3, 60, 20);
		scoreRed.setFont(new Font("arial",20,20));
		scoreRed.setForeground(Color.RED);
		add(scoreRed);
		
		vs = new JLabel("vs");
		vs.setBounds(lar-325, 3, 60, 20);
		vs.setForeground(Color.YELLOW);
		add(vs);
		
		scoreBlue = new JLabel("0");
		scoreBlue.setFont(new Font("arial",20,20));
		scoreBlue.setBounds(lar-395, 3, 60, 20);
		scoreBlue.setHorizontalAlignment(JLabel.RIGHT);
		scoreBlue.setForeground(Color.BLUE);
		add(scoreBlue);
		
		imagemBarra = new JLabel();
		imagemBarra.setSize(lar, alt);
		imagemBarra.setIcon(new ImageIcon(BARRAFRAG.getImage().getScaledInstance(lar, alt, Image.SCALE_DEFAULT)));
		add(imagemBarra);
		
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tempoEmExecucao++;
		tempo.setText(Utils.format(tempoEmExecucao / 60) + ":" + Utils.format(tempoEmExecucao % 60));
         // tempo.stop();
	}
}