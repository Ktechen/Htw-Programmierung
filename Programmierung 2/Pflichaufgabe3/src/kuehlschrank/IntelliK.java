package kuehlschrank;

import java.util.Arrays;
import java.util.GregorianCalendar;
import arrayOption.Option;

import lebensmittel.ILebensmittel;
import lebensmittel.Produkt;
import user.INutzer;
import user.Person;

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

			String name = getMinProduct()[i].getName();

			if (name.toLowerCase().compareTo(produkt.toLowerCase()) == 0) {
				value = getMinProduct()[i].getAnzahl();
			}
		}

		return value;
	}

	@Override
	public void setMinAnzahl(String produkt, int n) throws IllegalArgumentException {

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
	public int getAnzahl(String produkt) {

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

		for (int i = 0; i < getMyProducts().length; i++) {

			String name = getMyProducts()[i].getName().toLowerCase();

			if (name.compareTo(produkt.toLowerCase()) == 0) {
				return getMyProducts()[i].getDate();
			}
		}

		return null;
	}

	@Override
	public boolean zuKaufen(String produkt) {

		int min = getMinAnzahl(produkt);
		int anzahl = getAnzahl(produkt);

		if (anzahl < min) {
			return true;
		}

		msg.empfangeMeldung("Fragen, ob Eier gekauft werden sollen");

		return false;
	}

	@Override
	public boolean zuKaufen(String produkt, GregorianCalendar datum) {

		int min = getMinAnzahl(produkt);
		int anzahl = getAnzahl(produkt);
		GregorianCalendar date = getDate(produkt);

		String s = String.format("%tD", datum);
		msg.empfangeMeldung("Fragen, ob " + produkt + " am " + s + " gekauft werden sollen");

		if (min < anzahl && date.before(datum)) {
			return true;
		}

		return false;
	}

	@Override
	public int getAbgelaufenAnzahl(GregorianCalendar datum) {

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

		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {

			GregorianCalendar date = getMyProducts()[i].getDate();

			if (getMyProducts()[i].getPerson() != null) {
				String person = getMyProducts()[i].getPerson().getUsername();

				if (date.before(heute) && person == ((Person) nutzer).getUsername()) {
					counter++;
				}
			}

		}

		String s = String.format("%tD", heute);
		msg.empfangeMeldung(
				((Person) nutzer).getUsername() + " fragt, wie viele seiner Produkte am " + s + " ablaufen");

		return counter;
	}

	@Override
	public ILebensmittel[] getAbgelaufenListe(GregorianCalendar datum) {

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

		ILebensmittel[] arr = new ILebensmittel[getMyProducts().length];
		int counter = 0;

		for (int i = 0; i < getMyProducts().length; i++) {
			if (getMyProducts()[i].getPerson() != null) {
				GregorianCalendar date = getMyProducts()[i].getDate();

				String name = getMyProducts()[i].getPerson().getUsername().toLowerCase();

				// TODO remove casting
				if (name.compareTo(((Person) nutzer).getUsername().toLowerCase()) == 0) {

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

	@Override
	public String[] generiereEinkaufsliste(INutzer nutzer) {

		String[] arr = new String[getMyProducts().length];

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (getMyProducts()[i].getPerson() != null) {

				String name = getMyProducts()[i].getPerson().getUsername().toLowerCase();
				GregorianCalendar date = getMyProducts()[i].getDate();

				if (name.compareTo(((Person) nutzer).getUsername().toLowerCase()) == 0) {
					if (date.before(new GregorianCalendar())) {
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
	public String[] generiereEinkaufsliste(INutzer nutzer, GregorianCalendar morgen) {
		String[] arr = new String[getMyProducts().length];

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (getMyProducts()[i].getPerson() != null) {

				String name = getMyProducts()[i].getPerson().getUsername().toLowerCase();
				GregorianCalendar date = getMyProducts()[i].getDate();

				if (name.compareTo(((Person) nutzer).getUsername().toLowerCase()) == 0) {
					if (date.before(morgen)) {
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
	public String toString() {
		return "IntelliK Inhalt: \n" + Arrays.toString(getMyProducts()) + "\nMinimalanzahl: \n"
				+ Arrays.toString(getMinProduct());
	}

}
