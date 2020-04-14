package MyTestProg;

public class GCDDivRestRecCmd implements ICommands {
	
	private int EuclidDivisionRestRecursive(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return EuclidDivisionRestRecursive(b, a % b);
	}

	@Override
	public void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin();
		int b = cs.readIntegerFromStdin();
		
		System.out.println("Ergebnis: " + EuclidDivisionRestRecursive(a, b));
	}
}
