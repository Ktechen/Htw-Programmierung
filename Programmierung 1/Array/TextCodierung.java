package OPP.Array;

public class TextCodierung {
	
	private char[] code;
	private static char[][] codeX = new char[4][4];
	
	public char[] getCode() {
		return code;
	}
	
	public void setCode(char[] code) {
		this.code = code;
	}
	
	public static void combinationOfCode(char[] code) {
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}
	}
	
	public static void matrix(char[] code) {
		codeX[0][0] = code[0];
		codeX[0][1] = code[1];
		codeX[0][2] = code[2];
		codeX[0][3] = code[3];
		codeX[1][0] = code[4];
		codeX[1][1] = code[5];
		codeX[1][2] = code[6];
		codeX[1][3] = code[7];
		codeX[2][0] = code[8];
		codeX[2][1] = code[9];
		codeX[2][2] = code[10];
		codeX[2][3] = code[11];
		codeX[3][0] = code[12];
		codeX[3][1] = code[13];
		codeX[3][2] = code[14];
		codeX[3][3] = code[15];
		
		loadD2CharArray(codeX, true);
		
	}
	
	public void encryption(int[] number) {
		codeX[0][0] = code[number[0]]; //0
		codeX[0][1] = code[1];
		codeX[0][2] = code[2];
		codeX[0][3] = code[3];
		codeX[1][0] = code[number[1]]; //4
		codeX[1][1] = code[5];
		codeX[1][2] = code[6];
		codeX[1][3] = code[number[2]]; //7
		codeX[2][0] = code[8];
		codeX[2][1] = code[number[5]]; //9
		codeX[2][2] = code[10];
		codeX[2][3] = code[number[3]]; //11
		codeX[3][0] = code[12];
		codeX[3][1] = code[13];
		codeX[3][2] = code[number[4]]; //14
		codeX[3][3] = code[15];
		
		loadD2CharArray(codeX,false);
	}
	
	public void decode(int[] decode) {
		codeX[0][0] = code[decode[0]]; //0
		codeX[0][1] = code[1];
		codeX[0][2] = code[2];
		codeX[0][3] = code[3];
		codeX[1][0] = code[decode[1]]; //4
		codeX[1][1] = code[5];
		codeX[1][2] = code[6];
		codeX[1][3] = code[decode[2]]; //7
		codeX[2][0] = code[8];
		codeX[2][1] = code[decode[3]]; //9
		codeX[2][2] = code[10];
		codeX[2][3] = code[decode[4]]; //11
		codeX[3][0] = code[12];
		codeX[3][1] = code[13];
		codeX[3][2] = code[decode[5]]; //14
		codeX[3][3] = code[15];
		
		loadD2CharArray(codeX,false);
	}
	
	private static void loadD2CharArray(char[][] codeX, boolean wordwrap) {
		for (int i = 0; i < codeX.length; i++) {
			for (int j = 0; j < codeX[i].length; j++) {
				System.out.print(codeX[i][j] + " ");
			}
			if(wordwrap == true) {
				System.out.println();
			}
		}
	}
	
}
