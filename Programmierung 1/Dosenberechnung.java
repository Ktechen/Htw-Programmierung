import java.util.Scanner;

public class Dosenberechnung {

	public static void main(String[] args) {
		
		final double pi = Math.PI;
		double h, u;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("h: ");
		h = sc.nextDouble();
		System.out.print("u: ");
		u = sc.nextDouble();
		
		
		double dboden = u/pi;
		double fboden = Math.pow(pi *(dboden/2), 2);
		double fmantel = u * h;
		double fgesamt = 2 * fboden + fmantel;
		double volumen = fboden * h;
		
		System.out.println("Die Dosen parameter: ");
		System.out.println("Durchmesser des Dosenboden beträgt: " + dboden + "   cm");
		System.out.println("Die Fläche des Dosenboden beträgt:  " + fboden + "   cm");
		System.out.println("Die Mantelfläche der Dose beträgt:  " + fmantel + "  cm");
		System.out.println("Das Gesamtfläche der Dose beträgt:  " + fgesamt + "  cm");
		System.out.println("Das Volumen der Dose beträgt: 		" + volumen + "  cm");
		
	}

}
