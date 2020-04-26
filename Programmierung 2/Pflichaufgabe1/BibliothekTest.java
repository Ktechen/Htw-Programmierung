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

	/*
	 * 1. Normalfall
	 */
	@Test
	public void testSearch() {
		System.out.println("testSearch()");
		System.out.println();

		String search = "Sult";
		String liste = bioVer.search(search);

		System.out.println(liste);

		assertNotNull(liste);
	}

	/*
	 * 2. Check if return null
	 */
	@Test
	public void testIsNullSearch() {
		System.out.println("testSearchIsNull()");
		System.out.println();

		String search = "";
		String liste = bioVer.search(search);

		System.out.println(liste);

		assertNull(liste);
	}

	/*
	 * 3. Normalfall groß und klein Schreibung
	 */
	@Test
	public void testSpellingSearch() {

		System.out.println("testSearchSpelling()");
		System.out.println();

		String search = "sult";

		String liste = bioVer.search(search);
		System.out.println(liste);

		String searchSpelling = "SUlT";
		String listeSpelling = bioVer.search(searchSpelling);

		System.out.println(listeSpelling);

		assertTrue(liste.compareTo(listeSpelling) == 0);
	}

	/*
	 * 4. WorstCase whitespace
	 */
	@Test
	public void testWhitespaceSearch() {

		System.out.println("testWorstSearch()");
		System.out.println();

		String search = "su  L  t   ";
		String liste = bioVer.search(search);

		System.out.println(liste);

		String actual = "";

		assertNotEquals(liste, actual);
	}

	/*
	 * 5. Bibliotheksverzeichnis isEmpty
	 */
	@Test
	public void testAllEmptySearch() {
		System.out.println("testAllEmptySearch()");
		System.out.println();

		Buch book = new Buch("", "", "", 0);
		Buch[] books = { book };
		Bibliotheksverzeichnis bioVerIsNull = new Bibliotheksverzeichnis(books);

		String search = "Müller";
		String liste = bioVerIsNull.search(search);

		assertNotNull(liste);
	}

	/*
	 * 6. Notfound
	 */
	@Test
	public void testNotfoundSearch() {
		System.out.println("testNotfoundSearch()");
		System.out.println();

		String search = "456";
		String liste = bioVer.search(search);

		assertEquals(liste, "");
	}

	/*
	 * 1. Normalfall != null
	 */
	@Test
	public void testDeepSearch() {
		// Aufgabe d
		System.out.println("testDeepSearch()");
		System.out.println();

		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);

		System.out.println(liste);
		assertNotNull(liste);
	}

	/*
	 * 2. Grenzfall == null
	 */
	@Test
	public void testDeepSearchIsNull() {
		// Aufgabe d
		System.out.println("testDeepSearchIsNull()");
		System.out.println();

		String search = "";
		String liste = bioVer.deepSearch(search);

		System.out.println(liste);
		assertNull(liste);
	}

	/*
	 * 3. Normalfall groß und klein Schreibung
	 */
	@Test
	public void testDeepSearchSpelling() {

		System.out.println("testDeepSearchSpelling()");
		System.out.println();

		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);

		System.out.println(liste);

		String searchSpelling = "ThEoReTisch";
		String listeSpelling = bioVer.deepSearch(searchSpelling);
		System.out.println(listeSpelling);

		assertTrue(liste.compareTo(listeSpelling) == 0);
	}

	/*
	 * 4. Test ob return = ""; NotFound
	 */
	@Test
	public void testDeepSearchNotFound() {

		System.out.println("testDeepSearchNotFound()");
		System.out.println();

		String search = "123";
		String liste = bioVer.deepSearch(search);

		assertEquals(liste, "");

	}

	/*
	 * 5. Test Title is null
	 */
	@Test
	public void testDeepSearchIsTitleNull() {

		System.out.println("testDeepSearchIsTitleNull()");
		System.out.println();

		Buch book = new Buch(null, prenameArr, surnameArr, 2011);

		Buch[] arrayBook = { book };

		Bibliotheksverzeichnis bioVerIsNull = new Bibliotheksverzeichnis(arrayBook);

		String search = "123";
		String liste = bioVerIsNull.deepSearch(search);

		assertEquals(liste, "");

	}

}
