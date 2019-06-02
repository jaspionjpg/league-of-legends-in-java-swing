package model;

public class SolicitacaoAmizade {
	Long id;
	
	Jogador jogadorSolicitante;
	Jogador jogadorSolicitado;
	
	public Long getId() {
		return id;
	}
	
	public Jogador getJogadorSolicitante() {
		return jogadorSolicitante;
	}
	
	public Jogador getJogadorSolicitado() {
		return jogadorSolicitado;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setJogadorSolicitante(Jogador jogadorSolicitante) {
		this.jogadorSolicitante = jogadorSolicitante;
	}
	
	public void setJogadorSolicitado(Jogador jogadorSolicitado) {
		this.jogadorSolicitado = jogadorSolicitado;
	}
}