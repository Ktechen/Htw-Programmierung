package user;

import java.util.Arrays;
import arrayOption.Option;
import lebensmittel.Produkt;

/**
 * @version 1.0
 * @author Kevin Techen
 *
 */
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
	 * @throws NullPointerException
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
	 * @throws NullPointerException
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

	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * Set User value
	 * @param username
	 * @throws NullPointerException
	 */
	public void setUsername(String username) {
		
		if(username == null) {
			throw new NullPointerException("username is null");
		}
		
		this.username = username;
	}

	/**
	 * Get iDontEat
	 * @return Produkt[]
	 */
	public Produkt[] getiDontEat() {
		return iDontEat;
	}

	/**
	 * Set iDontEat[]
	 * @param iDontEat
	 * @throws NullPointerException
	 */
	public void setiDontEat(Produkt[] iDontEat) {
		
		if(iDontEat == null) {
			throw new NullPointerException("iDontEat is null");
		}
		
		this.iDontEat = iDontEat;
	}

	/**
	 * Set MyUserProdukts
	 * @param myUserProdukt
	 * @throws NullPointerException
	 */
	public void setMyUserProdukt(Produkt[] myUserProdukt) {
		
		if(myUserProdukt == null) {
			throw new NullPointerException("myUserProdukt is null");
		}
		
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
	public boolean istEssbar(String produkt) throws NullPointerException{

		if(produkt == null) {
			throw new NullPointerException("produkt is null");
		}
		
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
