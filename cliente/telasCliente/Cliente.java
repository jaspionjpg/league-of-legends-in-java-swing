package telasCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import telasJogo.Jogo;
import utils.Constants;

public class Cliente extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final ImageIcon IMAGEMFUNDO = new ImageIcon(Constants.class.getResource("../imagensCliente/fundoCliente.jpg"));
	
	int alt;
	int lar;
	
	Topo topo;
	Messenger messenger;
	JLabel imagemFundo;
	JLabel linha;
	public Cliente() {
		inicializaTela();
		inicializaComponents();
		setVisible(true);
	}
	
	private void inicializaTela() {
		Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();  

		lar = (int) (tamTela.width * 0.9);  
		alt = (int) (tamTela.height * 0.9);
		
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
		
		topo = new Topo(lar, alt);
		topo.jogar.addActionListener(this);
		topo.inicio.addActionListener(this);
		topo.perfil.addActionListener(this);
		topo.colecao.addActionListener(this);
		topo.loja.addActionListener(this);
		
		messenger = new Messenger(lar, alt);		
		messenger.fechar.addActionListener(this);
		messenger.minimizar.addActionListener(this);
		messenger.setLocation((int) (lar*0.8), 0);
		
		linha = new JLabel();
		linha.setOpaque(true);
		linha.setBackground(Color.GRAY);
		linha.setBounds(0, topo.alt, lar, 1);
		
		add(linha);
		add(topo);
		add(messenger);
		add(imagemFundo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(messenger.fechar)){
			System.exit(1);
		} else if (e.getSource().equals(messenger.minimizar)){
			setExtendedState(JFrame.ICONIFIED);
		}
		
		if(e.getSource().equals(topo.jogar)){
			new Jogo();
			setVisible(false);
			setIgnoreRepaint(true);
		} else if (e.getSource().equals(topo.inicio)){
			topo.inicio.ativa();
			desativaOutros(topo.inicio);
		} else if (e.getSource().equals(topo.perfil)){
			topo.perfil.ativa();
			desativaOutros(topo.perfil);
		} else if (e.getSource().equals(topo.colecao)){
			topo.colecao.ativa();
			desativaOutros(topo.colecao);
		} else if (e.getSource().equals(topo.loja)){
			topo.loja.ativa();
			desativaOutros(topo.loja);
		}
	}
	
	private void desativaOutros(BotaoTopo botao) {
		if(topo.inicio.ativado && !botao.equals(topo.inicio)){
			topo.inicio.ativa();
		}
		if(topo.perfil.ativado && !botao.equals(topo.perfil)){
			topo.perfil.ativa();
		}
		if(topo.colecao.ativado && !botao.equals(topo.colecao)){
			topo.colecao.ativa();
		}
		if(topo.loja.ativado && !botao.equals(topo.loja)){
			topo.loja.ativa();
		}
	}
}