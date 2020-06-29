package main;

import tree.BinNodeGen;
import tree.BinTreeGen;
import tree.IBinTree;

public class Main {

	public static void main(String[] args) {
		BinNodeGen<Integer> a = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> b = new BinNodeGen<Integer>(3);
		BinNodeGen<Integer> c = new BinNodeGen<Integer>(a, b, 2);
		BinNodeGen<Integer> d = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e = new BinNodeGen<Integer>(c, d, 4);
		BinNodeGen<Integer> f = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> g = new BinNodeGen<Integer>(f, null, 9);
		BinNodeGen<Integer> h = new BinNodeGen<Integer>(e, g, 7);
		BinTreeGen<Integer> tree = new BinTreeGen<Integer>(h);
	
		check(tree, 3);
		
		BinNodeGen<Integer> a2 = new BinNodeGen<Integer>(2);
		BinNodeGen<Integer> b2 = new BinNodeGen<Integer>(7);
		BinNodeGen<Integer> c2 = new BinNodeGen<Integer>(a2, b2, 4);
		BinNodeGen<Integer> d2 = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> e2 = new BinNodeGen<Integer>(c2, d2, 6);
		BinTreeGen<Integer> tree2 = new BinTreeGen<Integer>(e2);
		
		check(tree2, 7);
		
		BinNodeGen<Integer> a3 = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> b3 = new BinNodeGen<Integer>(1);
		BinNodeGen<Integer> c3 = new BinNodeGen<Integer>(a3, b3, 10);
		BinNodeGen<Integer> d3 = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> e3 = new BinNodeGen<Integer>(c3, d3, 3);
		BinTreeGen<Integer> tree3 = new BinTreeGen<Integer>(e3);
		
		check(tree3, 4);
		
		BinNodeGen<Integer> a4 = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> b4 = new BinNodeGen<Integer>(300);
		BinNodeGen<Integer> c4 = new BinNodeGen<Integer>(a4, b4, 2);
		BinNodeGen<Integer> d4 = new BinNodeGen<Integer>(5);
		BinNodeGen<Integer> e4 = new BinNodeGen<Integer>(c4, d4, 42);
		BinNodeGen<Integer> f4 = new BinNodeGen<Integer>(8);
		BinNodeGen<Integer> l4 = new BinNodeGen<Integer>(10);
		BinNodeGen<Integer> g4 = new BinNodeGen<Integer>(f4, l4, 9);
		BinNodeGen<Integer> h4 = new BinNodeGen<Integer>(e4, g4, 7);
		BinTreeGen<Integer> tree4 = new BinTreeGen<Integer>(h4);
		
		check(tree4, 9);
		
		BinNodeGen<Integer> a5 = new BinNodeGen<Integer>(2);
		BinNodeGen<Integer> b5 = new BinNodeGen<Integer>(7);
		BinNodeGen<Integer> c5 = new BinNodeGen<Integer>(a5, b5, 4);
		BinNodeGen<Integer> d5 = new BinNodeGen<Integer>(9);
		BinNodeGen<Integer> e5 = new BinNodeGen<Integer>(c5, d5, 8);
		BinTreeGen<Integer> tree5 = new BinTreeGen<Integer>(e5);

		check(tree5, 20);
	}
	
	private static <T> void check(IBinTree<T> tree, T value) {
		tree.printTree();
		System.out.println("\nIs Sorted: " + tree.isSorted());
		System.out.println("Search Value " + value + " : Founded? " + tree.searchNode(value));
		System.out.println();
	}
}
