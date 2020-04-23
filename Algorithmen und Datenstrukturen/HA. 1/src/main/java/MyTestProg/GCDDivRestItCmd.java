//@Author Kevin Techen

package MyTestProg;

public class GCDDivRestItCmd implements ICommands {

	/*
	 * @return ggt
	 */
	public static int EuclidDivisionRestIterative(int a, int b) {

		while (b != 0) {
			int h = a % b;
			a = b;
			b = h;
		}
		return a;
	}

	public void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin("Bitte geben Sie die Zahl 1. ein:");
		int b = cs.readIntegerFromStdin("Bitte geben Sie die Zahl 2. ein:");
		int result = EuclidDivisionRestIterative(a, b);

		System.out.println("Ergebnis: " + result);
	}
	
	public String toString() {
		return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest";
	}

}
