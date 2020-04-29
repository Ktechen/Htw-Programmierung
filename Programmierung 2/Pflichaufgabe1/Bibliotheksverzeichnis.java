package Pflichaufgabe1;

public class Bibliotheksverzeichnis {

	// Aufgabe b

	private Buch[] buchArray = null;
	private String nameOflist = "Bücherliste:";

	public Bibliotheksverzeichnis(Buch[] buchArray) {
		this.buchArray = buchArray;
	}

	/*
	 * Print das Buch array aus
	 */
	public void printList() {
		System.out.println(nameOflist);

		for (int i = 0; i < buchArray.length; i++) {
			System.out.println(buchArray[i]);
		}
	}

	/*
	 * Convert das Buch array in eine String
	 * 
	 * @return liste for toString()
	 */
	private String printAsString() {

		String liste = "";

		// System.out.println(buchArray[5].getPrenameArray()[0]);

		for (int i = 0; i < buchArray.length; i++) {
			if (buchArray[i].getSurnameArray() != null) {
				liste += listOfMoreAuthor(i) + "\n";
			} else {
				liste += buchArray[i] + "\n";
			}
		}

		return liste;
	}

	/*
	 * toString
	 */
	public String toString() {
		System.out.println(nameOflist);
		return printAsString();
	}

	/*
	 * Sucht nach Nachname im Surname
	 * 
	 * @return liste nach dem Nachname von Authoren
	 */
	public String[] search(String search) {

		if (search == null || search == "") {
			return null;
		}

		// create Array with max length
		String[] array = new String[buchArray.length];

		// Dialog
		System.out.println("Gesuchter Nachname: „" + search + "“");
		System.out.println("Gefundene Bücher:");
		System.out.print("Search : " + search + " \n");

		// Surname als String und String[]
		String surname = null;
		String surnameArr = null;

		// remove Whitespace
		String clearSearch = search.replaceAll("\\s", "");

		// convert toLowerCase
		String searchValue = clearSearch.toLowerCase();

		for (int i = 0; i < buchArray.length; i++) {

			// suche von mehren Authorennamen
			if (buchArray[i].getSurnameArray() != null) {
				for (int j = 0; j < buchArray[i].getSurnameArrayLength(); j++) {

					// convert toLowerCase
					surnameArr = buchArray[i].getSurnameArray()[j].toLowerCase();

					// check surnameArray[i] == null
					if (surnameArr != null) {

						// check if value surname.toLowerCase() == searchValue.toLowerCase()
						if (surnameArr.compareTo(searchValue) == 0) {
							array[i] = buchArray[i].toString();
						}
					}
				}
			}

			// fix bug filter String != null
			if (buchArray[i].getSurname() != null) {
				surname = buchArray[i].getSurname().toLowerCase();

				// check if value surname.toLowerCase() == searchValue.toLowerCase()
				if (surname.compareTo(searchValue) == 0) {
					array[i] = buchArray[i].toString();
				}
			}
		}

		// remove null
		array = copyOfArray(array);

		return array;
	}

	/*
	 * Sucht nach Stichwörtern im title
	 * 
	 * @return String list von allen Büchern wo die suche nach dem Titel korrekt ist
	 */
	public String[] deepSearch(String search) {

		if (search == null || search == "") {
			return null;
		}

		String[] array = new String[buchArray.length];

		// Dialog
		System.out.println("Gesuchtes Stichwort: „" + search + "“");
		System.out.println("Gefundene Bücher:");

		for (int i = 0; i < buchArray.length; i++) {

			String title = buchArray[i].getTitle();
			int searchResult = -1;

			if (title != null) {
				searchResult = title.toLowerCase().indexOf(search.toLowerCase());
			}

			// return int 0 = gefunden | -1 = nicht gefunden

			if (searchResult == 0) {
				// prüfen ob mehrere Authoren vorhanden sind
				if (buchArray[i].getSurnameArray() != null) {
					array[i] = buchArray[i].toString();

				} else {
					// add to liste
					array[i] = buchArray[i].toString();
				}
			}
		}

		// remove null
		array = copyOfArray(array);

		return array;
	}

	/*
	 * Hilfemethode
	 * 
	 * return String[] array without null
	 */
	public static String[] copyOfArray(String[] array) {

		if (array == null || array.length == 0) {
			return null;
		}

		int counter = 0;
		int postion = 0;

		// Zähl != null für die Array größe
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				counter++;
			}
		}

		// return null if counter == 0
		if (counter == 0) {
			return null;
		}

		// neuen String[] erstellen ohne null
		String[] newArray = new String[counter];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				newArray[postion] = array[i];
				postion++;
			}
		}

		return newArray;
	}

	/*
	 * Hilfsmethode
	 * 
	 * @return alle Authoren, title und date
	 */
	private String listOfMoreAuthor(int i) {

		String names = "";
		String liste = "";

		for (int j = 0; j < buchArray[i].getSurnameArrayLength(); j++) {
			names += buchArray[i].getPrenameArray()[j] + " " + buchArray[i].getSurnameArray()[j] + " : ";
		}
		// add to liste mehrere Authoren
		liste += names + buchArray[i].getTitle() + " : " + buchArray[i].getDate();

		return liste;
	}
}
