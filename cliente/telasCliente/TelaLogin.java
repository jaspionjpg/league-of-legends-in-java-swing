package telasCliente;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import utils.Constants;

public class TelaLogin extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon IMAGEMFUNDO = new ImageIcon(Constants.class.getResource("../imagensCliente/fundoLogin.jpg"));
	public static final ImageIcon LOGORIOT = new ImageIcon(Constants.class.getResource("../imagensCliente/logoriot.png"));
	
	int alt;
	int lar;
	
	JLabel imagemFundo;
	JLabel logoRito;
	LoginJanela login;
	public TelaLogin() {
		inicializaTela();
		inicializaComponents();
		setVisible(true);
	}
	
	private void inicializaTela() {
		Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();  

		lar = (int) (tamTela.width * 0.8);  
		alt = (int) (tamTela.height * 0.8);
		
		setSize(lar, alt);
		setUndecorated(true);
		setLayout(null);
		setFocusable(true);
		setLocationRelativeTo(null);
	}

	private void inicializaComponents() {
		imagemFundo = new JLabel();
		imagemFundo.setSize((int) (lar*0.8), alt);
		imagemFundo.setIcon(new ImageIcon(IMAGEMFUNDO.getImage().getScaledInstance((int) (lar*0.8), alt, Image.SCALE_DEFAULT)));
		
		logoRito = new JLabel();
		logoRito.setBounds(20, alt-90, 70, 70);
		logoRito.setIcon(new ImageIcon(LOGORIOT.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
		
		login = new LoginJanela();
		login.setLocation((int) (lar*0.8), 0);
		//login.criarConta.addActionListener(this);
		//login.esqueciMinhaSenha.addActionListener(this);
		//login.esqueciMeuNick.addActionListener(this);
		login.fechar.addActionListener(this);
		login.minimizar.addActionListener(this);
		login.entrar.addActionListener(this);
		
		add(login);
		add(logoRito);
		add(imagemFundo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(login.fechar)){
			System.exit(1);
		} else if (e.getSource().equals(login.minimizar)){
			setExtendedState(JFrame.ICONIFIED);
		} else if(e.getSource().equals(login.entrar)){
			new Cliente();
			setVisible(false);
			setIgnoreRepaint(true);
		}
	}
}
