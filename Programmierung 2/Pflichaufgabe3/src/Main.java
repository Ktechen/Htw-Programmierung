
import intelligent.Kuehlschrank.IntelliK;
import user.Person;

public class Main {

	public static void main(String[] args) {
		// Person-Objekt Marie erzeugen
		Person person1 = new Person("Marie");

		// Person-Objekt Tim erzeugen
		Person person2 = new Person("Tim");

		// IntelliK-Objekt meinK erzeugen
		IntelliK intelliK = new IntelliK();

		// Einstellungen f�r min. Anzahl vornehmen f�r: Milch = 2, Ei = 5, Schinken = 1
		intelliK.setMinAnzahl("Eier", 5);
		intelliK.setMinAnzahl("Milch", 2);
		intelliK.setMinAnzahl("Schinken", 1);
	

		// K�hlschrank mit 1 Packung Milch bef�llen, die am 29.5.2020 abl�uft

		// K�hlschrank mit 4 Eiern bef�llen, die am 5.6.2020 ablaufen

		// K�hlschrank mit weiteren 3 Eiern bef�llen, die am 7.5.2020 ablaufen

		System.out.println("MinAnzahl:");
		System.out.println(intelliK.getMinAnzahl("Eier"));
		System.out.println(intelliK);

		// System.out.println(new GregorianCalendar().getTime());

	}

}
