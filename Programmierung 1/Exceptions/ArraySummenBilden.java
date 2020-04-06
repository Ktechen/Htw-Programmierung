package OPP.Exceptions;

public class ArraySummenBilden {

	public static void main(String[] args) {
		int[] feld = {12, 2, 34, 33, 45};
		System.out.println(summeIterativ(feld));
		System.out.println(summeRekursiv(feld, 0));
	}
	
	public static int summeIterativ(int[] feld) {
		int result = 0;
		for (int i = 0; i < feld.length; i++) {
			result += feld[i];
		}
		
		return result;
	}
	
	public static int summeRekursiv(int feld[], int i) {

		if(feld.length <= 0) { return -1; }
		if(feld.length-1 <i) { return 0; }
		
		return feld[i] + summeRekursiv(feld, i+1);
	}
		
}
