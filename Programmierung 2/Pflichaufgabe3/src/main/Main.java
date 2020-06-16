package main;

import java.util.Arrays;
import java.util.GregorianCalendar;

import kuehlschrank.IntelliK;
import lebensmittel.Produkt;
import user.Person;

/**
 * @version 1.0
 * @author Kevin Techen
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Person-Objekt Marie erzeugen
		Person person1 = new Person("Marie");

		// Person-Objekt Tim erzeugen
		Person person2 = new Person("Tim", new Produkt[] { new Produkt("Milch") });

		// IntelliK-Objekt meinK erzeugen
		IntelliK intelliK = new IntelliK();

		// Einstellungen für min. Anzahl vornehmen für: Milch = 2, Ei = 5, Schinken = 1
		intelliK.setMinAnzahl("Eier", 5);
		intelliK.setMinAnzahl("Milch", 2);
		intelliK.setMinAnzahl("Schinken", 1);

		/*
		 * Tim und Marie (Vegan)
		 * 
		 * 2 Packung Milch, 5Eier, 1 Packung Schinken
		 */

		intelliK.add(person2.getUsername(), "Schinken", 1, new GregorianCalendar(2020, 5, 10));
		intelliK.add(person1.getUsername(), "Milch", 1, new GregorianCalendar(2020, 5, 20));
		intelliK.add(person1.getUsername(), "Eier", 3, new GregorianCalendar(2020, 5, 16));
		intelliK.add(person2.getUsername(), "Eier", 2, new GregorianCalendar(2020, 5, 4));

		// Kühlschrank mit 1 Packung Milch befüllen, die am 29.5.2020 abläuft

		intelliK.add("Milch", 1, new GregorianCalendar(2020, 4, 29));

		// Kühlschrank mit 4 Eiern befüllen, die am 5.6.2020 ablaufen

		intelliK.add("Eier", 4, new GregorianCalendar(2020, 5, 5));

		// Kühlschrank mit weiteren 3 Eiern befüllen, die am 7.5.2020 ablaufen

		intelliK.add("Eier", 3, new GregorianCalendar(2020, 4, 7));

		// System.out.println(meinK);
		System.out.println(intelliK);

		// Nach der aktuellen Anzahl Eier fragen
		System.out.println("\nNach der aktuellen Anzahl Eier fragen");
		System.out.println(intelliK.getAnzahl("Eier"));

		// Fragen, ob Eier gekauft werden sollen
		System.out.println(intelliK.zuKaufen("Eier"));

		// Fragen, ob Eier am 6.6.2020 gekauft werden sollen
		System.out.println(intelliK.zuKaufen("Eier", new GregorianCalendar()));

		// Tim/Marie fragt, wie viele seiner Produkte am 6.6.2020 ablaufen
		System.out.println(intelliK.getAbgelaufenAnzahl(person1, new GregorianCalendar()));
		System.out.println(intelliK.getAbgelaufenAnzahl(person2, new GregorianCalendar()));

		// get Abgelaufene Lebensmittel
		System.out.println("\nDas sind alle Abgelaufene Lebensmittel\n");
		System.out.println(Arrays.toString(intelliK.getAbgelaufenListe(new GregorianCalendar())));

		// Tim möchte seine Einkaufsliste (für jetzt) erhalten
		System.out.println();
		System.out.println(person2.getUsername() + " möchte seine Einkaufsliste (für jetzt) erhalten");
		System.out.println(Arrays.toString(intelliK.generiereEinkaufsliste(person2)) + "\n");

		// Tim möchte seine Einkaufsliste für Tag x erhalten
		System.out.println(person2.getUsername() + " möchte seinen Einkaufsliste für Tag x erhalten");
		System.out.println(
				Arrays.toString(intelliK.generiereEinkaufsliste(person2, new GregorianCalendar(2020, 05, 11))) + "\n");

		// istEssbar
		System.out.println(person2.getUsername() + " Ist es Essbar?" + " Milch");
		System.out.println(person2.istEssbar("Milch"));

		// getEssbar
		person2.setMyUserProdukt(intelliK.getMyProducts());
		System.out.println("\nGet Essbar?");
		System.out.println(Arrays.toString(person2.getEssbar()));

		// Prüfen wann ein Produkt abläuft
		String s = String.format("%s läuft ab am %tD", intelliK.getMyProducts()[0].getName(),
				intelliK.getMyProducts()[0].getVerfallsDatum());
		System.out.println("\n" + s);
		
		// Prüfen ob ein Produkt abläuft
		String m = String.format("%s ist abgelaufen ? %b", intelliK.getMyProducts()[0].getName(),
				intelliK.getMyProducts()[0].istAbgelaufen(intelliK.getMyProducts()[0].getVerfallsDatum()));
		
		System.out.println("\n" + m);
	}
}
