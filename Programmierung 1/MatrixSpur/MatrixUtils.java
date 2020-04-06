package OPP.MatrixSpur;

public class MatrixUtils {
	
	/*
	 * check and scan Matrix for 
	 */
	public static double trace(double[][] matrix) throws NullPointerException, NonSquareArrayException {
		System.out.println("Array: "); //box start 
		
		if(matrix == null) { throw new NullPointerException("Array is null"); }
		
		int row = 0; //zeile
		int column = 0; //spalte
		double result = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			row = i + 1;
			for (int j = 0; j < matrix[i].length; j++) {
				column = j + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//System.out.println(row + " " + column);
		
		//if(row == column) { System.out.println("Es wurde ein quadratisches Array übergeben.");  } /*quadratisch */ 
		if(row != column) { throw new NonSquareArrayException("Es wurde kein quadratisches Array übergeben."); } /*rechtecking*/ 
		else{ /*Quadratisch*/
			
			result = squareCalulationOfMatrix(matrix);
			//System.out.println("Test: " + result);
		}
		return result;
	}
	
	private static double squareCalulationOfMatrix(double[][] matrix) {
		double result = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == j) {
					result += matrix[i][j];
				}
			}
		}
		
		return result;
	}
}
