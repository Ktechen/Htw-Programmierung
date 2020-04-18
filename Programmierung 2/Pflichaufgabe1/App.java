package Pflichaufgabe1;

/*
 * @author Kevin Techen
 * @m-nr: 573111
 */
public class App {

	public static void main(String[] args) {
		
		Buch buch0 = new Buch("Theoretisches Testen gibt es nicht", "Mand", "Sult", 2016);
		// Buch buch1 = new Buch("Java mal ganz anders "Ronald Dump", "Mandy", "Sult",
		// 2010);
		Buch buch2 = new Buch("Theoretisch gesagt, praktisch gemacht", "Ronald", "Dump", 2015);
		Buch buch3 = new Buch("Grundlagen theoretischer Physik", "Anette", "Neumann", 2007);
		Buch buch4 = new Buch("Grundlagen der Programmierung mit Java", "Thomas", "Ulm", 2016);
		Buch buch5 = new Buch("Theoretischadsadaes Testen gibt es nicht", "Mand", "Sult", 2018);

		Buch[] array = { buch0, buch2, buch3, buch4, buch5 };

		Bibliotheksverzeichnis bioVer = new Bibliotheksverzeichnis(array);

		// Aufgabe c
		System.out.println(bioVer.toString());
		
		//Aufgabe d
		String search = "Sult";
		String liste = bioVer.search(search);
		System.out.println(liste);
		
		//Aufgabe e
		String deepSearch = "Theoretisch";
		String deepListe = bioVer.deepSearch(deepSearch);
		System.out.println(deepListe);

		// System.out.println(buch0.toString());

	}

}
