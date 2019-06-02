package model;

public class Login {
	private Long id;
	
	private String login;
	private String senha;
	
	private Integer tipoUsuario;

	private Jogador jogador;

	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
}
