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

	public String toString() {
		System.out.println(nameOflist);
		return printAsString();
	}
	
	/*
	 * Sucht nach Nachname im Surname
	 * 
	 * @return liste nach dem Nachname von Authoren
	 */
	public String search(String search) {

		String liste = null;

		if (search == null || search == "") {
			return liste;
		} else {
			// remove isEmpty
			liste = "";
		}

		System.out.println("Gesuchter Nachname: „" + search + "“");
		System.out.println("Gefundene Bücher:");

		System.out.print("Search : " + search + " \n");
		
		String surname = null;
		String surnameArr = null;
		String searchValue = search.toLowerCase();
		
		for (int i = 0; i < buchArray.length; i++) {
			
			//fix bug filter String != null
			if(buchArray[i].getSurname() != null) {
				surname = buchArray[i].getSurname().toLowerCase();
			}
			
			//check if value surname.toLowerCase() == searchValue.toLowerCase()
			if (surname.compareTo(searchValue) == 0) {
				liste += buchArray[i] + "\n";
			}
			
			// suche von mehren Authorennamen
			if (buchArray[i].getSurnameArray() != null) {
				for (int j = 0; j < buchArray[i].getSurnameArrayLength(); j++) {
					surnameArr = buchArray[i].getSurnameArray()[j];

					//check if value surname.toLowerCase() == searchValue.toLowerCase()
					if (surnameArr.compareTo(searchValue) == 0) {
						liste += listOfMoreAuthor(i) + "\n";
					}
				}
			}
			


		}
		return liste;
	}

	/*
	 * Sucht nach Stichwörtern im title
	 * 
	 * @return String list von allen Büchern wo die suche nach dem Titel korrekt ist
	 */
	public String deepSearch(String search) {

		String liste = null;

		if (search == null || search == "") {
			return liste;
		} else {
			// remove isEmpty
			liste = "";
		}

		System.out.println("Gesuchtes Stichwort: „" + search + "“");
		System.out.println("Gefundene Bücher:");

		for (int i = 0; i < buchArray.length; i++) {

			String title = buchArray[i].getTitle();

			// return int 0 = gefunden -1 == nicht gefunden
			int searchResult = title.toLowerCase().indexOf(search.toLowerCase());

			if (searchResult == 0) {
				// prüfen ob mehrere Authoren vorhanden sind
				if (buchArray[i].getSurnameArray() != null) {
					liste += listOfMoreAuthor(i) + "\n";

				} else {
					// add to liste
					liste += buchArray[i] + "\n";
				}
			}
		}

		return liste;
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
		return liste += names + buchArray[i].getTitle() + " : " + buchArray[i].getDate();
	}
}
