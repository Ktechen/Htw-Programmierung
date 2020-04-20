//@Author Kevin Techen

package MyTestProg;

import java.util.Scanner;

public class CommandFactory {

	public void consoleMenu() {

		int option = -1;
		menu();

		Scanner sc = new Scanner(System.in);
		
		//Call all Commands
		while (sc.hasNextInt()) {
			option = sc.nextInt();
			switch (option) {
			case 0:
				System.out.println("Exit");
				System.exit(0);
				break;
			case 1:
				GCDSubRecCmd.execute();
				menu();
				break;
			case 2:
				GCDSubItCmd.execute();
				menu();
				break;
			case 3:
				GCDDivRestRecCmd.execute();
				menu();
				break;
			case 4:
				GCDDivRestItCmd.execute();
				menu();
				break;
			case 5:
				SiebDesEratosthene.execute();
				menu();
				break;
			default:
				System.out.println("\nTry Again ");
				menu();
				break;
			}
		}
		
		//if input != int call methode again
		System.out.println("\nPlease try again");
		consoleMenu();

	}

	private void menu() {
		System.out.println("");
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
