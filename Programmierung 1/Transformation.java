public class Transformation {
	public static void main(String[] args) {
		int basis = 5;
		int exponent = 2;
		int ergebnis = 1;
		int anzahl;
		
    /*
		for (anzahl = 0; anzahl < exponent; ++anzahl) {
			ergebnis = ergebnis * basis;
		}
    */
		
		anzahl = 0; // anzahl muss außerhalb der Schleife initialisiert werden
		while(anzahl < exponent) {
			ergebnis = ergebnis * basis;
			anzahl++; // anzahl muss innerhalb der Schleife hochgezählt werden
		}
		
		anzahl = 0; // Wieder vor der Schleife initialisiert
		do { // Wird auch ausgeführt wenn anzahl >= exponent
			ergebnis = ergebnis * basis;
			anzahl++;
		} while (anzahl < exponent);
		
		System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
		System.out.println("Anzahl der Durchläufe: " + anzahl);
	}
}
