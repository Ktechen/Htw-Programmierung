package MyTestProg;

public class GCDSubRecCmd implements ICommands{
	
	private int EuclidSubstractionRecursive(int a, int b) {
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
	
	@Override
	public void execute() {
		Console cs = new Console();
		int a = cs.readIntegerFromStdin();
		int b = cs.readIntegerFromStdin();
		
		System.out.println("Ergebnis: " + EuclidSubstractionRecursive(a, b));
	}
	
}
