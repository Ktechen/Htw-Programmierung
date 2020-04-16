package MyTestProg;

public class GCDSubRecCmd implements ICommands{
	
	private static int EuclidSubstractionRecursive(int a, int b) {
		if(b == 0) {
			return a;
		}
		if(a == 0) {
			return b;
		}
		
		if(a > b) {
			return EuclidSubstractionRecursive(a - b, b);
		}else {
			return EuclidSubstractionRecursive(a, b - a);
		}
		
	}
	
	public static void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		int b = cs.readIntegerFromStdin("Bitte geben Sie eine Zahl ein:");
		
		
		System.out.println("Ergebnis: " + EuclidSubstractionRecursive(a, b));
	}
	
}
