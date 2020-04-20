
package MyTestProg;

public class GCDSubItCmd implements ICommands {
	
	/*
	 * @return ggt
	 */
	public static int EuclidSubstractionIterative(int a, int b) {
		
		if(a == 0) {
			return b;
		}
		
		while(b != 0) {
			if(a > b) {
				a = a -b;
			}else {
				b = b - a;
			}
		}
		
		return a;
	}

	public static void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		int b = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		
		System.out.println("Ergebnis: " + EuclidSubstractionIterative(a, b));
	}
}
