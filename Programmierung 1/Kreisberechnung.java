package HomeWork;

import java.util.Scanner;

public class Kreisberechnung{

	
	public static double caluCircumference(double r) {
		double erg = (2*Math.PI*r);
		return erg;
	}
	
	public static double caluFilledCircle(double r) {
		double erg = (Math.PI*Math.pow(r, 2));
		return erg;
	}
	
	public static void main(String[] args) {
		System.out.println("Kreisberechnung:");
		System.out.println("================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie den Radius an: ");
		double radius = sc.nextDouble();
		
		System.out.println("Der Kreisumfang mit dem Radius " + radius + " beträgt " + caluCircumference(radius));
		System.out.printf("Der Kreisumfang mit dem Radius " + radius + " beträgt %.4f", caluCircumference(radius));
		System.out.println();
		System.out.println("Der Kreisumfang mit dem Radius " + radius + " beträgt " + caluFilledCircle(radius));
		System.out.printf("Der Kreisumfang mit dem Radius " + radius + " beträgt %.4f", caluFilledCircle(radius));
		
	} 

}
