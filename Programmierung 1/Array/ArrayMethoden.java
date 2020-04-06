package OPP.Array;

public class ArrayMethoden {

	private static final String MOVENUMBER = "%10s";
	private static final char DOUBLEPOINT = ':';
	private static int lengthOfBorder = 90;
	
	public static int getLengthOfBorder() {
		return lengthOfBorder;
	}

	public static void setLengthOfBorder(int lengthOfBorder) {
		ArrayMethoden.lengthOfBorder = lengthOfBorder;
	}

	private static String createBorder(int length) {
		String equals = "=";
		String border = "";
		String stopper = "#";
		
		for (int i = 0; i <= length; i++) 
		{
			border += equals;
		}
		
		return stopper + border + stopper;
	}
	
	/*
	 * Outcome of all function
	 */
	public static void printArrayInformation(int[] array, int ArrayAnStelleX)
	{	
		try {	
			System.out.println(createBorder(lengthOfBorder));
			System.out.printf("| Array der Zahl x            "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.arrayGet(array, ArrayAnStelleX));
			System.out.printf("| Summe                       "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.sum(array));
			System.out.printf("| Mittelwert                  "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.mittelwert(array));
			System.out.printf("| Anzahl der Geradenzahlen    "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.countGeradeZahl(array));
			System.out.printf("| Zwei größste Zahl           "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.zweiGroesssteZahl(array));
			System.out.printf("| Größste Zahl                "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.max(array));
			System.out.printf("| Kleinste Zahl               "+ MOVENUMBER +"  %d\n", DOUBLEPOINT, ArrayMethoden.min(array));
			System.out.printf("| Alle Arrays ins Quadrat     "+ MOVENUMBER +"  ", DOUBLEPOINT);
			ArrayMethoden.quadrat(array);
			System.out.printf("\n| Alle Geraden Arrays         "+ MOVENUMBER +"  ", DOUBLEPOINT);
			ArrayMethoden.geradeZahl(array);
			System.out.println();	
			System.out.println(createBorder(lengthOfBorder));
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(createBorder(lengthOfBorder));
			
		}catch(RuntimeException e) {
			System.out.println(e.getMessage().toString());
			System.out.println(createBorder(lengthOfBorder));
			
		}finally {
			System.out.println();
		}
	}
	
	/*
	 * Search and pick one of array index
	 */
	private static int arrayGet(int[] array, int i) throws NullPointerException {
		int num = 0;
		if(array == null) {
			throw new NullPointerException("Array is null");
		}
		else {
			if(i < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			else {
				for (int j = i; j < array.length; j++) {
					num = array[i];
				}
			}
			
		}
		return num;
	}
	
	/*
	 * summe of all number in that array
	 */
	private static int sum (int[] array) {
		int num = 0;
		
		for (int i = 0; i < array.length; i++) {
			num += array[i];
		}
		
		return num;
	}
	
	/*
	 * average of array
	 */
	private static int mittelwert(int[] array) {
		if(array.length <= 0) {
			return 0;
		}
	
		return sum(array)/array.length;
	}
	
	/*
	 * all array in square ²
	 */
	private static void quadrat(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print((int)Math.pow(arrayGet(array, i),2) + " ");
		}
	}
	
	/*
	 * Biggest number in that Array
	 */
	private static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {	
			if(max < array[i]) {
				max = arrayGet(array, i);
			}
		}
		
		return max;
	}
	
	/*
	 * smallest number in that Array
	 */
	private static int min(int[] array) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {	
			if(min > array[i]) {
				min = arrayGet(array, i); 
			}
		}
		
		return min;
	}
	
	/*
	 * Numbers of even numbers
	 */
	private static void geradeZahl(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.print(arrayGet(array, i) + " ");	
			}
		}
	}

	/*
	 * count of even numbers
	 */
	private static int countGeradeZahl(int[] array) {
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				count++;	
			}
		}
		
		return count;
	}
	
	/*
	 * secound biggest number
	 */
	private static int zweiGroesssteZahl(int[] array) {
		int max = max(array);
		int placetwo = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(max > array[i]) {
				placetwo = array[i];
			}
		}
		
		return placetwo;
	}	
}