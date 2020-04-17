//@Author Kevin Techen

package MyTestProg;

import java.util.Scanner;

class Console {
	
	public int readIntegerFromStdin(String text) {
		Scanner sc = new Scanner(System.in);

		System.out.print(text);
		
		int value = 0;
		
		//if input == integer
		while(sc.hasNextInt()) {
			value = sc.nextInt();
			return value;
		}
		
		//else return methode 
		return readIntegerFromStdin(text);
	}

	public String readStringFromStdin(String text) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter "+text+": ");
		String value = sc.next();

		return value;
	}

}