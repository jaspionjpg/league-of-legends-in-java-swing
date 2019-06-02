package telasCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Constants;

public class LoginJanela extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon IMAGEMFUNDO = new ImageIcon(Constants.class.getResource("../imagensCliente/fundoLogin.jpg"));
	public static final ImageIcon LOGO = new ImageIcon(Constants.class.getResource("../imagensCliente/logo.png"));
	
	int alt;
	int lar;
	
	JLabel logo;
	
	JLabel linhaVersao;

	JLabel textoLoguese;
	JLabel textoLogin;
	JLabel textoSenha;
	JLabel textoVersao;
	
	JTextField login;
	JTextField senha;
	
	JButton entrar;
	
	JButton minimizar;
	JButton fechar;
	
	JButton esqueciMeuNick;
	JButton esqueciMinhaSenha;
	JButton criarConta;
	
	JCheckBox lembrar;
	
	public LoginJanela() {
		inicializaTela();
		inicializaComponents();
		setVisible(true);
	}
	
	private void inicializaTela() {
		Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();  

		lar = (int) (tamTela.width * 0.8 * 0.2);  
		alt = (int) (tamTela.height * 0.8);
		
		setSize(lar, alt);
		setLayout(null);
		setFocusable(true);
		setBackground(new Color(0,10,19));
	}

	private void inicializaComponents() {
		logo = new JLabel();
		logo.setBounds((int) (lar * 0.1), 30, (int) (lar * 0.8), 60);
		logo.setIcon(new ImageIcon(LOGO.getImage().getScaledInstance((int) (lar*0.8), 60, Image.SCALE_DEFAULT)));
		logo.setBackground(new Color(255,255,255,0));
		logo.setOpaque(true);
		
		textoLoguese = new JLabel("Logue-se");
		textoLoguese.setFont(new Font("arial",16,16));
		textoLoguese.setForeground(Color.WHITE);
		textoLoguese.setBounds((int) (lar * 0.1), 100, (int) (lar * 0.8), 20);
		
		textoLogin = new JLabel("Login");
		textoLogin.setFont(new Font("arial",12,12));
		textoLogin.setForeground(Color.GRAY);
		textoLogin.setBounds((int) (lar * 0.1), 150, lar, 20);
		
		textoSenha = new JLabel("Senha");
		textoSenha.setFont(new Font("arial",12,12));
		textoSenha.setForeground(Color.GRAY);
		textoSenha.setBounds((int) (lar * 0.1), 210, lar, 20);
		
		textoVersao = new JLabel("v7.3.1");
		textoVersao.setFont(new Font("arial",12,12));
		textoVersao.setForeground(Color.GRAY);
		textoVersao.setBounds(0, alt-25, lar, 20);
		textoVersao.setHorizontalAlignment(JLabel.CENTER);
		
		linhaVersao = new JLabel();
		linhaVersao.setOpaque(true);
		linhaVersao.setBackground(Color.GRAY);
		linhaVersao.setBounds(0, alt-30, lar, 2);
		
		login = new JTextField();
		login.setBackground(Color.BLACK);
		login.setForeground(Color.GRAY);
		login.setBounds((int) (lar * 0.1), 173, (int) (lar * 0.8), 30);
		
		senha = new JTextField();
		senha.setBackground(Color.BLACK);
		senha.setForeground(Color.GRAY);
		senha.setBounds((int) (lar * 0.1), 233, (int) (lar * 0.8), 30);
		
		entrar = new JButton("Entrar");
		entrar.setBackground(Color.BLACK);
		entrar.setForeground(Color.GRAY);
		entrar.setBounds((int) (lar * 0.1), 350, (int) (lar * 0.8), 30);
		
		lembrar = new JCheckBox("Lembrar-me");
		lembrar.setForeground(Color.GRAY);
		lembrar.setBounds((int) (lar * 0.1), 270, (int) (lar * 0.8), 30);
		lembrar.setBackground(new Color(255,255,255,0));
		lembrar.setContentAreaFilled(false);
		
		minimizar = new JButton();
		minimizar.setBounds(lar - 45, 3, 20, 20);
		
		fechar = new JButton();
		fechar.setBounds(lar -23, 3, 20, 20);
		
		esqueciMeuNick = new JButton("Esqueci meu nick");
		esqueciMeuNick.setFont(new Font("arial",12,12));
		esqueciMeuNick.setForeground(Color.CYAN);
		esqueciMeuNick.setBounds(3, alt-105, lar-40, 20);
		esqueciMeuNick.setContentAreaFilled(false);
		esqueciMeuNick.setBorderPainted(false);
		esqueciMeuNick.setHorizontalAlignment(JLabel.LEFT);

		esqueciMinhaSenha= new JButton("Esqueci minha senha");
		esqueciMinhaSenha.setFont(new Font("arial",12,12));
		esqueciMinhaSenha.setForeground(Color.CYAN);
		esqueciMinhaSenha.setBounds(3, alt-85, lar-40, 20);
		esqueciMinhaSenha.setContentAreaFilled(false);
		esqueciMinhaSenha.setBorderPainted(false);
		esqueciMinhaSenha.setHorizontalAlignment(JLabel.LEFT);
		
		criarConta = new JButton("Criar conta");
		criarConta.setFont(new Font("arial",12,12));
		criarConta.setForeground(Color.CYAN);
		criarConta.setBounds(3, alt-65, lar, 20);
		criarConta.setContentAreaFilled(false);
		criarConta.setBorderPainted(false);
		criarConta.setHorizontalAlignment(JLabel.LEFT);
		
		add(textoLogin);
		add(textoSenha);
		add(login);
		add(senha);
		add(lembrar);
		add(entrar);
		add(fechar);
		add(minimizar);
		add(criarConta);
		add(esqueciMinhaSenha);
		add(esqueciMeuNick);
		add(linhaVersao);
		add(textoVersao);
		add(logo);
		add(textoLoguese);
	}
}