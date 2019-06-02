package utils;

import javax.swing.ImageIcon;

public class Constants {
	private Constants() {
		throw new AssertionError();
	}

	public static final Integer ALTURAMAPA = 9800;
	public static final Integer LARGURAMAPA = 9800;
	
	public static final Integer MEIOBASEAZULX = 920;
	public static final Integer MEIOBASEAZULY = 9100;
	public static final Integer MEIOBASEVERMELHOX = 8940;
	public static final Integer MEIOBASEVERMELHOY = 1070;
	
	public static final ImageIcon RELOGIO = new ImageIcon( Constants.class.getResource("../Imagens/mapa/relogio.png"));
	public static final ImageIcon AMA = new ImageIcon( Constants.class.getResource("../Imagens/mapa/score.png"));
	public static final ImageIcon FARME = new ImageIcon( Constants.class.getResource("../Imagens/mapa/minion.png"));
}
