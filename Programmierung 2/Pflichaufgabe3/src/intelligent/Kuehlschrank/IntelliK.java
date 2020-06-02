package intelligent.Kuehlschrank;

import java.util.Arrays;
import java.util.GregorianCalendar;

import intelligent.Lebensmittel.ILebensmittel;
import intelligent.Lebensmittel.Produkt;
import user.INutzer;

public class IntelliK implements IKuehlschrank {

	private Produkt[] minProdukt = null;
	private Produkt[] myProducts = null;

	@Override
	public int getMinAnzahl(String produkt) throws NullPointerException {

		if (produkt == null) {
			throw new NullPointerException("Produkt value is null");
		}

		int value = 0;

		for (int i = 0; i < minProdukt.length; i++) {

			String name = minProdukt[i].getName();

			if (name.toLowerCase().compareTo(produkt.toLowerCase()) == 0) {
				value = minProdukt[i].getAnzahl();
			}
		}

		return value;
	}

	/**
	 * Legen die minimal Anzahl der Vorhanden Produkte fest
	 */
	@Override
	public void setMinAnzahl(String produkt, int n) throws IllegalArgumentException {

		if (n < 0) {
			throw new IllegalArgumentException("min is 0");
		}

		if (minProdukt == null) {
			minProdukt = new Produkt[1];
			minProdukt[0] = new Produkt(produkt, n);

		} else {

			boolean founded = false;

			for (int i = 0; i < minProdukt.length; i++) {
				String name = minProdukt[i].getName();

				if (name.toLowerCase().compareTo(produkt.toLowerCase()) == 0) {
					minProdukt[i] = new Produkt(produkt, n);
					founded = true;
				}
			}

			/*
			 * If not found at elem pos + 1
			 */
			if (!founded) {
				minProdukt = Arrays.copyOf(minProdukt, minProdukt.length + 1);
				minProdukt[minProdukt.length - 1] = new Produkt(produkt, n);
			}

		}

	}

	@Override
	public void add(String produkt, int n, GregorianCalendar datum)
			throws NullPointerException, IllegalArgumentException {

		if (produkt == null || datum == null) {
			throw new NullPointerException("productname or date is null");
		}

		if (n < 0) {
			throw new IllegalArgumentException("min is 0");
		}

		if (myProducts == null) {
			myProducts = new Produkt[1];
			myProducts[0] = new Produkt(produkt, n, datum);

		} else {

			myProducts = Arrays.copyOf(myProducts, myProducts.length + 1);
			myProducts[myProducts.length - 1] = new Produkt(produkt, n, datum);

		}
	}

	@Override
	public int getAnzahl(String produkt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean zuKaufen(String produkt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean zuKaufen(String produkt, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAbgelaufenAnzahl(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAbgelaufenAnzahl(INutzer nutzer, GregorianCalendar heute) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ILebensmittel[] getAbgelaufenListe(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILebensmittel[] getAbgelaufenListe(INutzer nutzer, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] generiereEinkaufsliste(INutzer nutzer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] generiereEinkaufsliste(INutzer nutzer, GregorianCalendar morgen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "IntelliK Inhalt: \n" + Arrays.toString(myProducts) + "\nMinimalanzahl: \n" + Arrays.toString(minProdukt);
	}

}
