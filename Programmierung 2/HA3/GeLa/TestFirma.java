package HA3.GeLa;

public class TestFirma {

	public static void main(String[] args) {
		
		/*
		Person mitarbeiter1 = new Mitarbeiter("Walser ", "Frank", 2, false, 1600.00);
		Person mitarbeiter2 = new Mitarbeiter("Flink", "Eva", 10, false, 1750.00);
		Person mitarbeiter3 = new Mitarbeiter("Boss", "Hans", 21, true, 4000.00);
		Person trainee1 = new Trainee("Vogel ", "Sven", 0, 450.00, "Fachkraft für Lagerlogistik", 21);
		*/
		
		Mitarbeiter mitarbeiter4 = new Mitarbeiter("Walser ", "Frank", 2, false, 1600.00);
		Mitarbeiter mitarbeiter5 = new Mitarbeiter("Flink", "Eva", 10, false, 1750.00);
		Mitarbeiter mitarbeiter6 = new Mitarbeiter("Boss", "Hans", 21, true, 4000.00);
		Trainee trainee2 = new Trainee("Vogel ", "Sven", 0, 450.00, "Fachkraft für Lagerlogistik", 21);
		
		
		System.out.println(mitarbeiter4);
		System.out.println(mitarbeiter5);
		System.out.println(mitarbeiter6);
		System.out.println(trainee2);
		
		mitarbeiter4.addSalary(300);
	
		System.out.println(mitarbeiter4.getMitarbeiterBonus());

	}
}
