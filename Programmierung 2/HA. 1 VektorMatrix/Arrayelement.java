package main;

import java.util.Arrays;

public class Arrayelement {

	public byte[] haeufigsteElem(byte[] arr) throws NullPointerException {

		if(arr == null) {
			throw new NullPointerException("Alter Arr is voll null und so");
		}
		
		int count = 1;
		//byte[] newArr = new byte[arr.length]; //anzahl der elemente
		byte[] newArrElem = new byte[arr.length]; //Die Elemente selbst

		// Sort
		Arrays.sort(arr);

		//search element frequency
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++; 
				newArrElem[index] = arr[i]; 
				//newArr[index] = (byte) count;
			}

			if (arr[i] != arr[i - 1]) {
				count = 1;
				index++; 
			}
		}

		//Create new Array
		int lenArr = 0;
		for (int i = 0; i < newArrElem.length; i++) {
			if(newArrElem[i] != 0) {
				lenArr = i + 1;
			}
		}
		
		//add Elements so Array
		byte[] array = new byte[lenArr];
		for (int i = 0; i < array.length; i++) {
			array[i] = newArrElem[i];
		}
		
		return array;
	}
}
