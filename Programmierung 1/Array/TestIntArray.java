package OPP.Array;

public class TestIntArray {

	public static void main(String[] args) {
		int[] array = {-1,3,6,7,19};
		int[] array1 = null;
		int[] array2 = {1, 0, 1, 976, -1, 12, 0};
		
		IntArray intArray = new IntArray();
		
		int[][] arrays = {array, array1};
		
		/*
		 * part 1
		 */
		for (int[] i : arrays) {
			intArray.setArray(i);
			intArray.gibtAus();
		}
		
		/*
		 * part 2
		 */
		for (int[] i : arrays) {
			intArray.suche(i, 6);
		}
		
		/*
		 * part 3
		 */
		intArray.setArray(array2);
		intArray.gibtAus();
		intArray.fuegeEin(5);
		intArray.gibtAus();
		intArray.fuegeEin(30);
		intArray.gibtAus();
		intArray.fuegeEin(50);
		intArray.gibtAus();
		
		/*
		 * part 4
		 * 
		 */
		
		int[] arrayA = {-1,3,6,7,19};
		int[] arrayB = {20,30,40,50,60};

		try {
			System.out.println();
			System.out.println(IntArray.verketter(arrayA, arrayB));
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		intArray.setArray(arrayA);
		intArray.kopieren();
		intArray.raender();
		
		System.out.println("\n");
		
		SortedIntArray sortedIntArray = new SortedIntArray();
		int[] arraySquent = {2, 4, 6, 8, 10, 12, 14, 16};
		
		System.out.println(sortedIntArray.sequentielleSuche(10, arraySquent));
		System.out.println(sortedIntArray.binarSuche(14, arraySquent, arraySquent[0], arraySquent.length));
	}

}
