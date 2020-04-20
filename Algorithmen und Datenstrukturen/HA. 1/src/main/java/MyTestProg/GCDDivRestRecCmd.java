

package MyTestProg;

public class GCDDivRestRecCmd implements ICommands {
	
	/*
	 * @return ggt
	 */
	public static int EuclidDivisionRestRecursive(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return EuclidDivisionRestRecursive(b, a % b);
	}

	public static void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		int b = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		
		System.out.println("Ergebnis: " + EuclidDivisionRestRecursive(a, b));
	}
}
