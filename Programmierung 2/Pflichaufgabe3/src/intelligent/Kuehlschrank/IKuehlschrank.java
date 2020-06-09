package intelligent.Kuehlschrank;

import java.util.GregorianCalendar;

import intelligent.Lebensmittel.ILebensmittel;
import user.INutzer;

public interface IKuehlschrank {

	/**
	 * liefert die Einstellung min. Anzahl eines Produktes
	 * 
	 * @param produkt
	 * @return
	 */
	public abstract int getMinAnzahl(String produkt);

	/**
	 * setzt die Einstellung min. Anzhal eines Produktes auf n
	 * 
	 * @param produkt
	 * @param n
	 * @throws IllegalArgumentException
	 */
	public abstract void setMinAnzahl(String produkt, int n) throws IllegalArgumentException;

	/**
	 * liefert aktuelle Anzahl eines Produktes
	 * 
	 * @param produkt
	 * @return
	 */
	public abstract int getAnzahl(String produkt);

	/**
	 * liefert true zurueck, wenn Produkt gekauft werden sollte, false sonst
	 * 
	 * @param produkt
	 * @return
	 */
	public abstract boolean zuKaufen(String produkt);

	/**
	 * liefert true zurueck, wenn produkt an einem Datum gekauft werden sollte, weil
	 * es jetzt schon fehlt, oder vor diesem Datum ablaeuft, ansonsten false
	 * 
	 * @param produkt
	 * @param datum
	 * @return
	 */
	public abstract boolean zuKaufen(String produkt, GregorianCalendar datum);

	/**
	 * liefert Anzahl der Produkte zurueck, die an einem Datum ablaufen
	 * 
	 * @param datum
	 * @return
	 */
	public abstract int getAbgelaufenAnzahl(GregorianCalendar datum);

	/**
	 * liefert Anzahl der Produkte von einem Nutzer zurueck, die an einem Datum
	 * ablaufen
	 * 
	 * @param nutzer
	 * @param heute
	 * @return
	 */
	public abstract int getAbgelaufenAnzahl(INutzer nutzer, GregorianCalendar heute);

	/**
	 * liefert Liste der Produkte zurueck, die an einem Datum ablaufen
	 * 
	 * @param datum
	 * @return
	 */
	public abstract ILebensmittel[] getAbgelaufenListe(GregorianCalendar datum);

	/**
	 * liefert Liste der Produkte von einem Nutzer zurueck, die an einem Datum
	 * ablaufen
	 * 
	 * @param nutzer
	 * @param datum
	 * @return
	 */
	public abstract ILebensmittel[] getAbgelaufenListe(INutzer nutzer, GregorianCalendar datum);

	/**
	 * generiert personalisierte Einkaufsliste fuer einen Nutzer anhand der
	 * aktuellen Vorratslage
	 * 
	 * @param nutzer
	 * @return
	 */
	public abstract String[] generiereEinkaufsliste(INutzer nutzer);

	/**
	 * generiert personalisierte Einkaufsliste fuer einen Nutzer fuer ein Datum
	 * anhand der aktuellen Vorratslage unter Beruecksichtigung der bis dahin
	 * ablaufenden Produkte
	 * 
	 * @param nutzer
	 * @param morgen
	 * @return
	 */
	public abstract String[] generiereEinkaufsliste(INutzer nutzer, GregorianCalendar morgen);

	/**
	 *  gibt alle Eingeschaften (Inhalt und Einstellungen) des Kuhlschranks in einer lesbaren Form als String zurueck
	 * @return
	 */ 
	public abstract String toString();

}
