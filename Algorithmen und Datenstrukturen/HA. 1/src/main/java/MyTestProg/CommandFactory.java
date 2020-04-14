package MyTestProg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandFactory {

	public void consoleMenu() {
		GCDSubItCmd subit = new GCDSubItCmd();
		GCDSubRecCmd subRec = new GCDSubRecCmd();
		GCDDivRestItCmd restIt = new GCDDivRestItCmd();
		GCDDivRestRecCmd restRec = new GCDDivRestRecCmd();
		SiebDesEratosthene sieb = new SiebDesEratosthene();

		int option = -1;
		menu();

		Scanner sc = new Scanner(System.in);
		
		try {
			while (sc.hasNextInt()) {
				option = sc.nextInt();
				switch (option) {
				case 0:
					System.out.println("Exit");
					System.exit(0);
					break;
				case 1:
					subit.execute();
					menu();
					break;
				case 2:
					subRec.execute();
					menu();
					break;
				case 3:
					restIt.execute();
					menu();
					break;
				case 4:
					restRec.execute();
					menu();
					break;
				case 5:
					sieb.execute();
					menu();
					break;
				default:
					System.out.println("\nTry Again");
					menu();
					break;
				}
			}
		} catch (InputMismatchException  e) {
			System.out.println(e.getMessage());

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	private void menu() {
		System.out.println();
		System.out.println("Console-Application: Exercise-1\n");
		System.out.println("1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction");
		System.out.println("2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction");
		System.out.println("3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest");
		System.out.println("4. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest");
		System.out.println("5. Sieve of Eratosthanes");
		System.out.println("0. Exit\n");
		System.out.print("Please enter a number for an option:");
	}

}
