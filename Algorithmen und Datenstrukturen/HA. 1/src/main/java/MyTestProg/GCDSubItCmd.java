package MyTestProg;

public class GCDSubItCmd implements ICommands {
	
	private int EuclidSubstractionIterative(int a, int b) {
		
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

	@Override
	public void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin();
		int b = cs.readIntegerFromStdin();
		
		System.out.println("Ergebnis: " + EuclidSubstractionIterative(a, b));
	}
}
