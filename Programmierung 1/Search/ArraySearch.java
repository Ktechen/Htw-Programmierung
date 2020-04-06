package OPP.Array.Search;

public class ArraySearch {

	public static long search(int array[], int k) throws NullPointerException {
		if(array == null) { throw new NullPointerException("Array is null or empty");}
		
		for (int i = 0; i < array.length; i++) {
			if (k == array[i]) { return array[i]; }
		}
		
		return Long.MIN_VALUE;
	}	
	
	public static int addNewRangeToArray(int[] array, int range) throws ArrayIndexOutOfBoundsException {
		
		if(array.length < range) 	{return -2;}
		if(range <= 0) 				{return -1;}
		
		int[] copyOfArray = new int[range];

		for (int i = 0; i < array.length; i++) {
			copyOfArray[i] = array[i];
		}
		
		for (int i = 0; i < copyOfArray.length; i++) {
			System.out.print(copyOfArray[i] + " ");
		}
		
		return copyOfArray.length;
	}
	
	public static void printShit(int[] array, int k, int range) {
		
		System.out.println();
		
	}
}
