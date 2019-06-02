package telasJogo;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import entidades.CampeaoPartida;
import utils.MinhaProgressBar;

public class CimaCampeao extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int lar = 140;
	int alt = 60;
	private int repeticoes = 0;
	
	private CampeaoPartida campeao;
	
	private JLabel nick;
	private JLabel level;
	private JLabel quadrado;
	private MinhaProgressBar progressVida;
	private MinhaProgressBar progressMana;
	
	private Timer timer;
	
	public CimaCampeao(CampeaoPartida campeao) {
		setSize(lar, alt);
		setLayout(null);
		
		this.campeao = campeao;
		
		nick = new JLabel(campeao.getNick()+"");
		nick.setBounds((lar - 6 * campeao.getNick().length())/2, 0, 140, 15);
		nick.setForeground(Color.WHITE);
		add(nick);
		
		level = new JLabel(campeao.getLevel()+"");
		level.setBounds(5, 23, 15, 15);
		add(level);
		
		quadrado = new JLabel();
		quadrado.setBounds(0, 18, 25, 25);
		quadrado.setOpaque(true);
		quadrado.setBackground(Color.white);
		add(quadrado);
		
		progressVida = new MinhaProgressBar(140, 15, 0d, true, Color.GREEN, "");
		progressVida.setLocation(25, 18);
		add(progressVida);
		
		progressMana = new MinhaProgressBar(140, 7, 0d, true, Color.BLUE, "");
		progressMana.setLocation(25, 33);
		add(progressMana);
		
		timer = new Timer(100, this);
	    timer.start();
	    
	    setBackground(new Color(255,255,255,0));
        setOpaque(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repeticoes++;
		if(repeticoes == 10){
			campeao.addVidaAtual(campeao.getVidaRegen());
			campeao.addManaAtual(campeao.getManaRegen());
			repeticoes = 0;
		}
		
		level.setText(campeao.getLevel()+"");
		progressVida.atualiza(campeao.getVidaAtual()/campeao.getVida() * 100, "", true);
		progressMana.atualiza(campeao.getManaAtual()/campeao.getMana() * 100, "", true);
	
	    Toolkit.getDefaultToolkit().sync();
	}
}
