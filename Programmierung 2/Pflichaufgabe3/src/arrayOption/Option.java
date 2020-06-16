package arrayOption;

import lebensmittel.ILebensmittel;

/**
 * 
 * @author Kevin Techen
 * @version 1.0
 */
public class Option {
	
	/**
	 * Entfernt die Null element innerhalt des Arrays
	 * 
	 * @param ILebensmittel[] arr
	 * @return ILebensmittel[]
	 * @throws NullPointerException
	 */
	public static ILebensmittel[] arrayClearNull(ILebensmittel[] arr) {

		if(arr == null) {
			throw new NullPointerException("arr is null");
		}
		
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				size++;
			}
		}

		ILebensmittel[] newArr = new ILebensmittel[size];
		
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				newArr[pos] = arr[i];
				pos++;
			}
		}

		return newArr;
	}
	
	/**
	 * Entfernt die Null element innerhalt des Arrays
	 * 
	 * @param String[] arr
	 * @return String[]
	 * @throws NullPointerException
	 */
	public static String[] arrayClearNull(String[] arr) {

		if(arr == null) {
			throw new NullPointerException("arr is null");
		}
		
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
