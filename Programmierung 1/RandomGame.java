import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {

		System.out.println("Willkommen beim Zahlenraten.");
		System.out.println("\nIch denke mir eine Zahl zwischen 1 und 49. Rate diese Zahl!");

		Scanner sc = new Scanner(System.in);
		String Nr = "Bitte geben Sie eine Zahl ein: ";

		int i = 1;
		
		while (true) {
			
			System.out.print(Nr);
			int inputNr = sc.nextInt();
			int geheimZahl = (int) (49 * Math.random() + 1);
			
			if (geheimZahl <= inputNr) {
				System.out.println("\nVersuch " + i + " deine Zahl war " + inputNr);
				System.out.println("Die Geheimzahl ist kleiner!");
			} 
			else if (geheimZahl >= inputNr) {
				System.out.println("\nVersuch " + i + " deine Zahl war " + inputNr);
				System.out.println("Die Geheimzahl ist größer!");
			} 
			else if(geheimZahl == inputNr) {
				System.out.println("\nDie Zahl war " + inputNr);
				System.out.println("Sie haben Gewonnen");
				break;
			}
			i++;
			
		}
	}

}
