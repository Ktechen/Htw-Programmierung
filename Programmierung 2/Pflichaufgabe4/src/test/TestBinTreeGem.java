package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tree.BinNodeGen;
import tree.BinTreeGen;

public class TestBinTreeGem {

	private BinTreeGen<Integer> treeOne;
	private BinTreeGen<Integer> treeTwo;

	@Before
	public void initTreeOne() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(3);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 2);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 4);
		BinNodeGen<Integer> f = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> g = new BinNodeGen<Integer>(f, null, 9);
		BinNodeGen<Integer> h = new BinNodeGen<Integer>(e, g, 7);

		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(h);
		treeOne = tree;
	}

	@Before
	public void initTreeTwo() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(2);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(7);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 4);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 6);

		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(e);
		treeTwo = tree;
	}

	@Test
	public void printTree() {
		treeOne.printTree();
		System.out.println();
		treeTwo.printTree();
	}

	@Test
	public void searchTree() {
		assertTrue(treeOne.searchNode(4));
	}

	/**
	 * element found
	 */
	@Test
	public void sort() {
		assertTrue(treeTwo.searchNode(2));
	}

	/**
	 * Worstcase element not found
	 */
	@Test
	public void sortNotFound() {
		assertFalse(treeTwo.searchNode(17));
	}

	@Test
	public void size() {
		assertTrue(treeTwo.size() == 5);
	}

	@Test
	public void sizeFalse() {
		assertFalse(treeTwo.size() == 4);
	}

	@Test
	public void isSorted() {
		assertTrue(treeOne.isSorted());
	}
	
	@Test
	public void isSortedTreeTwo() {
		assertFalse(treeTwo.isSorted());
	}

	@After
	public void clear() {
		treeOne = null;
		treeTwo = null;
	}
}
