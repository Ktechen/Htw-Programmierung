package OPP.Array;

public class SortedIntArray {

	IntArray intArray = new IntArray();

	public int sequentielleSuche(int suchwert, int[] array) {
		
		intArray.setArray(array);
		
		if(intArray.getArray() == null) { return -1; }
		
		System.out.println("Suche Position von Wert " + suchwert + " sequentiell: ");
		
		for (int i = 0; i < intArray.getArray().length; i++) {
			if(intArray.getArray()[i] == suchwert) {
				return i;
			}
		}

		return -1;
	}
	
	public int binarSuche(int suchwert, int[] array, int untergrenze,int obergrenze) {
		
		if(array == null) {return -1;}
		if(untergrenze > obergrenze) {return -2;}
		
		int grenze = untergrenze + ((obergrenze - untergrenze)/2);
		
		if(suchwert < array[grenze]) {
			return binarSuche(suchwert, array, untergrenze, grenze - 1);
		}else if(suchwert > array[grenze]) {
			return binarSuche(suchwert, array,  grenze + 1, obergrenze);
		}else {
			return grenze;
		}
	}
}
