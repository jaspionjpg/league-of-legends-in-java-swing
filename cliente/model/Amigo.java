package model;

public class Amigo {
	private Long id;
	
	private Jogador jogador1;
	private Jogador jogador2;
	
	public Long getId() {
		return id;
	}
	
	public Jogador getJogador1() {
		return jogador1;
	}
	
	public Jogador getJogador2() {
		return jogador2;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}
	
	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
}
