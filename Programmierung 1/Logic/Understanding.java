package OPP.Logic; 

public class Understanding {

	private static int i = 0;
	private static int j = 0;
	private static int n = 8;
	private static int m = 3;
	
	private static float preis;
	private static int vier = 4;
	private static boolean b = false, weiter = true;
	
	public static void printExercise1() {
		System.out.println("17 / 4              = " +  17 / 4);
		System.out.println("17 % 4              = " + 17 % 4);
		System.out.println("10 / 4.0            = " + 10 / 4.0);
		System.out.println("5 < 5               = " + (5 < 5));
		System.out.println("3 > -1              = " + (3 > -1));
		System.out.println("3 != 7              = " + (3 != 7));
		System.out.println("(2 < 3) && ( 6 > 9) = " + ((2 < 3) && ( 6 > 9)));
		System.out.println("!(1 < 4)            = " + (!(1 < 4)));	
	}
	
	public static void printExercise2() {
		System.out.println("i = j = 5           = " + (i = j = 5));
		System.out.println("i = n + 2           = " + (i = n + 2));
		System.out.println("i = n++             = " + (i = n++));
		System.out.println("i = --m             = " + (i = --m));
	}
	
	public static void printExercise3() {
		System.out.println("b && !(b || weiter) = " + (b && !(b || weiter)));
		System.out.println("preis = 0.5f * 4    = " + (preis = 0.5f * 4));
		System.out.println("(preis = 1.9f) < 4  = " + ((preis = 1.9f) < 4));
		System.out.println("preis = (float)4    = " + (preis = (float)4));
		System.out.println("weiter = true == b  = " + (weiter = true == b));
		System.out.println("!(weiter = false)   = " + (!(weiter = false)));
	}
	
	
	
}
