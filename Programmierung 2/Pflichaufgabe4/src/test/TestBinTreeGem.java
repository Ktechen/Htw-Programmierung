package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tree.BinNodeGen;
import tree.BinTreeGen;

public class TestBinTreeGem {

	private BinTreeGen<Integer> treeOne;
	private BinTreeGen<Integer> treeTwo;
	private BinTreeGen<Integer> treeThree;
	private BinTreeGen<Integer> treeFour;
	private BinTreeGen<Integer> treeFive;

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

	@Before
	public void intiTreeThree() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(3);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 2);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 4);
		BinNodeGen<Integer> f = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> l = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> g = new BinNodeGen<Integer>(f, l, 9);
		BinNodeGen<Integer> h = new BinNodeGen<Integer>(e, g, 7);

		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(h);
		treeThree = tree;
	}

	@Before
	public void initTreefour() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 10);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 3);

		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(e);
		treeFour = tree;
	}

	@Before
	public void initTreeFive() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(300);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 2);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 42);
		BinNodeGen<Integer> f = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> l = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> g = new BinNodeGen<Integer>(f, l, 9);
		BinNodeGen<Integer> h = new BinNodeGen<Integer>(e, g, 7);

		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(h);
		treeFive = tree;
	}

	/*
	 * ################## search() ##################
	 */
	
	@Test
	public void search() {
		assertTrue(treeTwo.searchNode(2));
	}

	@Test
	public void searchNotFound() {
		assertFalse(treeTwo.searchNode(17));
	}
	
	/*
	 * ################## isSorted() ##################
	 */

	@Test
	public void isSortedTreeOne() {
		assertTrue(treeOne.isSorted());
	}

	@Test
	public void isSortedTreeTwo() {
		assertFalse(treeTwo.isSorted());
	}
	
	@Test
	public void isSortedTreeThree() {
		assertFalse(treeThree.isSorted());
	}
	
	@Test
	public void isSortedTreeFour() {
		assertFalse(treeFour.isSorted());
	}

	@Test
	public void isSortedTreeFive() {
		assertFalse(treeFive.isSorted());
	}
	/*
	 * ################## print() ##################
	 */

	@Test
	public void printTree() {
		treeOne.printTree();
		System.out.println();
		treeTwo.printTree();
	}

	/*
	 * ################## search() ##################
	 */
	@Test
	public void searchTree() {
		assertTrue(treeOne.searchNode(4));
	}
	
	/*
	 * ################## removeNode() ##################
	 */
	
	@Test(expected = NullPointerException.class)
	public void removeNodeValueNull() {
		treeOne.removeNode(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void removeNodeNotSorted() {
		treeFive.removeNode(10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void removeNodeValueNotFound() {
		treeOne.removeNode(42);
	}
	
	@After
	public void clear() {
		treeOne = null;
		treeTwo = null;
		treeThree = null;
		treeFour = null;
		treeFive = null;
	}
}
