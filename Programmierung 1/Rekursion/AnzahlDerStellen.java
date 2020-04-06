package Rekursion;

import java.util.Scanner;

public class AnzahlDerStellen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die Zahl ein: ");
		long read = sc.nextLong();
		
		System.out.println("Anzahl der Zahlen : " + CountNumbers(read));
	}

	public static long CountNumbers(long number) {
		if(number <= 0) {
			return 0;
		}else {
			return 1+CountNumbers(number/10);
		}
	}
}
