package MyTestProg;

public class SiebDesEratosthene implements ICommands{
	
	@Override
	public void execute() {
		Console cs = new Console();
		int max = cs.readIntegerFromStdin();
		
		try {
			boolean[] array = sieb(max);
			System.out.print("Ergebnis: ");
			for (int i = 0; i < array.length; i++) {
				if (array[i] == true) {
					System.out.print(i + " ");
				}
			}
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}	
		
	}
	
	private boolean[] sieb(int max) throws ArithmeticException{
		
		if(max < 0 || max == 1) {
			throw new ArithmeticException("Max darf nicht kleiner als sein : " + max);
		}
		
		boolean[] array = new boolean[max + 1];
		
		// alle i elemente sind true
		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}

		// alle i % 2 != 1
		for (int i = 0; i < max; i++) {
			// e.g (2%2 = 0) = (!= 1)
			if (i % 2 != 1) {
				array[i] = false;
			}
		}

		// default remove 1 and add 2
		array[1] = false; // 1 ist keine Primzahl
		array[2] = true; // 2 ist immer der Start
		
		// elemierung des Vielfaches
		for (int i = 2; i <= max; i++) {
			if (array[i] == true) {
				
				// 2+2 = k(4) // 3+3 = k(6) // 4+4 = k(8) // 5+5 = k(10)
				int k = i + i;
				
				while (k <= max) {
					array[k] = false;
					
					// 2+2 = k(4) k+2=k(6) // 3+3 = k(6) k+3=k(9)
					k += i;
				}
			}
		}

		return array;
	}
}
