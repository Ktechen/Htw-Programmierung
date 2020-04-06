package OPP.Array;

public class IntArray {

	
	public IntArray() {
		
	}
	
	private int[] array;

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	/*
	 * Part 1
	 */
	public void gibtAus() {
		System.out.print("[");
		
		if(array == null) {
			System.out.println("]");
			return; 
		}
		
		for (int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
		
		System.out.println("]");
	}
	
	/*
	 * Part 2
	 */
	public int suche (int array[], int wert) {
		
		System.out.println("\nSuche: " + wert);
		
		if(array == null) {
			System.out.println("Element Index nicht gefunden");
			return -1; 
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == wert) {
				System.out.println("Element Index gefunden: " + i);
				return i;
			}
		}
	
		return -1;
	}
	
	/*
	 * Part 3 
	 */
	public int fuegeEin(int number) {
		System.out.println();
		
		int search = suche(array, 0);
		if(search != -1) {
			System.out.println("Fuege " + number +  " in ersten freien Platz ein ");
			array[search] = number;
		}else {
			System.out.println("Array ist voll");
		}
		
		return -1;
	}

	/*
	 * part 4
	 */
	public static int[] verketter(int[] arrayA, int[] arrayB) throws NullPointerException{
		if(arrayA == null || arrayB == null) {throw new NullPointerException("Array A or B is null"); } 
		
		int range = (arrayA.length + arrayB.length);
		int[] newArray = new int[range];
		
		for (int i = 0; i < arrayA.length; i++) {
			newArray[i] = arrayA[i];
		}
		
		for (int k = 0; k < arrayB.length; k++) {
			newArray[k + arrayA.length] = arrayB[k];
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print("[" + newArray[i] + "]");
		}
		
		System.out.println();
	
		return newArray;
	}
	
	/*
	 * part 5
	 */
	
	public void kopieren() {
		System.out.println("\nInhalt von zurückgegebenem kopiertenArray:");
		
		if(array == null) {System.out.println("NULL"); }
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	
	/*
	 * part 6
	 */
	
	public void raender() {
		
		if(array == null) {System.out.println("NULL"); }
		
		System.out.print("\n" + array[0]);
		System.out.print(" " + array[array.length-1]);
		
	}
	
}	









