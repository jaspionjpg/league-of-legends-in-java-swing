package model;

public class CampeaoJogador {
	private Long id;
	
	private Integer maestria;
	private Integer expMaestria;

	private Boolean comprado;
	
	private Jogador jogador;
	private Campeao campeao;

	public Long getId() {
		return id;
	}
	
	public Integer getMaestria() {
		return maestria;
	}
	
	public Integer getExpMaestria() {
		return expMaestria;
	}
	
	public Boolean getComprado() {
		return comprado;
	}
	
	public Jogador getJogador() {
		return jogador;
	}
	
	public Campeao getCampeao() {
		return campeao;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setMaestria(Integer maestria) {
		this.maestria = maestria;
	}
	
	public void setExpMaestria(Integer expMaestria) {
		this.expMaestria = expMaestria;
	}
	
	public void setComprado(Boolean comprado) {
		this.comprado = comprado;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}
}