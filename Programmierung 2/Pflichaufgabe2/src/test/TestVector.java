package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Matrizen.Vector;

public class TestVector {

	/*
	 * Normalfall
	 * Erstellen eines Vector
	 */
	@Test
	public void createVector() {

		int[][] matrix = { { 1, 2, 3 } };

		int[] vector1 = { 1, 2, 3 };

		Vector vector = new Vector(matrix);
	
		System.out.println();
		
		assertArrayEquals(vector1, vector.getVector());
	} 
	
	/*
	 * Worstcase
	 * Matrix is Null
	 */
	@Test(expected = NullPointerException.class)
	public void createVectorIsNull() {
		
		int[][] matrix = null;

		Vector vector = new Vector(matrix);
		
	}

}
