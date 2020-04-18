package Pflichaufgabe1;

/*
 * @author Kevin Techen
 * @m-nr: 573111
 */
public class Bibliotheksverzeichnis {

	// Aufgabe b

	private Buch[] array = null;
	private String nameOflist = "B�cherliste:";

	public Bibliotheksverzeichnis(Buch[] array) {
		this.array = array;
	}

	/*
	 * Print das Buch array aus
	 */
	public void printList() {
		System.out.println(nameOflist);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/*
	 * Convert das Buch array in eine String
	 */
	private String printAsString() {

		String liste = "";

		for (int i = 0; i < array.length; i++) {
			liste += array[i] + "\n";
		}

		return liste;
	}

	public String toString() {
		System.out.println(nameOflist);
		return printAsString();
	}

	/*
	 * Sucht nach Nachname im Surname
	 */
	public String search(String search) {
		
		String liste = "";
		
		if(search == null || search == "") {
			return liste;
		}
		
		System.out.println("Gesuchter Nachname: �" + search + "�");
		System.out.println("Gefundene B�cher:");

		for (int i = 0; i < array.length; i++) {
			if (search == array[i].getSurname()) {
				liste += array[i] + "\n";
			}
		}

		return liste;
	}

	/*
	 * Sucht nach Stichw�rtern im title
	 */
	public String deepSearch(String search) {
		
		String liste = "";
		
		if(search == null || search == "") {
			return liste;
		}
		
		System.out.println("Gesuchtes Stichwort: �" + search + "�");
		System.out.println("Gefundene B�cher:");

		for (int i = 0; i < array.length; i++) {
			String title = array[i].getTitle();

			// return int 0 = gefunden -1 == nicht gefunden
			int searchResult = title.indexOf(search);
			if (searchResult == 0) {
				liste += array[i] + "\n";
			}
		}

		return liste;
	}
}