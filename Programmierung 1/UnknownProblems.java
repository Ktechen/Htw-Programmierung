package FreeTime;;

public class UnknownProblems {

	public static void main(String[] args) {
		int zahl1, zahl2;
		int erg = 0;
		
		zahl1 = 23;
		zahl2 = 7;
		
		System.out.println("DefaultInput : " + zahl1 + " " + zahl2 );
		
		while (zahl1 > 0) {
			if(zahl1 % 2 == 1) {
				erg = erg + zahl2;
				
				System.out.println("-------- Erg: " + erg + "\n");
				
				zahl1 = zahl1 / 2;
				
				System.out.println("########## zahl1: " + zahl1);
				
				zahl2 = zahl2 * 2;
				
				System.out.println("************ zahl2: " + zahl2);
			} else
        break;
		}

		System.out.println("Output: " + erg);
	}

}
