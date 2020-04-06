package HomeWork;

import java.util.Scanner;

public class Bmi {

	public static double BodySize() {
		System.out.print("Bitte geben Sie ihre Körpergröße an: ");
		Scanner sc = new Scanner(System.in);
		double size = sc.nextDouble();
		
		return size;
	}
	
	public static char gender() {
		System.out.print("Bitte geben Sie ihre Geschlecht an: ");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		
		return gender;
	}
	
	public static double Weight() {
		System.out.print("Bitte geben Sie ihre Gewicht an: ");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		
		return weight;
	}
	
	public static String BmiCalu(double size, char gender, double weight){
		//System.out.println(size +" "+  gender  +" "+ weight);
		double bmi = weight / (size * size);
		
		String convert = String.valueOf(bmi);
		
		/*
		 * Prüfen ob die Person nach der Berechnung folge Klassifikaktion besitzt
		 * 
		 */
		//Men
		if (gender == 'm') {
			
			if(bmi < 20) {
				
			}
			else if (bmi >= 20 || bmi <= 25)
			{
				
			}
			else if (bmi >= 26 || bmi <= 30)
			{
				
			}
			else if (bmi >= 31 || bmi <= 40)
			{
				
			}else {
				
			}
			
		}
		//Woman
		else if (gender == 'w') {
			
			if(bmi < 19) {
				
			}
			else if (bmi >= 19 || bmi <= 24)
			{
				
			}
			else if (bmi >= 25 || bmi <= 30)
			{
				
			}
			else if (bmi >= 31 || bmi <= 40) 
			{
				
			}else {
				
			}
		}
		else {
			gender = 'e';
		}
		
		return convert;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Information zur BMI Gesundheit:");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%15s %30s %20s", "Klassifikation", "Frauen", "Männer");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%15s %30s %20s", "Untergewicht", "< 19","< 20");
		System.out.println();
		System.out.printf("%15s %30s %20s", "Normalgewicht", "19 - 24","20 - 25");
		System.out.println();
		System.out.printf("%15s %30s %20s", "1. Adipositas", "25 - 30","26 - 30"); // \u8544
		System.out.println();
		System.out.printf("%15s %30s %20s", "2. Adipositas", "31 – 40","31 - 40"); // \u8545
		System.out.println();
		System.out.printf("%15s %30s %20s", "3. Adipositas", "> 40","> 40"); // \u8546
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("BMI-Rechner:");
		System.out.println("Das BMI Beträgt: " + BmiCalu(BodySize(),gender(),Weight()));

	}

}
