package kuehlschrank;

import java.util.GregorianCalendar;

import lebensmittel.ILebensmittel;
import user.INutzer;

public interface IKuehlschrank {

	/**
	 * liefert die Einstellung min. Anzahl eines Produktes
	 * 
	 * @param produkt
	 * @return int
	 * @throws NullPointerException
	 */
	public abstract int getMinAnzahl(String produkt) throws NullPointerException;

	/**
	 * setzt die Einstellung min. Anzhal eines Produktes auf n
	 * 
	 * @param produkt
	 * @param n
	 * @throws IllegalArgumentException
	 * @throws NullPointerException
	 */
	public abstract void setMinAnzahl(String produkt, int n) throws IllegalArgumentException, NullPointerException;

	/**
	 * liefert aktuelle Anzahl eines Produktes
	 * 
	 * @param produkt
	 * @return int
	 * @throws NullPointerException
	 */
	public abstract int getAnzahl(String produkt) throws NullPointerException;

	/**
	 * liefert true zurueck, wenn Produkt gekauft werden sollte, false sonst
	 * 
	 * @param produkt
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean zuKaufen(String produkt) throws NullPointerException;

	/**
	 * liefert true zurueck, wenn produkt an einem Datum gekauft werden sollte, weil
	 * es jetzt schon fehlt, oder vor diesem Datum ablaeuft, ansonsten false
	 * 
	 * @param produkt
	 * @param datum
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean zuKaufen(String produkt, GregorianCalendar datum) throws NullPointerException;

	/**
	 * liefert Anzahl der Produkte zurueck, die an einem Datum ablaufen
	 * 
	 * @param datum
	 * @return int
	 * @throws NullPointerException
	 */
	public abstract int getAbgelaufenAnzahl(GregorianCalendar datum) throws NullPointerException;

	/**
	 * liefert Anzahl der Produkte von einem Nutzer zurueck, die an einem Datum
	 * ablaufen
	 * 
	 * @param nutzer
	 * @param heute
	 * @return int
	 * @throws NullPointerException
	 */
	public abstract int getAbgelaufenAnzahl(INutzer nutzer, GregorianCalendar heute) throws NullPointerException;

	/**
	 * liefert Liste der Produkte zurueck, die an einem Datum ablaufen
	 * 
	 * @param datum
	 * @return ILebensmittel[]
	 * @throws NullPointerException
	 */
	public abstract ILebensmittel[] getAbgelaufenListe(GregorianCalendar datum) throws NullPointerException;

	/**
	 * liefert Liste der Produkte von einem Nutzer zurueck, die an einem Datum
	 * ablaufen
	 * 
	 * @param nutzer
	 * @param datum
	 * @return ILebensmittel[]
	 * @throws NullPointerException
	 */
	public abstract ILebensmittel[] getAbgelaufenListe(INutzer nutzer, GregorianCalendar datum) throws NullPointerException;

	/**
	 * Generiert personalisierte Einkaufsliste fuer einen Nutzer anhand der
	 * aktuellen Vorratslage
	 * 
	 * @param nutzer
	 * @return String[]
	 * @throws NullPointerException
	 */
	public abstract String[] generiereEinkaufsliste(INutzer nutzer) throws NullPointerException;

	/**
	 * generiert personalisierte Einkaufsliste fuer einen Nutzer fuer ein Datum
	 * anhand der aktuellen Vorratslage unter Beruecksichtigung der bis dahin
	 * ablaufenden Produkte
	 * 
	 * @param nutzer
	 * @param morgen
	 * @return String[]
	 * @throws NullPointerException
	 */
	public abstract String[] generiereEinkaufsliste(INutzer nutzer, GregorianCalendar morgen);

	/**
	 * gibt alle Eingeschaften (Inhalt und Einstellungen) des Kuhlschranks in einer
	 * lesbaren Form als String zurueck
	 * 
	 * @return String
	 */
	public abstract String toString();

}
