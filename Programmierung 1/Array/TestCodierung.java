package OPP.Array;

public class TestCodierung {

	public static void main(String[] args) {
		char[] code = {'D','e','m','o','n','s','t','r','a','t','i','o','n','*','*','*'};
		int[] number = {11,15,5,3,6,8};
		
		TextCodierung textcodierung = new TextCodierung();
		textcodierung.setCode(code);
		
		System.out.println("Verschlüsselung: \n");
		System.out.println("Klartext: ");
		TextCodierung.combinationOfCode(code);
		
		System.out.println("\n\nMatrix: ");
		TextCodierung.matrix(code);
		
		System.out.println("\nencryption: ");
		textcodierung.encryption(number);
		
		int[] decode = {0,4,7,9,11,14};
		System.out.println("\n\nDecode: ");
		textcodierung.decode(decode);
	}

}

