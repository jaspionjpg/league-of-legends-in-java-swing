package entidades;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import telasJogo.CimaCampeao;

public class CampeaoPartida extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final Integer NEXTLEVELS[] = {0, 100};
	
	private JLabel campeaoRosto;
	private Habilidade campeaoPassiva;
	private Habilidade campeaoQ;
	private Habilidade campeaoW;
	private Habilidade campeaoE;
	private Habilidade campeaoR;
	
	private JLabel campeao;
	// dados usuario
	private String nick;

	// dados partida
	private Integer abates;
	private Integer assistencias;
	private Integer mortes;
	private Integer farme;
	private Integer gold;
	private Integer experiencia;
	private Integer level;
	
	private Boolean timeAzul;
	
	// dados campeao
	private String nomeCampeao;

	private Integer lar;
	private Integer alt;
	
	// status
	private Double vidaAtual;
	private Double manaAtual;
	
	private Double mana;
	private Double vida;
	private Double tempoRecarga;
	private Double danoAtaque;
	private Double danoMagico;
	private Double armadura;
	private Double ataqueRange;
	private Double ataqueSpeed;
	private Double velocidadeMovimento;
	private Double critico;
	private Double manaRegen;
	private Double defesaMagica;
	private Double vidaRegen;
	private Double vidaRegenPorLvl;
	private Double manaRegenPorLvl;
	private Double vidaPorLvl;
	private Double manaPorLvl;
	private Double defesaMagicaPorLvl;
	private Double danoAtaquePorLvl;
	private Double danoMagicoPorLvl;
	private Double armaduraPorLvl;
	private Double ataqueSpeedPorLvl;
	private Double criticoPorLvl;
	
	private CimaCampeao cimaCampeao;
	
	public CampeaoPartida(String nick, Boolean timeAzul) {
		setLayout(null);
		setBackground(new Color(255,255,255,0));
	    setOpaque(false);
	    
		this.nick = nick;
		this.timeAzul = timeAzul;
		
		this.abates = 0;
		this.mortes = 0;
		this.assistencias = 0;
		this.farme = 0;
		this.gold = 500;
		this.experiencia = 0;
		this.level = 1;
		this.vidaAtual = 0d;
		this.manaAtual = 0d;
		
		this.mana = 0d;
		this.vida = 0d;
		this.tempoRecarga = 0d;
		this.danoAtaque = 0d;
		this.danoMagico = 0d;
		this.armadura = 0d;
		this.ataqueRange = 0d;
		this.velocidadeMovimento = 0d;
		this.ataqueSpeed = 0d;
		this.critico = 0d;
		this.manaRegen = 0d;
		this.defesaMagica = 0d;
		this.vidaRegen = 0d;
		this.vidaRegenPorLvl = 0d;
		this.manaRegenPorLvl = 0d;
		this.vidaPorLvl = 0d;
		this.manaPorLvl = 0d;
		this.defesaMagicaPorLvl = 0d;
		this.danoAtaquePorLvl = 0d;
		this.danoMagicoPorLvl = 0d;
		this.armaduraPorLvl = 0d;
		this.ataqueSpeedPorLvl = 0d;
		this.criticoPorLvl = 0d;
		
		cimaCampeao = new CimaCampeao(this);
		add(cimaCampeao);
	}
	
	private void newLevel() {
		vidaRegen += vidaRegenPorLvl;
		manaRegen += manaRegenPorLvl;
		vida += vidaPorLvl;
		mana += manaPorLvl;
		defesaMagica += defesaMagicaPorLvl;
		danoAtaque += danoAtaquePorLvl;
		armadura += armaduraPorLvl;
		ataqueSpeed += ataqueSpeedPorLvl;
		critico += criticoPorLvl;
	}
	
	public String getNick() {
		return nick;
	}

	public JLabel getCampeaoRosto() {
		return campeaoRosto;
	}

	public Habilidade getCampeaoPassiva() {
		return campeaoPassiva;
	}

	public Habilidade getCampeaoQ() {
		return campeaoQ;
	}

	public Habilidade getCampeaoW() {
		return campeaoW;
	}

	public Habilidade getCampeaoE() {
		return campeaoE;
	}

	public Habilidade getCampeaoR() {
		return campeaoR;
	}

	public JLabel getCampeao() {
		return campeao;
	}

	public Double getAtaqueSpeed() {
		return ataqueSpeed;
	}

	public CimaCampeao getCimaCampeao() {
		return cimaCampeao;
	}

	public Integer getAbates() {
		return abates;
	}

	public Integer getAssistencias() {
		return assistencias;
	}

	public Integer getMortes() {
		return mortes;
	}

	public Integer getFarme() {
		return farme;
	}

	public Integer getGold() {
		return gold;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public Integer getLevel() {
		return level;
	}

	public String getNomeCampeao() {
		return nomeCampeao;
	}

	public Double getMana() {
		return mana;
	}

	public Double getVida() {
		return vida;
	}

	public Double getTempoRecarga() {
		return tempoRecarga;
	}

	public Double getDanoAtaque() {
		return danoAtaque;
	}

	public Double getDanoMagico() {
		return danoMagico;
	}

	public Double getDanoMagicoPorLvl() {
		return danoMagicoPorLvl;
	}
	
	public Double getArmadura() {
		return armadura;
	}

	public Double getAtaqueRange() {
		return ataqueRange;
	}

	public Double getVelocidadeMovimento() {
		return velocidadeMovimento;
	}

	public Double getCritico() {
		return critico;
	}

	public Double getManaRegen() {
		return manaRegen;
	}

	public Double getDefesaMagica() {
		return defesaMagica;
	}

	public Double getVidaRegen() {
		return vidaRegen;
	}

	public Double getVidaRegenPorLvl() {
		return vidaRegenPorLvl;
	}

	public Double getManaRegenPorLvl() {
		return manaRegenPorLvl;
	}

	public Double getVidaPorLvl() {
		return vidaPorLvl;
	}

	public Double getManaPorLvl() {
		return manaPorLvl;
	}

	public Double getDefesaMagicaPorLvl() {
		return defesaMagicaPorLvl;
	}

	public Double getDanoAtaquePorLvl() {
		return danoAtaquePorLvl;
	}

	public Double getArmaduraPorLvl() {
		return armaduraPorLvl;
	}

	public Double getAtaqueSpeedPorLvl() {
		return ataqueSpeedPorLvl;
	}

	public Double getCriticoPorLvl() {
		return criticoPorLvl;
	}

	public Integer getLar() {
		return lar;
	}

	public Integer getAlt() {
		return alt;
	}

	public Double getVidaAtual() {
		return vidaAtual;
	}

	public Double getManaAtual() {
		return manaAtual;
	}
	
	public Boolean getTimeAzul() {
		return timeAzul;
	}

	public void edit(Image imagem){
		campeao.setIcon(new ImageIcon(imagem.getScaledInstance(getLar(), getAlt(), Image.SCALE_DEFAULT)));
	}

	public void setTimeAzul(Boolean timeAzul) {
		this.timeAzul = timeAzul;
	}

	public void setImagemCampeao(Image imagem) {
		campeao = new JLabel();
		campeao.setBounds((getWidth() - getLar())/2, 45, getLar(), getAlt());
		campeao.setIcon(new ImageIcon(imagem.getScaledInstance(getLar(), getAlt(), Image.SCALE_DEFAULT)));
		add(campeao);
	}
	
	public void setCampeaoRosto(Image imagem) {
		campeaoRosto = new JLabel();
		campeaoRosto.setSize(77, 77);
		campeaoRosto.setIcon(new ImageIcon(imagem.getScaledInstance(77, 77, Image.SCALE_DEFAULT)));
	}

	public void setCampeaoPassiva(Image imagem, String nome, String descricao) {
		campeaoPassiva = new Habilidade(imagem, nome, descricao, true);
	}

	public void setCampeaoQ(Image imagem, String nome, String descricao) {
		campeaoQ = new Habilidade(imagem, nome, descricao, false);
	}

	public void setCampeaoW(Image imagem, String nome, String descricao) {
		campeaoW = new Habilidade(imagem, nome, descricao, false);
	}

	public void setCampeaoE(Image imagem, String nome, String descricao) {
		campeaoE = new Habilidade(imagem, nome, descricao, false);
	}

	public void setCampeaoR(Image imagem, String nome, String descricao) {
		campeaoR = new Habilidade(imagem, nome, descricao, false);
	}

	public void setCimaCampeao(CimaCampeao cimaCampeao) {
		this.cimaCampeao = cimaCampeao;
	}
	
	public void setNomeCampeao(String nomeCampeao) {
		this.nomeCampeao = nomeCampeao;
	}

	public void setLar(Integer lar) {
		this.lar = lar;
	}

	public void setAlt(Integer alt) {
		this.alt = alt;
	}

	public void subtractMana(Double mana) {
		this.mana -= mana;
	}

	public void subtractVida(Double vida) {
		this.vida -= vida;
	}

	public void subtractDanoAtaque(Double danoAtaque) {
		this.danoAtaque -= danoAtaque;
	}
	
	public void subtractDanoMagico(Double danoMagico) {
		this.danoMagico += danoMagico;
	}

	public void subtractDanoMagicoPorLvl(Double danoMagicoPorLvl) {
		this.danoMagicoPorLvl += danoMagicoPorLvl;
	}

	public void subtractArmadura(Double armadura) {
		this.armadura -= armadura;
	}

	public void subtractAtaqueRange(Double ataqueRange) {
		this.ataqueRange -= ataqueRange;
	}

	public void subtractVelocidadeMovimento(Double velocidadeMovimento) {
		this.velocidadeMovimento -= velocidadeMovimento;
	}

	public void subtractCritico(Double critico) {
		this.critico -= critico;
	}

	public void subtractManaRegen(Double manaRegen) {
		this.manaRegen -= manaRegen;
	}

	public void subtractDefesaMagica(Double defesaMagica) {
		this.defesaMagica -= defesaMagica;
	}

	public void subtractVidaRegen(Double vidaRegen) {
		this.vidaRegen -= vidaRegen;
	}

	public void subtractVidaRegenPorLvl(Double vidaRegenPorLvl) {
		this.vidaRegenPorLvl -= vidaRegenPorLvl;
	}

	public void subtractManaRegenPorLvl(Double manaRegenPorLvl) {
		this.manaRegenPorLvl -= manaRegenPorLvl;
	}

	public void subtractVidaPorLvl(Double vidaPorLvl) {
		this.vidaPorLvl -= vidaPorLvl;
	}
	
	public void subtractTempoRecarga(Double tempoRecarga) {
		this.tempoRecarga -= tempoRecarga;
	}

	public void subtractManaPorLvl(Double manaPorLvl) {
		this.manaPorLvl -= manaPorLvl;
	}

	public void subtractDefesaMagicaPorLvl(Double defesaMagicaPorLvl) {
		this.defesaMagicaPorLvl -= defesaMagicaPorLvl;
	}

	public void subtractDanoAtaquePorLvl(Double danoAtaquePorLvl) {
		this.danoAtaquePorLvl -= danoAtaquePorLvl;
	}

	public void subtractArmaduraPorLvl(Double armaduraPorLvl) {
		this.armaduraPorLvl -= armaduraPorLvl;
	}

	public void subtractAtaqueSpeedPorLvl(Double ataqueSpeedPorLvl) {
		this.ataqueSpeedPorLvl -= ataqueSpeedPorLvl;
	}

	public void subtractCriticoPorLvl(Double criticoPorLvl) {
		this.criticoPorLvl -= criticoPorLvl;
	}
	
	public void subtractVidaAtual(Double vidaAtual) {
		this.vidaAtual -= vidaAtual;
	}

	public void subtractManaAtual(Double manaAtual) {
		this.manaAtual -= manaAtual;
	}
	
	public void subtractAtaqueSpeed(Double ataqueSpeed) {
		this.ataqueSpeed -= ataqueSpeed;
	}

	public void addAbates(Integer abates) {
		this.abates += abates;
	}

	public void addAssistencias(Integer assistencias) {
		this.assistencias += assistencias;
	}

	public void addMortes(Integer mortes) {
		this.mortes += mortes;
	}

	public void addFarme(Integer farme) {
		this.farme += farme;
	}

	public void addGold(Integer gold) {
		this.gold += gold;
	}

	public void addExperiencia(Integer experiencia) {
		this.experiencia += experiencia;
		if(experiencia >= NEXTLEVELS[level]){
			addLevel(1);
		}
	}

	private void addLevel(Integer level) {
		this.level += level;
		newLevel();
	}

	public void addMana(Double mana) {
		this.mana += mana;
	}

	public void addVida(Double vida) {
		this.vida += vida;
		this.vidaAtual += vida;
	}

	public void addDanoAtaque(Double danoAtaque) {
		this.danoAtaque += danoAtaque;
	}

	public void addArmadura(Double armadura) {
		this.armadura += armadura;
	}

	public void addAtaqueRange(Double ataqueRange) {
		this.ataqueRange += ataqueRange;
	}

	public void addVelocidadeMovimento(Double velocidadeMovimento) {
		this.velocidadeMovimento += velocidadeMovimento;
	}

	public void addCritico(Double critico) {
		this.critico += critico;
	}

	public void addManaRegen(Double manaRegen) {
		this.manaRegen += manaRegen;
	}

	public void addDefesaMagica(Double defesaMagica) {
		this.defesaMagica += defesaMagica;
	}

	public void addVidaRegen(Double vidaRegen) {
		this.vidaRegen += vidaRegen;
	}

	public void addVidaRegenPorLvl(Double vidaRegenPorLvl) {
		this.vidaRegenPorLvl += vidaRegenPorLvl;
	}

	public void addManaRegenPorLvl(Double manaRegenPorLvl) {
		this.manaRegenPorLvl += manaRegenPorLvl;
	}

	public void addVidaPorLvl(Double vidaPorLvl) {
		this.vidaPorLvl += vidaPorLvl;
	}

	public void addManaPorLvl(Double manaPorLvl) {
		this.manaPorLvl += manaPorLvl;
	}

	public void addDefesaMagicaPorLvl(Double defesaMagicaPorLvl) {
		this.defesaMagicaPorLvl += defesaMagicaPorLvl;
	}

	public void addDanoAtaquePorLvl(Double danoAtaquePorLvl) {
		this.danoAtaquePorLvl += danoAtaquePorLvl;
	}

	public void addArmaduraPorLvl(Double armaduraPorLvl) {
		this.armaduraPorLvl += armaduraPorLvl;
	}

	public void addAtaqueSpeedPorLvl(Double ataqueSpeedPorLvl) {
		this.ataqueSpeedPorLvl += ataqueSpeedPorLvl;
	}

	public void addCriticoPorLvl(Double criticoPorLvl) {
		this.criticoPorLvl += criticoPorLvl;
	}

	public void addVidaAtual(Double vidaAtual) {
		if(this.vidaAtual + vidaAtual <= vida){
			this.vidaAtual += vidaAtual;
		} else {
			this.vidaAtual = this.vida;
		}
	}

	public void addManaAtual(Double manaAtual) {
		if(this.manaAtual + manaAtual <= mana){
			this.manaAtual += manaAtual;
		} else {
			this.manaAtual = this.mana;
		}
	}
	
	public void addAtaqueSpeed(Double ataqueSpeed) {
		this.ataqueSpeed += ataqueSpeed;
	}

	public void addDanoMagico(Double danoMagico) {
		this.danoMagico += danoMagico;
	}

	public void addDanoMagicoPorLvl(Double danoMagicoPorLvl) {
		this.danoMagicoPorLvl += danoMagicoPorLvl;
	}

	public void addTempoRecarga(Double tempoRecarga) {
		this.tempoRecarga += tempoRecarga;
	}
	
	//METODOS HERDADOS
	///////////////////////////////////////////////////
	public void andar(int x, int y) {
	}
	
	public void usarQ() {
	}

	public void usarW() {
	}

	public void usarE() {
	}

	public void usarR() {
	}
	
	public void recall() {
	}
	
	//METODOS IMPLEMENTADOS
	///////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(campeaoQ)){
			usarQ();
		} else if(e.getSource().equals(campeaoW)){
			usarW();
		} else if(e.getSource().equals(campeaoE)){
			usarE();
		} else if(e.getSource().equals(campeaoR)){
			usarR();
		}
	}
}