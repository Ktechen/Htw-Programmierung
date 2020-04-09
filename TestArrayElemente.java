package main;

public class TestArrayElemente {

	public static void main(String[] args) {

		Arrayelement elm = new Arrayelement();

		byte[] arr = {1, 3, 3, 5, 2 ,1 , 1, 1, 2, 2, 2, 2, 0, 0, -1, -2, -2, -3, -3 -5 };

		//byte[] arr = { 1, 1, 1, 2, 2, 3, 4, 5, 6 };

		byte[] test = elm.haeufigsteElem(arr);

		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}

	}

}
