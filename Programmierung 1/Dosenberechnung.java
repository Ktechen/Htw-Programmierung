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
		System.out.println("Durchmesser des Dosenboden betr�gt: " + dboden + "   cm");
		System.out.println("Die Fl�che des Dosenboden betr�gt:  " + fboden + "   cm");
		System.out.println("Die Mantelfl�che der Dose betr�gt:  " + fmantel + "  cm");
		System.out.println("Das Gesamtfl�che der Dose betr�gt:  " + fgesamt + "  cm");
		System.out.println("Das Volumen der Dose betr�gt: 		" + volumen + "  cm");
		
	}

}
