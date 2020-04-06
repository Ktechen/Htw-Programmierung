package aufgabenBereich6;

import java.util.Scanner;

public class Temperatur {
	final static String INPUTINFORMATION = "Bitte geben Sie die ";
	final static String BORDER = "=============================";
	final static String SMALLBORDER = "=========================";
	final static String RIGHTBORDER = "|";
	
	public static void main(String[] args) {
		final int OPTIONS = 3;
		
		int option = 0;
		while (option != OPTIONS) {
			option = swap();
			switch (option) {
			case 1:
				fahrendheitConvert();
				break;
			case 2:
				celiusConvert();
				break;
			case 3:
				System.out.println("System has been closed");
				System.exit(0);
				break;
			default:
				System.out.println("Unknown input option");
				break;
			}
		}
	}

	/*
	 * Parameter[read] : return a Userinput for the options on main()
	 */
	public static int swap() {

		final String ERRORMESSAGETRYAGAIN = "\nPls try again!\n";
		final int STARTOPTIONSNUMBER = 0;
		final int ENDEOPTIONSNUMBER = 4;

		Scanner sc = new Scanner(System.in);

		System.out.println(BORDER);
		System.out.println("|   Temperaturen Calulator  |");
		System.out.println(BORDER);
		System.out.println("|  Fahrenheit->Celsius: 1   |");
		System.out.println("|  Celsius->Fahrenheit: 2   |");
		System.out.println("|  Close this program:  3   |");
		System.out.println(BORDER);
		System.out.print("Option: ");

		int read = sc.nextInt();

		if (read <= STARTOPTIONSNUMBER || read >= ENDEOPTIONSNUMBER) {
			System.out.println(ERRORMESSAGETRYAGAIN);
			swap();
		}

		return read;
	}
	
	/*
	 * This methodes are read and return a Userinput  
	 * 
	 */

	public static int bottomBorder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(INPUTINFORMATION + "untere Grenze an: ");
		int bottomBorder = sc.nextInt();
		
		return bottomBorder;
	}
	
	public static int topBorder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(INPUTINFORMATION + "obere Grene an: ");
		int topBorder = sc.nextInt();
		
		return topBorder;
	}
	
	public static int countDistance() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(INPUTINFORMATION + "Schnittweite an: ");
		int countDistance = sc.nextInt();
		
		return countDistance;
	}
	
	/*
	 * - Read the Userinputs
	 * - Output of Methode celisusToFahrheit();
	 */
	public static void celiusConvert() {

		int bottomBorder = bottomBorder();
		int topBorder = topBorder();
		int countDistance = countDistance();
		
		System.out.println("\nBeginn: " + bottomBorder + " Ende: " + topBorder + " Schnittweite: " + countDistance + "\n");
		
		System.out.println("\t"+SMALLBORDER);
		System.out.println("\t"+"|\tErgebnis:\t|");
		System.out.println("\t"+SMALLBORDER);
		
		for (int i = bottomBorder; i <= topBorder; i+=countDistance) {
			System.out.printf("\t| %d C = %3.2f F \t%s\n",i,celsiusToFahrenheit(i),RIGHTBORDER);
		}
		System.out.println("\t"+SMALLBORDER);
		System.out.println("\n");
	}
	
	/*
	 * - Read the Userinputs
	 * - Output of Methode FahrheitToCelsius();
	 */
	public static void fahrendheitConvert() {

		int bottomBorder = bottomBorder();
		int topBorder = topBorder();
		int countDistance = countDistance();
		
		System.out.println("\nBeginn: " + bottomBorder + " Ende: " + topBorder + " Schnittweite: " + countDistance + "\n");
		
		System.out.println("\t"+SMALLBORDER);
		System.out.println("\t"+"|\tErgebnis:\t|");
		System.out.println("\t"+SMALLBORDER);
		
		for (int i = bottomBorder; i <= topBorder; i+=countDistance) {
			System.out.printf("\t| %d F = %.2f C \t%s\n", i, FahrenheitToCelsius(i), RIGHTBORDER);
		}
		System.out.println("\t"+SMALLBORDER);
		System.out.println("\n");
	}


	public static double celsiusToFahrenheit(int grad) {
		double celsius = ((grad * 9.0/5.0)+32.0);
		return celsius;
	}

	public static double FahrenheitToCelsius(int grad) {
		double fahrheit = ((grad - 32.0)*5.0/9.0);
		return fahrheit;
	}
	
}