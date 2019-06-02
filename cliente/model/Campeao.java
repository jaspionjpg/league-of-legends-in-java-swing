package model;

public class Campeao {
	private Long id;
	private Integer idRito;
	
	String imagem;
	String imagemFundo;
	
	private String nome;
	private String chave;
	private String titulo;
	private String descricao;
	private String dicasContra; 
	private String dicasCom; 
	private String tipos; 

	private Integer dificuldade;
	private Integer ataque;
	private Integer defesa;
	private Integer magia;

	public Long getId() {
		return id;
	}

	public Integer getIdRito() {
		return idRito;
	}

	public String getImagem() {
		return imagem;
	}

	public String getImagemFundo() {
		return imagemFundo;
	}

	public String getNome() {
		return nome;
	}

	public String getChave() {
		return chave;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDicasContra() {
		return dicasContra;
	}

	public String getDicasCom() {
		return dicasCom;
	}

	public String getTipos() {
		return tipos;
	}

	public Integer getDificuldade() {
		return dificuldade;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public Integer getMagia() {
		return magia;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdRito(Integer idRito) {
		this.idRito = idRito;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public void setImagemFundo(String imagemFundo) {
		this.imagemFundo = imagemFundo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDicasContra(String dicasContra) {
		this.dicasContra = dicasContra;
	}

	public void setDicasCom(String dicasCom) {
		this.dicasCom = dicasCom;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public void setMagia(Integer magia) {
		this.magia = magia;
	}
}
