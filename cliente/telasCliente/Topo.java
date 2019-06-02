package telasCliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Constants;

public class Topo extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon RP = new ImageIcon(Constants.class.getResource("../imagensCliente/rp.png"));
	public static final ImageIcon IP = new ImageIcon(Constants.class.getResource("../imagensCliente/score.png"));
	
	int alt;
	int lar;
	
	JButton jogar;
	BotaoTopo inicio;
	BotaoTopo perfil;
	BotaoTopo colecao;
	BotaoTopo loja;
	BotaoTopo informacao;
	
	JLabel rp;
	JLabel ip;
	JLabel valorrp;
	JLabel valorip;

	public Topo(int lar, int alt) {
		this.lar = (int) (lar * 0.8);
		this.alt = (int) (alt * 0.12);
		inicializaComponents();
		setVisible(true);
	}

	private void inicializaComponents() {
		setSize(lar, alt);
		setLayout(null);
		setBackground(new Color(255,255,255,0));
        setOpaque(false);
		
        jogar = new JButton("Jogar");
		jogar.setBackground(Color.BLACK);
		jogar.setForeground(Color.GRAY);
		jogar.setBounds(40, (alt-40)/2, 170, 40);
		
		inicio = new BotaoTopo("INICIO", 80, alt);
		inicio.setLocation(240, 0);
		
		perfil = new BotaoTopo("PERFIL", 80, alt);
		perfil.setLocation(350, 0);
		
		colecao = new BotaoTopo("COLEÇÃO", 100, alt);
		colecao.setLocation(460, 0);
		
		loja = new BotaoTopo("LOJA", 70, alt);
		loja.setLocation(590, 0);
		
		rp = new JLabel();
		rp.setSize(20, 20);
		rp.setLocation(770, alt/2-10);
		rp.setIcon(new ImageIcon(RP.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		
		ip = new JLabel();
		ip.setSize(20, 20);
		ip.setLocation(850, alt/2-6);
		ip.setIcon(new ImageIcon(IP.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT)));

		valorrp = new JLabel("86");
		valorrp.setSize(150, 20);
		valorrp.setLocation(795, alt/2-10);
		valorrp.setForeground(Color.GRAY);
		valorrp.setFont(new Font("liberation serif",14,14));
		
		valorip = new JLabel("4062");
		valorip.setSize(150, 20);
		valorip.setLocation(870, alt/2-10);
		valorip.setForeground(Color.GRAY);
		valorip.setFont(new Font("liberation serif",14,14));
//		informacao = new BotaoTopo("INICIO", 80, alt);
		
		add(jogar);
		add(inicio);
		add(perfil);
		add(colecao);
		add(loja);
		
		add(rp);
		add(ip);
		add(valorrp);
		add(valorip);
//		add(informacao);
	}
}