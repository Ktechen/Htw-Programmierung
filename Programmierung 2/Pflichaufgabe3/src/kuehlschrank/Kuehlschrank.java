package kuehlschrank;

import java.util.GregorianCalendar;

import lebensmittel.Produkt;

/**
 * @version 1.0
 * @author Kevin Techen
 *
 */
public abstract class Kuehlschrank {

	private Produkt[] minProduct = null;
	private Produkt[] myProducts = null;

	public Produkt[] getMinProduct() {
		return minProduct;
	}

	public void setMinProduct(Produkt[] minProduct) {
		this.minProduct = minProduct;
	}

	public Produkt[] getMyProducts() {
		return myProducts;
	}

	public void setMyProducts(Produkt[] myProducts) {
		this.myProducts = myProducts;
	}

	/**
	 * Default Constuctor
	 * 
	 * @minProduct null
	 * @myProducts null
	 */
	public Kuehlschrank() {
		this.minProduct = null;
		this.myProducts = null;
	}

	/**
	 * Legt einen Kuehlschrank an mit min benötigen Produkten
	 * @param minProduct
	 * @throws NullPointerException
	 */
	public Kuehlschrank(Produkt[] minProduct) {
		super();

		if (minProduct == null) {
			throw new NullPointerException("minProduct or myProduct is null");
		}

		this.minProduct = minProduct;
	}

	/**
	 * Legt einen Kuehlschrank an mit benötigen Produkten und vorhandenen Produkten
	 * 
	 * @param minProduct
	 * @param myProducts
	 * @throws NullPointerException
	 */
	public Kuehlschrank(Produkt[] minProduct, Produkt[] myProducts) {
		super();

		if (minProduct == null || myProducts == null) {
			throw new NullPointerException("minProduct or myProduct is null");
		}

		this.minProduct = minProduct;
		this.myProducts = myProducts;
	}

	/**
	 * Legt ein neues Produkt an ohne Benutzer personalisierung
	 * 
	 * @Extra Diese Methode war nicht gefordert 
	 * @param produkt
	 * @param n
	 * @param datum
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public abstract void add(String produkt, int n, GregorianCalendar datum)
			throws NullPointerException, IllegalArgumentException;

	/**
	 * Legt ein neues Produkt mit Benutzer personalisierung an
	 * 
	 * Es wird zusätzlich geprüft ob, Daten redundant sind
	 * 
	 * @Extra Diese Methode war nicht gefordert 
	 * @param nutzer
	 * @param produkt
	 * @param n
	 * @param datum
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public abstract void add(String nutzer, String produkt, int n, GregorianCalendar datum)
			throws NullPointerException, IllegalArgumentException;
	
}
