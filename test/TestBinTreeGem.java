package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
	private BinTreeGen<Integer> treeSix;

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

	@Test(expected = NullPointerException.class)
	public void searchNullPointerValueIsNull() {
		treeFive.searchNode(null);
	}

	@Test
	public void search() {
		assertTrue(treeTwo.searchNode(2));
	}

	@Test
	public void searchNotFound() {
		assertFalse(treeTwo.searchNode(1700));
	}

	@Test
	public void searchTree() {
		assertTrue(treeOne.searchNode(4));
	}

	/*
	 * ################## isSorted() ##################
	 */
	@Test(expected = NullPointerException.class)
	public void isSortedNodeNull() {
		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(null);
		treeSix = tree;
		treeSix.isSorted();
	}

	@Test
	public void isSortedNodeEqualsRoot() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(10);
		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(a);

		assertTrue(tree.isSorted());
	}

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
		assertTrue(treeThree.isSorted());
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

	@Test
	public void removeNodeTreeHaveNoChilds() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(10);
		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(a);

		tree.removeNode(10);

		assertTrue(tree.getRoot() == null);
	}

	@Test
	public void removeNode() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(1) && !tree.searchNode(1));
	}
	
	@Test
	public void removeNodeTreeOneNode1() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(1) && !tree.searchNode(1) && tree.isSorted());
	}
	
	@Test
	public void removeNodeTreeOneNode3() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(3) && !tree.searchNode(3) && tree.isSorted());
	}
	
	@Test
	public void removeTreeOneNode9() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(9) && !tree.searchNode(9) && tree.isSorted());
	}
	
	@Test
	public void removeNodeTreeOneNode4() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(4) && !tree.searchNode(4) && tree.isSorted());
	}
	
	@Test
	public void removeNodeTreeOneNode7() {
		BinTreeGen<Integer> tree = treeOne;
		assertTrue(tree.removeNode(7) && !tree.searchNode(7) && tree.isSorted());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void removeNodeTreeOneNode10() {
		BinTreeGen<Integer> tree = treeOne;
		assertFalse(tree.removeNode(10) && !tree.searchNode(10) && tree.isSorted());
	}

	@Test
	public void removeNodeTreeRightSide() {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(3);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 2);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 4);
		BinNodeGen<Integer> f = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> m = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> g = new BinNodeGen<Integer>(f, m, 9);
		BinNodeGen<Integer> h = new BinNodeGen<Integer>(e, g, 7);
		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(h);
		
		assertTrue(tree.removeNode(9) && !tree.searchNode(9) && tree.isSorted());
	}
	
	/*
	 * ################## minValue ##################
	 */

	@Test
	public void minValue() {
		assertTrue(treeOne.getMinValue() == 8);
	}

	@Test
	public void minValueUnSortedTree() {
		assertTrue(treeTwo.getMinValue() == 9);
	}

	/*
	 * ################## maxValue ##################
	 */

	@Test
	public void maxValue() {
		assertTrue(treeOne.getMaxValue() == 5);
	}

	@Test
	public void maxValueUnSortedTree() {
		assertTrue(treeTwo.getMaxValue() == 7);
	}

	@After
	public void clear() {
		treeOne = null;
		treeTwo = null;
		treeThree = null;
		treeFour = null;
		treeFive = null;
		treeSix = null;
	}
}
