package OPP.Array.Search;

public class TestArraySearch {

	public static void main(String[] args) {
		
	int[] array = {-1,3,6,7,19};
	int[] array1 = {-1,3,6,7,19};
	
	
	System.out.println(ArraySearch.search(array, 6));
	System.out.println(ArraySearch.search(array, 12));
	
	
	ArraySearch.addNewRangeToArray(array, 10);
	
	ArraySearch.printShit(array, 4, 20);
	
	}
	
}
