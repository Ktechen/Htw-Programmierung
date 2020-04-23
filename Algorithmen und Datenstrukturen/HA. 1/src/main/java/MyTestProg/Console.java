package MyTestProg;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Console {
	
	/*
	 * Methode mit BufferredReader
	 */
	public int readIntegerFromStdinTest(String text) {
		do {
			try {
				System.out.print(text);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				return Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException ex) {
				System.out.println("Not a number !");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	/*
	 * Gleich art der Methode aber als Scanner
	 */
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
	
	//Scanner
	public String readStringFromStdin(String text) {
		Scanner sc = new Scanner(System.in);

		System.out.print(text);
		
		String value = sc.next();
	
		//else return methode 
		return value;
	}

}
