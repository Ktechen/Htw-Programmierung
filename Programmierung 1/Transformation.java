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
		
		anzahl = 0; // anzahl muss au�erhalb der Schleife initialisiert werden
		while(anzahl < exponent) {
			ergebnis = ergebnis * basis;
			anzahl++; // anzahl muss innerhalb der Schleife hochgez�hlt werden
		}
		
		anzahl = 0; // Wieder vor der Schleife initialisiert
		do { // Wird auch ausgef�hrt wenn anzahl >= exponent
			ergebnis = ergebnis * basis;
			anzahl++;
		} while (anzahl < exponent);
		
		System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
		System.out.println("Anzahl der Durchl�ufe: " + anzahl);
	}
}
