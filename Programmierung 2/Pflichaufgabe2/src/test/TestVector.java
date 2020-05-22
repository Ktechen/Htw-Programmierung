package test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Matrizen.Vector;

/**
 * 
 * @author Kevin Techen 0573111
 *
 */
public class TestVector {

	/*
	 * Normalfall Erstellen eines Vector
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
	 * Worstcase Matrix is Null
	 */
	@Test(expected = NullPointerException.class)
	public void createVectorIsNull() {

		int[][] matrix = null;

		Vector vector = new Vector(matrix);

	}

	/*
	 * Normalfall Gibt denn Betrag zurück
	 */
	@Test
	public void length() {

		int[][] matrix = { { 1, 2, 3 } };

		Vector vector = new Vector(matrix);

		double value = 3.7416573867739413;

		assertTrue(vector.length() == value);
	}

	/*
	 * Normfall Gibt denn Betrag zurück
	 */
	@Test
	public void lengthSizeEqualsOne() {

		int[][] matrix = { { 1 } };

		Vector vector = new Vector(matrix);

		double value = matrix[0][0];

		assertTrue(vector.length() == value);
	}

}
