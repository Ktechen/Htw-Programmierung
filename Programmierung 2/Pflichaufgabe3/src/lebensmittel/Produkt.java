package lebensmittel;

import java.util.GregorianCalendar;
import user.Person;

/**
 * @version 1.0
 * @author Kevin Techen
 *
 */
public class Produkt implements ILebensmittel {

	private Person person = null;

	public Person getPerson() {
		return person;
	}

	/**
	 * Names des Produktes
	 */
	private String nameOfProdukt;

	/**
	 * Anzahl der Produkt element
	 */
	private int anzahl;

	/**
	 * Ablaufdatum
	 */
	private GregorianCalendar date;

	/**
	 * Legt denn Ersteller, produktname, anzahl von Elemente und das Datum dazu
	 * fest.
	 * 
	 * @param name
	 * @param anzahl
	 * @param date
	 * @throws NullPointerException name, date or Nutzer is null
	 * @throws IllegalArgumentException anzahl < 0
	 */
	public Produkt(String nutzer, String nameOfProdukt, int anzahl, GregorianCalendar date) {

		if (nameOfProdukt == null) {
			throw new NullPointerException("Name is null");
		}

		if (date == null) {
			throw new NullPointerException("Date is null");
		}

		if (nutzer == null) {
			throw new NullPointerException("Nutzer is null");
		}

		if (anzahl < 0) {
			throw new IllegalArgumentException("Es können nicht weniger als 0 Items hinzufügt werden");
		}

		this.nameOfProdukt = nameOfProdukt;
		this.anzahl = anzahl;
		this.date = date;
		this.person = new Person(nutzer);
	}

	/**
	 * Lege denn Name die Anzahl und das Ablaufdatum des Produktes fest
	 * 
	 * @param name
	 * @param anzahl
	 * @param date
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public Produkt(String nameOfProdukt, int anzahl, GregorianCalendar date) {

		if (nameOfProdukt == null) {
			throw new NullPointerException("Name is null");
		}

		if (date == null) {
			throw new NullPointerException("Date is null");
		}

		if (anzahl < 0) {
			throw new IllegalArgumentException("Es können nicht weniger als 0 Items hinzufügt werden");
		}

		this.nameOfProdukt = nameOfProdukt;
		this.anzahl = anzahl;
		this.date = date;
	}

	/**
	 * Lege denn Name und die Anzahl fest aber ohne das Ablaufdatum
	 * 
	 * @param nameOfProdukt
	 * @param anzahl
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public Produkt(String nameOfProdukt, int anzahl) {

		if (nameOfProdukt == null) {
			throw new NullPointerException("Name is null");
		}

		if (anzahl < 0) {
			throw new IllegalArgumentException("Es können nicht weniger als 0 Items hinzufügt werden");
		}

		this.nameOfProdukt = nameOfProdukt;
		this.anzahl = anzahl;
	}
	
	/**
	 * Lege denn Name fest
	 * 
	 * @param nameOfProdukt
	 * @throws NullPointerException
	 */
	public Produkt(String nameOfProdukt) {

		if (nameOfProdukt == null) {
			throw new NullPointerException("Name is null");
		}

		this.nameOfProdukt = nameOfProdukt;
	}

	/**
	 * Default Constructor
	 */
	public Produkt() {
		this.nameOfProdukt = "Test Produkt";
		this.anzahl = 0;
		this.date = null;
	}

	@Override
	public String getName() {
		return nameOfProdukt;
	}

	/**
	 * Set Name of Produkt
	 * @param nameOfProdukt
	 * @throws NullPointerException
	 */
	public void setName(String nameOfProdukt) {
		
		if(nameOfProdukt == null) {
			throw new NullPointerException("nameOfProdukt is null");
		}
		
		this.nameOfProdukt = nameOfProdukt;
	}

	/**
	 * Get Date
	 * @return GregorianCalendar
	 * @throws NullPointerException
	 */
	public GregorianCalendar getDate() {
		return date;
	}

	/**
	 * Set Date
	 * @param date
	 * @throws NullPointerException
	 */
	public void setDate(GregorianCalendar date) {
		
		if (date == null) {
			throw new NullPointerException("date is null");
		}
		
		this.date = date;
	}

	/**
	 * Gibt die Anzahl wieder
	 * @return int
	 */
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * Set Anzahl
	 * @param anzahl
	 * @throws IllegalArgumentException
	 */
	public void setAnzahl(int anzahl) {
		
		if(anzahl > 0) {
			throw new IllegalArgumentException("Least is 1");
		}
		
		this.anzahl = anzahl;
	}

	@Override
	public GregorianCalendar getVerfallsDatum() throws NullPointerException {

		if (date == null) {
			throw new NullPointerException("Es wurde kein Datum gesetzt");
		}

		return getDate();
	}

	@Override
	public boolean istAbgelaufen(GregorianCalendar datum) throws NullPointerException {

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		if (datum.before(new GregorianCalendar())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		
		if (date == null && person == null && anzahl == 0) {
			return "name=" + nameOfProdukt;
		}

		if (date == null && person == null) {
			return "name=" + nameOfProdukt + " anzahl=" + anzahl;
		}

		String dateFormat = String.format("%tD", date);

		return "name=" + nameOfProdukt + " anzahl=" + anzahl + " Ablaufdatum=" + dateFormat + "]\n";

	}

}
