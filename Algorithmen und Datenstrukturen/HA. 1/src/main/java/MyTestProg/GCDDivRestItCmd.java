package MyTestProg;

public class GCDDivRestItCmd implements ICommands {
	
	private static int EuclidDivisionRestIterative(int a, int b) {

		while (b != 0) {
			int h = a % b;
			a = b;
			b = h;
		}
		return a;
	}

	public static void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		int b = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		
		System.out.println("Ergebnis: " + EuclidDivisionRestIterative(a, b));
	}


}
