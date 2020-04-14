package MyTestProg;

import java.util.Scanner;

class Console {
	
	public int readIntegerFromStdin() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");

		int value = sc.nextInt();

		return value;
	}

	public int readIntegerFromStdin(String text) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number for "+text+": ");

		int value = sc.nextInt();

		return value;
	}

	public String readStringFromStdin(String text) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter "+text+": ");
		String value = sc.next();


		return value;
	}

}