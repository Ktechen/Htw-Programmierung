package HA3;

public class Testklasse {

	public static void main(String[] args) {

		Punkt p = new Punkt(3, 3);
		
		int laenge = 30;
		int breite = 20;

		Quadrat q = new Quadrat(laenge, p);

		System.out.printf("Umfang Quadrad:  %2.2f", q.berechneUmfang());
		System.out.printf("\nAnker: %s", q.getAnker());
		System.out.printf("\nVektor start: x: %d y: %d", p.getX(), p.getY());
		
		//verschieben
		q.verschieberAnker(3, -1);
		
		System.out.printf("\nVektor verschiebe: x: %d y: %d", p.getX(), p.getY());

		Kreis k = new Kreis(180, p);
		System.out.printf("\nUmfang Kreis:  %2.2f", k.berechneUmfang());
		
		Punkt pkreis = new Punkt(4, 4);
		
		System.out.printf("\nAnker start: %s", k.getAnker());
		
		//set Anker
		k.setAnker(pkreis);
		
		System.out.printf("\nAnker ende: %s", k.getAnker());
		System.out.printf("\nRadius: %s", k.getRadius());
		
		Rechteck r = new Rechteck(laenge, breite, p);
		System.out.printf("\nUmfang Rechteck:  %2.2f", r.berechneUmfang());
		System.out.printf("\nFlächeninhalt Rechteck:  %2.2f", r.berechneFlaeche());
		System.out.printf("\nAnker: %s", r.getAnker());
		System.out.printf("\nVektor start: x: %d y: %d", p.getX(), p.getY());
		
		//verschieben
		r.verschieberAnker(4, 7);
		
		System.out.printf("\nVektor verschiebe: x: %d y: %d", p.getX(), p.getY());
		
		
		//Dreieck
		GleichschenkligesDreieck dreieck = new GleichschenkligesDreieck(10, 5, p);
		System.out.println("\nDreieck: " + dreieck.toString());

	}

}
