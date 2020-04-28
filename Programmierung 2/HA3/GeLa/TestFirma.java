package HA3.GeLa;

public class TestFirma {

	public static void main(String[] args) {
		
		Person mitarbeiter1 = new Mitarbeiter("Walser ", "Frank", 2, false, 1600.00);
		Person mitarbeiter2 = new Mitarbeiter("Flink", "Eva", 10, false, 1750.00);
		Person mitarbeiter3 = new Mitarbeiter("Boss", "Hans", 21, true, 4000.00);
		Person trainee1 = new Trainee("Vogel ", "Sven", 0, 450.00, "Fachkraft für Lagerlogistik", 21);
		
		System.out.println(mitarbeiter1.toString());
	}
}
