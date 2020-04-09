package main;

import java.util.Arrays;

public class Arrayelement {

	public byte[] haeufigsteElem(byte[] arr) throws NullPointerException {

		if (arr == null) {
			throw new NullPointerException("Alter Arr is voll null und so");
		}

		int count = 1;
		int index = 0;

		byte[] newArr = new byte[arr.length]; // anzahl der elemente
		byte[] newArrElem = new byte[arr.length]; // Die Elemente selbst

		// Sort
		Arrays.sort(arr);

		// print arr sort
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------");

		// search element frequency more then two
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				count++;
				newArrElem[index] = arr[i];
				newArr[index] = (byte) count;
			}
			
			if (arr[i] != arr[i + 1]) {
				count = 1;

				// filter first element if count == 1
				if (newArr[0] != 0) {
					index++;
				}
			}
		}

		// print count of element
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();

		// Create new Array
		int lenArr = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] != 0) {
				lenArr = i + 1;
			}
		}

		// add Elements so Array
		byte[] array = new byte[lenArr];
		for (int i = 0; i < array.length; i++) {
			if (newArrElem[i] != 0) {
				array[i] = newArrElem[i];
			}
		}

		return array;
	}
}
