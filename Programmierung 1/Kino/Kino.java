package OPP.Kino;

public class Kino {
	
	public Kino() {
		
	}
	
	private int saalNumber;
	private int anzahlDerSitzplatze;
	private static int anzahlKinoSaale;
	private static int anzahlSitzplatzImKino;
	
	public int getSaalNumber() {
		return saalNumber;
	}
	public void setSaalNumber(int saalNumber) {
		this.saalNumber = saalNumber;
	}
	public int getAnzahlDerSitzplatze() {
		return anzahlDerSitzplatze;
	}
	public void setAnzahlDerSitzplatze(int anzahlDerSitzplatze) {
		this.anzahlDerSitzplatze = anzahlDerSitzplatze;
	}
	public static int getAnzahlKinoSaale() {
		return anzahlKinoSaale;
	}
	public static void setAnzahlKinoSaale(int anzahlKinoSaale) {
		Kino.anzahlKinoSaale = anzahlKinoSaale;
	}
	public static int getAnzahlSitzplatzImKino() {
		return anzahlSitzplatzImKino;
	}
	public static void setAnzahlSitzplatzImKino(int anzahlSitzplatzImKino) {
		Kino.anzahlSitzplatzImKino = anzahlSitzplatzImKino;
	}
}
