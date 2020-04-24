package Pflichaufgabe1;

public class App {

	public static void main(String[] args) {
		
		String[] prenameArr = {"Mand", "Ronald"};
		String[] surnameArr = {"Sult", "Dump"};

		Buch buch0 = new Buch("Theoretisches Testen gibt es nicht", "Mand", "Sult", 2016);
		// Buch buch1 = new Buch("Java mal ganz anders "Ronald Dump", "Mandy", "Sult",
		// 2010);
		Buch buch2 = new Buch("Theoretisch gesagt, praktisch gemacht", "Ronald", "Dump", 2015);
		Buch buch3 = new Buch("Grundlagen theoretischer Physik", "Anette", "Neumann", 2007);
		Buch buch4 = new Buch("Grundlagen der Programmierung mit Java", "Thomas", "Ulm", 2016);
		Buch buch5 = new Buch("Theoretiscdhadsadaes Testen gibt es nicht", "Mand", "Sult", 2018);
		
		//mehr Authoren
		Buch buch6 = new Buch("Theoretische Grundlagen 2. der Programmierung mit Java", prenameArr, surnameArr, 2011);
		
		Buch[] array = { buch0, buch2, buch3, buch4, buch5, buch6 };

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
		
		System.out.println(buch2.toString());
		System.out.println("Array: ");
		System.out.println(buch6.toString());
		
		//Spelling
		System.out.println();
		String searchSpelling = "SUlT";
		String listeSpelling = bioVer.search(searchSpelling);
		System.out.println(listeSpelling);
		

	}

}
