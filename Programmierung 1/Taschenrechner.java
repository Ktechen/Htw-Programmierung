import java.util.Scanner;

public class Taschenrechner {

	//#region Calulator Module
	public static double addieren (double x, double y) {
		return x + y;
	}
	
	public static double subtrahieren(double x, double y) {
		return x - y;
	}
	
	public static double multiplizieren(double x, double y) {
		return x * y;
	}
	
	public static double dividieren(double x, double y) {
		if(y == 0) {
			return 0;
		}
		else {
			return x / y;
		}
	}
	//#regionende
	
	//IDK
	public static double zahlEinlesen(int welcheZahl) {
		System.out.print("Giben Sie die Zahl "+ welcheZahl + " ein: ");
		Scanner sc = new Scanner(System.in);
		double send = sc.nextDouble();
		return send;
	}
	
	//return information about next Step
	public static char menue() {
		System.out.println("\nBitte wählen Sie aus:");
		System.out.println("1 Addition"
						 + "\n2 Subtration"
						 + "\n3 Multiplikation"
						 + "\n4 Division"
						 + "\nn Neue Zahlen\ne Beenden");
		
		Scanner sc = new Scanner(System.in);
		char read = sc.next().charAt(0);
		return read;
	}

	//Output from Calulator
	public static void gibtEregnisAus(double x, double y, char op, double erg) {
		System.out.printf("%4.2f %c %4.2f = %4.2f",x ,op ,y ,erg);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Taschenrechner");
		System.out.println("==============\n");
		
		double numberOne = zahlEinlesen(1);		
		double numberTwo = zahlEinlesen(2);
		
		byte counter = 0;
		do {
			char read = menue();
			switch (read) {
			case '1':
				//ANSI CODE FÜR DIE 2
				gibtEregnisAus(numberOne, numberTwo, '+', addieren(numberOne, numberTwo));
				break;
			case '2': 
				gibtEregnisAus(numberOne, numberTwo, '-', subtrahieren(numberOne, numberTwo));
				break;
			case '3': 
				gibtEregnisAus(numberOne, numberTwo, '*', multiplizieren(numberOne, numberTwo));
				break;
			case '4': 
				gibtEregnisAus(numberOne, numberTwo, '/', dividieren(numberOne, numberTwo));
				if(numberTwo == 0 || numberTwo == 0.00) {
					System.out.println("\tDurch 0 Teilen ist nicht definiert!");
				}
				break;
			case 'n':
				numberOne = zahlEinlesen(1);		
				numberTwo = zahlEinlesen(2);
				
				counter++;
				//Neu Abrufen
				break;
			case 'e':
				System.out.println("Program closed");
				System.exit(0);
				//Programm Beenden
				break;
			default:
				System.out.println("Unbekannte Eingabe");
			}
		}while(counter >= 0 || counter <= 100);
	}
}
