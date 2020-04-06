package HomeWork;

import java.util.Scanner;

public class QuardratZahlen {

	
	//Laden von zwei Zahlen die Quardiert werden
	public static void Output(int j ,int i) {
		while (j <= i) {
			System.out.println("Quadrat von " + j + " ist " + CaluQnumber(j));
			j++;
		}
	}
	
	
	//Quadierung von Zahlen
	public static int CaluQnumber(int number) {
		return number * number;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		int downNumber = sc.nextInt();
		System.out.print("Number 2: ");
		int upperNumber = sc.nextInt();
		
		Output(downNumber, upperNumber);
	}

}
