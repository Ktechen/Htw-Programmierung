package cli;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Basic console input
 */

public class Console {

	private BufferedReader reader = null;

	public Console(BufferedReader reader) {
		this.reader = reader;
	}

	// Default
	public Console() {
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}

	/*
	 * Input Scanner Integer
	 */
	public int readIntegerFromStdin(String message, String errorMessage) {
		do {
			try {
				System.out.println(message);
				return Integer.parseInt(reader.readLine().trim());
			} catch (Exception e) {
				System.out.println(e.getMessage() + " " + errorMessage);
			}
		} while (true);
	}

	/*
	 * 
	 */
	public String readStringFromStdin(String message, String errorMessage) {
		do {
			try {
				System.out.println(message);
				return reader.readLine().trim();
			} catch (Exception e) {
				System.out.println(e.getMessage() + " " + errorMessage);
			}
		} while (true);
	}
}
