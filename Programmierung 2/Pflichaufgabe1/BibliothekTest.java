package Pflichaufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliothekTest {

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
	
	
	private String border = "------------------------------------------------------------------------------------------------------";
	
	/*
	 * Normalfall
	 */
	@Test 
	public void testSearch() {
		System.out.println("testSearch()");
		System.out.println(border);
		String search = "Sult";
		String liste = bioVer.search(search);
		System.out.println(liste);
		assertNotNull(liste);
	}
	
	/*
	 * Null Grenzfall
	 */
	@Test 
	public void testSearchIsNull() {
		System.out.println("testSearchIsNull()");
		System.out.println(border);
		String search = "";
		String liste = bioVer.search(search);
		System.out.println(liste);
		assertNull(liste);
	}
	
	/*
	 * Normalfall groﬂ und klein Schreibung
	 */
	@Test 
	public void testSearchSpelling() {
		
		System.out.println("testSearchSpelling()");
		System.out.println(border);
		String search = "sult";
		String liste = bioVer.search(search);
		System.out.println(liste);

		String searchSpelling = "SUlT";
		String listeSpelling = bioVer.search(searchSpelling);
		System.out.println(listeSpelling);
		
		assertTrue(liste.compareTo(listeSpelling) == 0);
	}
	
	/*
	 * Normalfall
	 */
	@Test 
	public void testDeepSearch() {
		//Aufgabe d
		System.out.println("testDeepSearch()");
		System.out.println(border);
		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);
		System.out.println(liste);
		assertNotNull(liste);
	}
	
	/*
	 * Null Grenzfall
	 */
	@Test 
	public void testDeepSearchIsNull() {
		//Aufgabe d
		System.out.println("testDeepSearchIsNull()");
		System.out.println(border);
		String search = "";
		String liste = bioVer.deepSearch(search);
		System.out.println(liste);
		assertNull(liste);
	}
	
	/*
	 * Normalfall groﬂ und klein Schreibung
	 */
	@Test 
	public void testDeepSearchSpelling() {
		
		System.out.println("testDeepSearchSpelling()");
		System.out.println(border);
		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);
		System.out.println(liste);

		String searchSpelling = "ThEoReTisch";
		String listeSpelling = bioVer.deepSearch(searchSpelling);
		System.out.println(listeSpelling);
		
		assertTrue(liste.compareTo(listeSpelling) == 0);
	}
}
