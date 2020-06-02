package intelligent.Lebensmittel;

import java.util.GregorianCalendar;

public class Produkt implements ILebensmittel {

	private String nameOfProdukt;
	private int anzahl;
	private GregorianCalendar date;

	/**
	 * Lege denn Name die Anzahl und das Ablaufdatum des Produktes fest
	 * 
	 * @param name
	 * @param anzahl
	 * @param date
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

	public Produkt() {
		this.nameOfProdukt = "Test Produkt";
		this.anzahl = 1;
		this.date = new GregorianCalendar(2020, 11, 25);
	}

	@Override
	public String getName() {
		return nameOfProdukt;
	}

	public void setName(String nameOfProdukt) {
		this.nameOfProdukt = nameOfProdukt;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	@Override
	public GregorianCalendar getVerfallsDatum() throws NullPointerException {

		if (date == null) {
			throw new NullPointerException("Date is null oder es wurde kein Datum gesetzt");
		}

		return null;
	}

	@Override
	public boolean istAbgelaufen(GregorianCalendar datum) throws NullPointerException {

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		if (datum.after(new GregorianCalendar().getTime())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {

		if (date == null) {
			return "Produkt [name=" + nameOfProdukt + " minAnzahl=" + anzahl + "]";
		}

		return "Produkt [name=" + nameOfProdukt + " anzahl=" + anzahl + " date=" + date + "]\n";
	}

}
