package Pflichaufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliothekTest {

	//////////////////////////////////////////////////////////////
	// Setup
	/////////////////////////////////////////////////////////////
	private String[] prenameArr = { "Mand", "Ronald" };
	private String[] surnameArr = { "Sult", "Dump" };

	private Buch buch0 = new Buch("Theoretisches Testen gibt es nicht", "Mand", "Sult", 2016);
	// Buch buch1 = new Buch("Java mal ganz anders "Ronald Dump", "Mandy", "Sult",
	// 2010);
	private Buch buch2 = new Buch("Theoretisch gesagt, praktisch gemacht", "Ronald", "Dump", 2015);
	private Buch buch3 = new Buch("Grundlagen theoretischer Physik", "Anette", "Neumann", 2007);
	private Buch buch4 = new Buch("Grundlagen der Programmierung mit Java", "Thomas", "Ulm", 2016);
	private Buch buch5 = new Buch("Theoretiscdhadsadaes Testen gibt es nicht", "Mand", "Sult", 2018);

	// mehr Authoren
	private Buch buch6 = new Buch("Theoretische Grundlagen 2. der Programmierung mit Java", prenameArr, surnameArr,
			2011);

	private Buch[] array = { buch0, buch2, buch3, buch4, buch5, buch6 };

	private Bibliotheksverzeichnis bioVer = new Bibliotheksverzeichnis(array);

	//////////////////////////////////////////////////////////////
	// Search Methoden
	/////////////////////////////////////////////////////////////

	/*
	 * 1. Normalfall BestCase die Eingabe ist perfekt
	 */
	@Test
	public void testSearch() {
		String search = "Sult";
		String[] liste = bioVer.search(search);

		bioVer.dialog(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		System.out.println();

		assertNotNull(liste);
	}

	/*
	 * 2.WorseCase Check return null Es wird nichts sucht und die Methode return
	 * null;
	 */
	@Test
	public void testIsNullSearch() {
		String search = "";
		String liste[] = bioVer.search(search);

		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}

		assertNull(liste);
	}

	/*
	 * 3. Testen groß und klein Schreibung egal ist
	 * 
	 */
	@Test
	public void testSpellingSearch() {
		String search = "sult";

		String liste[] = bioVer.search(search);

		String searchSpelling = "SUlT";
		String listeSpelling[] = bioVer.search(searchSpelling);

		bioVer.dialog(searchSpelling);
		for (int i = 0; i < listeSpelling.length; i++) {
			System.out.println(listeSpelling[i]);
		}
		
		bioVer.dialog(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		System.out.println();
		
		assertArrayEquals(liste, listeSpelling);
	}

	/*
	 * 4. WorstCase whitespace problem Testen ob auch mit Whitespace das Ergebnis
	 * gefunden wird
	 */
	@Test
	public void testWhitespaceSearch() {
		String search = "su  L  t   ";
		String liste[] = bioVer.search(search);

		String searchSpelling = "SUlT";
		String listeSpelling[] = bioVer.search(searchSpelling);
		
		bioVer.dialog(searchSpelling);
		for (int i = 0; i < listeSpelling.length; i++) {
			System.out.println(listeSpelling[i]);
		}
		
		bioVer.dialog(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		System.out.println();
		
		assertArrayEquals(liste, listeSpelling);
	}

	/*
	 * WorseCase 5. Bibliotheksverzeichnis isEmpty
	 * 
	 * Ein Buch ohne Daten wird übergeben wird ohne probleme bearbeitet
	 */
	@Test
	public void testAllEmptySearch() {
		Buch book = new Buch("", "", "", 0);
		Buch[] books = { book };
		Bibliotheksverzeichnis bioVerIsNull = new Bibliotheksverzeichnis(books);

		String search = "Müller";
		String liste[] = bioVerIsNull.search(search);
		
		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}

		assertNull(liste);
	}

	/*
	 * Normalfall testen, ob kein Ergebnis gefunden wurde 6. Not found return "";
	 * 
	 */
	@Test
	public void testNotfoundSearch() {
		String search = "456";
		String liste[] = bioVer.search(search);
		
		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}
		
		assertNull(liste);
	}

	/*
	 * 1. Normalfall != null Eine BestCase suche ohne fehler
	 */
	@Test
	public void testDeepSearch() {
		String search = "Theoretisch";
		String liste[] = bioVer.deepSearch(search);

		bioVer.dialog(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		System.out.println();
		
		assertNotNull(liste);
	}

	/*
	 * 2. WorseCase Suche ist leer dann return null
	 */
	@Test
	public void testDeepSearchIsNull() {
		String search = "";
		String liste[] = bioVer.deepSearch(search);

		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}
		
		assertNull(liste);
	}

	/*
	 * 3. Worstcase groß und klein Schreibung Testen ob die Eingabe toLower convert
	 * wurde. Danach prüfen ob die Eingabe identisch sind
	 */
	@Test
	public void testDeepSearchSpelling() {
		String search = "Theoretisch";
		String liste[] = bioVer.deepSearch(search);

		String searchSpelling = "ThEoReTisch";
		String listeSpelling[] = bioVer.deepSearch(searchSpelling);

		bioVer.dialog(searchSpelling);
		for (int i = 0; i < listeSpelling.length; i++) {
			System.out.println(listeSpelling[i]);
		}
		
		bioVer.dialog(search);
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		System.out.println();
		
		assertArrayEquals(liste, listeSpelling);
	}

	/*
	 * Normalfall 4. Test ob return = null; NotFound eine nicht vorhandene Datensatz
	 * suchen
	 */
	@Test
	public void testDeepSearchNotFound() {
		String search = "123";
		String liste[] = bioVer.deepSearch(search);

		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}
		
		assertNull(liste);
	}

	/*
	 * 5. WorseCase Test Title is null
	 */
	@Test
	public void testDeepSearchIsTitleNull() {
		Buch book = new Buch(null, prenameArr, surnameArr, 2011);

		Buch[] arrayBook = { book };

		Bibliotheksverzeichnis bioVerIsNull = new Bibliotheksverzeichnis(arrayBook);

		String search = "123";
		String liste[] = bioVerIsNull.deepSearch(search);
		
		if (liste != null) {
			bioVer.dialog(search);
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i]);
			}
			System.out.println();
		}

		assertNull(liste);
	}

	//////////////////////////////////////////////////////////////
	// CopyOfArray
	/////////////////////////////////////////////////////////////

	/*
	 * Testen ob null remove wird
	 */
	@Test
	public void testCopyOfArray() {
		String[] CheckArray = { "Kevin", "hört", "J.B.O" };
		String[] array = { "Kevin", null, null, "hört", null, "J.B.O" };

		String[] testArray = Bibliotheksverzeichnis.copyOfArray(array);

		assertArrayEquals(testArray, CheckArray);
	}

}
