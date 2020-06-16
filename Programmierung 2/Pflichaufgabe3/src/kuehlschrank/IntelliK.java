package kuehlschrank;

import java.util.Arrays;
import java.util.GregorianCalendar;
import arrayOption.Option;

import lebensmittel.ILebensmittel;
import lebensmittel.Produkt;
import user.INutzer;
import user.Person;

/**
 * @version 1.0
 * @author Kevin Techen
 *
 */
public class IntelliK extends Kuehlschrank implements IKuehlschrank {

	private Person msg = new Person();

	/**
	 * Erstellen ein Objekt IntelliK
	 */
	public IntelliK() {
		super();
	}

	/**
	 * Erstellen ein Objekt IntelliK und legt neue minProdukt fest
	 * 
	 * @z.B Beispiel IntelliK intelliK = new IntelliK(new Produkt[] { new
	 *      Produkt("Milch", 5) });
	 * 
	 * @param minProduct (new Produkt("Milch", 5))
	 * @throws NullPointerException
	 */
	public IntelliK(Produkt[] minProduct) {
		super(minProduct);

		if (minProduct == null) {
			throw new NullPointerException("minProduct value is null");
		}
	}

	/**
	 * Erstellen ein Objekt IntelliK und legt neue minProdukt und myProdukt fest
	 * 
	 * @z.B Beispiel IntelliK intelliK = @ new IntelliK(new Produkt[] { new
	 *      Produkt("Milch", 5) }, @ new Produkt[] { new Produkt("Milch", 5, new
	 *      GregorianCalendar()) });
	 * 
	 * @param minProduct (new Produkt("Milch", 5))
	 * @throws NullPointerException
	 */
	public IntelliK(Produkt[] minProduct, Produkt[] myProducts) {
		super(minProduct, myProducts);

		if (minProduct == null) {
			throw new NullPointerException("minProduct value is null");
		}

		if (myProducts == null) {
			throw new NullPointerException("myProducts value is null");
		}
	}

	@Override
	public int getMinAnzahl(String produkt) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("Produkt value is null");
		}

		int value = 0;

		for (int i = 0; i < getMinProduct().length; i++) {

			String name = getMinProduct()[i].getName().toLowerCase();

			if (name.compareTo(produkt.toLowerCase()) == 0) {
				value = getMinProduct()[i].getAnzahl();
			}
		}

		return value;
	}

	@Override
	public void setMinAnzahl(String produkt, int n) throws IllegalArgumentException, NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		if (n < 0) {
			throw new IllegalArgumentException("min is 0");
		}

		Produkt[] min = null;

		if (getMinProduct() == null) {
			min = getMinProduct();
			min = new Produkt[1];
			min[0] = new Produkt(produkt, n);
			setMinProduct(min);

		} else {

			boolean founded = false;
			min = getMinProduct();

			for (int i = 0; i < getMinProduct().length; i++) {
				String name = getMinProduct()[i].getName();

				if (name.toLowerCase().compareTo(produkt.toLowerCase()) == 0) {

					min[i] = new Produkt(produkt, n);
					setMinProduct(min);
					founded = true;
				}
			}

			/*
			 * If not found at elem pos + 1
			 */
			if (!founded) {
				min = Arrays.copyOf(getMinProduct(), getMinProduct().length + 1);
				min[min.length - 1] = new Produkt(produkt, n);
				setMinProduct(min);
			}

		}

	}

	@Override
	public void add(String produkt, int n, GregorianCalendar datum)
			throws NullPointerException, IllegalArgumentException {

		if (produkt == null || datum == null) {
			throw new NullPointerException("productname or date is null");
		}

		if (n <= 0) {
			throw new IllegalArgumentException("min ist kleiner oder gleich 0");
		}

		Produkt[] my = null;

		if (getMyProducts() == null) {
			my = new Produkt[1];
			my[0] = new Produkt(produkt, n, datum);
			setMyProducts(my);

		} else {

			// TODO Prüft von Äquivalenzen überschreibungen

			my = getMyProducts();

			my = Arrays.copyOf(getMyProducts(), getMyProducts().length + 1);
			my[my.length - 1] = new Produkt(produkt, n, datum);

			setMyProducts(my);

		}
	}

	@Override
	public void add(String nutzer, String produkt, int n, GregorianCalendar datum)
			throws NullPointerException, IllegalArgumentException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		if (datum == null) {
			throw new NullPointerException("date is null");
		}

		if (nutzer == null) {
			throw new NullPointerException("nutzer is null");
		}

		if (n <= 0) {
			throw new IllegalArgumentException("min ist kleiner oder gleich 0");
		}

		Produkt[] my = null;

		if (getMyProducts() == null) {
			my = new Produkt[1];
			my[0] = new Produkt(nutzer, produkt, n, datum);
			setMyProducts(my);

		} else {

			my = getMyProducts();

			int checkEqual = 0;
			boolean founded = false;

			/*
			 * Suchen ob der Benutzername, produkt und das Datum gleich ist
			 */
			for (int i = 0; i < my.length; i++) {

				String proName = my[i].getName().toLowerCase();

				if (proName.compareTo(produkt.toLowerCase()) == 0) {

					if (my[i].getPerson() != null) {

						String name = my[i].getPerson().getUsername().toLowerCase();

						if (name.compareTo(nutzer.toLowerCase()) == 0) {

							GregorianCalendar date = my[i].getDate();

							if (date.compareTo(datum) == 0) {

								int value = my[i].getAnzahl();
								int[] equalValues = null;

								if (checkEqual > 0) {
									equalValues = Arrays.copyOf(equalValues, equalValues.length + 1);
									equalValues[checkEqual] = value;

								} else {
									equalValues = new int[1];
									equalValues[checkEqual] = value;
								}

								for (int j = 0; j < equalValues.length; j++) {
									n += equalValues[i];
								}

								my[i] = new Produkt(nutzer, produkt, n, datum);

								checkEqual++;
								founded = true;
								setMyProducts(my);
							}
						}
					}
				}
			}

			if (!founded) {
				my = Arrays.copyOf(getMyProducts(), getMyProducts().length + 1);
				my[my.length - 1] = new Produkt(nutzer, produkt, n, datum);

				setMyProducts(my);
			}
		}
	}

	@Override
	public int getAnzahl(String produkt) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {

			String name = getMyProducts()[i].getName().toLowerCase();

			if (name.compareTo(produkt.toLowerCase()) == 0) {
				counter += getMyProducts()[i].getAnzahl();
			}

		}

		return counter;
	}

	/**
	 * Gibt das Datum eines Produkt wieder
	 * 
	 * @param produkt
	 * @return date from product
	 */
	public GregorianCalendar getDate(String produkt) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		// TODO Fixen von Reduanzen Produkten

		for (int i = 0; i < getMyProducts().length; i++) {

			String name = getMyProducts()[i].getName().toLowerCase();

			if (name.compareTo(produkt.toLowerCase()) == 0) {
				return getMyProducts()[i].getDate();
			}
		}

		return null;
	}

	/**
	 * Prüft ein Produkt nach Haltbarkeit und Anzahl
	 * 
	 * @param min
	 * @param max
	 * @param date
	 * @return boolean
	 */
	private boolean zuKaufenCheckProdukt(String produkt, GregorianCalendar date) {

		int min = getMinAnzahl(produkt);
		int anzahl = getAnzahl(produkt);
		GregorianCalendar ValueDate = getDate(produkt);

		for (int i = 0; i < getMyProducts().length; i++) {

			if (min < anzahl || ValueDate.before(date)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean zuKaufen(String produkt) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		msg.empfangeMeldung("Fragen, ob " + produkt + " gekauft werden sollen");

		return zuKaufenCheckProdukt(produkt, new GregorianCalendar());
	}

	@Override
	public boolean zuKaufen(String produkt, GregorianCalendar datum) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("produkt is null");
		}

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		String s = String.format("%tD", datum);
		msg.empfangeMeldung("Fragen, ob " + produkt + " am " + s + " gekauft werden sollen");

		return zuKaufenCheckProdukt(produkt, datum);

	}

	@Override
	public int getAbgelaufenAnzahl(GregorianCalendar datum) throws NullPointerException {

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {

			GregorianCalendar date = getMyProducts()[i].getDate();

			if (date.before(datum)) {
				counter++;
			}

		}

		return counter;
	}

	@Override
	public int getAbgelaufenAnzahl(INutzer nutzer, GregorianCalendar heute) {

		if (nutzer == null) {
			throw new NullPointerException("nutzer is null");
		}

		if (heute == null) {
			throw new NullPointerException("heute is null");
		}

		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {

			GregorianCalendar date = getMyProducts()[i].getDate();

			if (getMyProducts()[i].getPerson() != null) {
				String person = getMyProducts()[i].getPerson().getUsername();

				if (date.before(heute) && person == nutzer.getUsername()) {
					counter++;
				}
			}

		}

		String s = String.format("%tD", heute);
		msg.empfangeMeldung(nutzer.getUsername() + " fragt, wie viele seiner Produkte am " + s + " ablaufen");

		return counter;
	}

	@Override
	public ILebensmittel[] getAbgelaufenListe(GregorianCalendar datum) throws NullPointerException {

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		ILebensmittel[] arr = new ILebensmittel[getMyProducts().length];
		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {

			GregorianCalendar date = getMyProducts()[i].getDate();

			if (date.before(datum)) {
				arr[counter] = getMyProducts()[i];
				counter++;
			}
		}

		arr = Option.arrayClearNull(arr);

		return arr;
	}

	@Override
	public ILebensmittel[] getAbgelaufenListe(INutzer nutzer, GregorianCalendar datum) {

		if (nutzer == null) {
			throw new NullPointerException("nutzer is null");
		}

		if (datum == null) {
			throw new NullPointerException("datum is null");
		}

		ILebensmittel[] arr = new ILebensmittel[getMyProducts().length];
		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {
			if (getMyProducts()[i].getPerson() != null) {
				GregorianCalendar date = getMyProducts()[i].getDate();

				String name = getMyProducts()[i].getPerson().getUsername().toLowerCase();

				if (name.compareTo(nutzer.getUsername().toLowerCase()) == 0) {

					if (date.after(datum)) {

						arr[counter] = getMyProducts()[i];
						counter++;
					}
				}
			}
		}

		arr = Option.arrayClearNull(arr);

		return arr;
	}

	/**
	 * Generiert eine Liste von zu Kaufen Lebensmitteln
	 * 
	 * @param nutzer
	 * @param date
	 * @return String[]
	 */
	private String[] generierung(INutzer nutzer, GregorianCalendar date) throws NullPointerException {

		if (nutzer == null) {
			throw new NullPointerException("nutzer is null");
		}

		if (date == null) {
			throw new NullPointerException("date is null");
		}

		String[] arr = new String[getMyProducts().length];

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (getMyProducts()[i].getPerson() != null) {

				String name = getMyProducts()[i].getPerson().getUsername().toLowerCase();
				GregorianCalendar ValueDate = getMyProducts()[i].getDate();

				if (name.compareTo(nutzer.getUsername().toLowerCase()) == 0) {
					if (ValueDate.before(date)) {
						arr[counter] = getMyProducts()[i].getName();
						counter++;
					}
				}

			}
		}

		arr = Option.arrayClearNull(arr);

		return arr;
	}

	@Override
	public String[] generiereEinkaufsliste(INutzer nutzer) {
		return generierung(nutzer, new GregorianCalendar());
	}

	@Override
	public String[] generiereEinkaufsliste(INutzer nutzer, GregorianCalendar morgen) {
		return generierung(nutzer, morgen);
	}

	@Override
	public String toString() {
		return "IntelliK Inhalt: \n" + Arrays.toString(getMyProducts()) + "\nMinimalanzahl: \n"
				+ Arrays.toString(getMinProduct());
	}

}
