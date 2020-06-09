package arrayOption;

import lebensmittel.ILebensmittel;

public class Option {
	/**
	 * Entfernt die Null element innerhalt des Arrays
	 * 
	 * @param arr
	 * @return arr without null
	 */
	public static ILebensmittel[] arrayClearNull(ILebensmittel[] arr) {

		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				size++;
			}
		}

		ILebensmittel[] newArr = new ILebensmittel[size];
		for (int i = 0; i < newArr.length; i++) {
			if (arr[i] != null) {
				newArr[i] = arr[i];
			}
		}

		return newArr;
	}
	
	/**
	 * Entfernt die Null element innerhalt des Arrays
	 * 
	 * @param arr
	 * @return arr without null
	 */
	public static String[] arrayClearNull(String[] arr) {

		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				size++;
			}
		}
		
		String[] data = new String[size];
		
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				data[pos] = arr[i];
				pos++;
			}
		}
		
		return data;
	}
}
