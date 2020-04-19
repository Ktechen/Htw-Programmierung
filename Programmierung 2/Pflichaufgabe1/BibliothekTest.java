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
	/*
	 * Normalfall
	 */
	@Test 
	public void testSearch() {
		System.out.println("testSearch()");
		String search = "Sult";
		String liste = bioVer.search(search);
		System.out.println(liste + "\n");
	}
	
	
	/*
	 * Null Grenzfall
	 */
	@Test 
	public void testSearchIsNull() {
		System.out.println("testSearchIsNull()");
		String search = "";
		String liste = bioVer.search(search);
		System.out.println(liste + "\n");
		assertNull(liste);
	}
	
	/*
	 * Normalfall
	 */
	@Test 
	public void testDeepSearch() {
		//Aufgabe d
		System.out.println("testDeepSearch()");
		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);
		System.out.println(liste + "\n");
	}
	
	/*
	 * Grenzfall
	 */
	@Test 
	public void testDeepSearchIsNull() {
		//Aufgabe d
		System.out.println("testDeepSearchIsNull()");
		String search = "";
		String liste = bioVer.deepSearch(search);
		assertNull(liste);
		System.out.println(liste + "\n");
	}
	
	/*
	 * Normalfall groﬂ und klein Schreibung
	 */
	@Test 
	public void testDeepSearchSpelling() {
		
		System.out.println("testDeepSearchSpelling()");
		
		String search = "Theoretisch";
		String liste = bioVer.deepSearch(search);
		System.out.println(liste);

		String searchSpelling = "ThEoReTisch";
		String listeSpelling = bioVer.deepSearch(searchSpelling);
		System.out.println(listeSpelling);
		
		assertTrue(liste.compareTo(listeSpelling) == 0);
	}
}
