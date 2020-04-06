
public class Counter {

	public static void main(String[] args) {

		int zahl = 1;
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				int counter = zahl++;
				
				if(zahl <= 10) {
					System.out.print( "\t" + "  " + counter + "\t");
				}
				else if(zahl <= 100) {
					System.out.print("\t" + " " + counter + "\t");
				}
				else {
					System.out.print("\t" + counter +  "\t");
				}
			}
			
			System.out.println();
		}
	}
}
