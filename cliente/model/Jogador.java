package model;

import java.util.Date;
import java.util.List;

public class Jogador {
	Long id;
	
	String nick;
	
	Integer ip;
	Integer rp;
	Integer level;
	
	Date dataCadastro;
	
	IconeDeInvocador icone;
	
	List<Amigo> amigos;
	List<Campeao> campeoes;
	
	public Long getId() {
		return id;
	}
	
	public String getNick() {
		return nick;
	}
	
	public Integer getIp() {
		return ip;
	}
	
	public Integer getRp() {
		return rp;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public IconeDeInvocador getIcone() {
		return icone;
	}
	
	public List<Amigo> getAmigos() {
		return amigos;
	}
	
	public List<Campeao> getCampeoes() {
		return campeoes;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public void setIp(Integer ip) {
		this.ip = ip;
	}
	
	public void setRp(Integer rp) {
		this.rp = rp;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void setIcone(IconeDeInvocador icone) {
		this.icone = icone;
	}
	
	public void setAmigos(List<Amigo> amigos) {
		this.amigos = amigos;
	}
	
	public void setCampeoes(List<Campeao> campeoes) {
		this.campeoes = campeoes;
	}
}