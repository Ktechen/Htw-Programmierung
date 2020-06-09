package user;

import java.util.Arrays;
import arrayOption.Option;
import lebensmittel.Produkt;

public class Person implements INutzer {

	private String username;

	/**
	 * iDontEat ist eine Variable die ein Array aus Produkten bereitstellt was der
	 * Benutzer alles nicht Essen kann oder möchte
	 */
	private Produkt[] iDontEat = null;
	private Produkt[] myUserProdukt = null;

	/**
	 * Erstelle einen Benutzer
	 */
	public Person() {
		this.username = null;
	}

	/**
	 * Erstelle einen Benutzer mit username
	 * 
	 * @param username
	 */
	public Person(String username) {
		super();

		if (username == null) {
			throw new NullPointerException("username is null");
		}

		this.username = username;
	}

	/**
	 * Erstellen eines Benutzer mit einen Array aus nicht gewohlten Lebensmittel
	 * 
	 * @param username = name of user
	 * @param iDontEat bekommt Lebensmittel die der Benutzer nicht Essen möchte oder
	 *                 kann
	 */
	public Person(String username, Produkt[] iDontEat) {
		super();

		if (username == null) {
			throw new NullPointerException("username is null");
		}

		if (iDontEat == null) {
			throw new NullPointerException("iDontEat is null");
		}
		

		this.username = username;
		this.iDontEat = iDontEat;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Produkt[] getiDontEat() {
		return iDontEat;
	}

	public void setiDontEat(Produkt[] iDontEat) {
		this.iDontEat = iDontEat;
	}

	public void setMyUserProdukt(Produkt[] myUserProdukt) {
		this.myUserProdukt = myUserProdukt;
	}

	@Override
	public String[] getEssbar() {

		if(myUserProdukt == null) {
			throw new NullPointerException("Die Userprodukte sind null. Hilfe: z.B: person2.setMyUserProdukt(intelliK.getMyProducts())");
		}
		
		String[] arr = new String[myUserProdukt.length];
		
		for (int i = 0; i < arr.length; i++) {
				arr[i] = myUserProdukt[i].getName();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(!istEssbar(arr[i])) {
				arr[i] = null;
			}
		}
		
		arr = Option.arrayClearNull(arr);
		
		return arr;
	}

	@Override
	public boolean istEssbar(String produkt) {

		if (iDontEat == null) {
			return true;
		}

		for (int i = 0; i < iDontEat.length; i++) {
			String name = iDontEat[i].getName().toLowerCase();

			if (produkt.toLowerCase().compareTo(name) == 0) {
				return false;
			}
		}

		return true;
	}

	@Override
	public void empfangeMeldung(String meldung) {
		System.out.println("\n" + meldung);
	}

	@Override
	public String toString() {

		if (iDontEat == null) {
			return "Person [username=" + username + "]";
		}

		return "Person [username=" + username + "] [" + Arrays.toString(iDontEat) + "]";
	}

}
