package Pflichaufgabe1;

public class App {

	public static void main(String[] args) {

		String[] prenameArr = { "Mand", "Ronald" };
		String[] surnameArr = { "Sult", "Dump" };

		Buch buch0 = new Buch("Theoretisches Testen gibt es nicht", "Mand", "Sult", 2016);
		// Buch buch1 = new Buch("Java mal ganz anders "Ronald Dump", "Mandy", "Sult",
		// 2010);
		Buch buch2 = new Buch("Theoretisch gesagt, praktisch gemacht", "Ronald", "Dump", 2015);
		Buch buch3 = new Buch("Grundlagen theoretischer Physik", "Anette", "Neumann", 2007);
		Buch buch4 = new Buch("Grundlagen der Programmierung mit Java", "Thomas", "Ulm", 2016);
		Buch buch5 = new Buch("Theoretiscdhadsadaes Testen gibt es nicht", "Mand", "Sult", 2018);

		// mehr Authoren
		Buch buch6 = new Buch("Theoretische Grundlagen 2. der Programmierung mit Java", prenameArr, surnameArr, 2011);

		Buch[] array = { buch0, buch2, buch3, buch4, buch5, buch6 };

		Bibliotheksverzeichnis bioVer = new Bibliotheksverzeichnis(array);

		// Aufgabe c
		System.out.println(bioVer.toString());

		// Aufgabe d
		String search = "Sult";
		bioVer.dialog(search);
		String[] liste = bioVer.search(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}

		System.out.println();
		// Aufgabe e
		String deepSearch = "Theoretisch";
		bioVer.dialog(deepSearch);
		String deepListe[] = bioVer.deepSearch(deepSearch);
		for (int i = 0; i < deepListe.length; i++) {
			System.out.println(deepListe[i]);
		}

		System.out.println();
		System.out.println(buch2.toString());
		System.out.println("Array: ");
		System.out.println(buch6.toString());

		// Spelling
		System.out.println();
		String searchSpelling = "SUlT";
		bioVer.dialog(searchSpelling);
		String[] listeSpelling = bioVer.search(searchSpelling);
		for (int i = 0; i < listeSpelling.length; i++) {
			System.out.println(listeSpelling[i]);
		}

	}

}
