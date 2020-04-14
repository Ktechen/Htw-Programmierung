package MyTestProg;

public class GCDDivRestItCmd implements ICommands {
	
	private int EuclidDivisionRestIterative(int a, int b) {

		while (b != 0) {
			int h = a % b;
			a = b;
			b = h;
		}
		return a;
	}

	@Override
	public void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin();
		int b = cs.readIntegerFromStdin();
		
		System.out.println("Ergebnis: " + EuclidDivisionRestIterative(a, b));
	}


}
