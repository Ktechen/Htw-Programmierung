package tree;

public class BinTreeGen<T extends Comparable<T>> implements IBinTree<T> {

	private BinNodeGen<T> root = null;
	private boolean founded = false;
	private int counterTree = 0;

	/**
	 * Binary Tree
	 */
	public BinTreeGen() {
		root = null;
	}

	/**
	 * Create a root from Tree
	 * 
	 * @param root
	 * @throws NullPointerException
	 */
	public BinTreeGen(BinNodeGen<T> root) {

		if (root == null) {
			throw new NullPointerException("root is null");
		}

		this.root = root;
	}

	/**
	 * Print a Tree with sequence like Root | R | L
	 * 
	 * @param root
	 */
	private void printTree(BinNodeGen<T> root) {

		if (root != null) {
			counterTree++;
			printTree(root.left);
			System.out.println("( " + root.data + " )");
			printTree(root.right);
		}

		for (int i = 0; i < counterTree; i++) {
			System.out.print("-");
		}

	}

	/**
	 * Print a Tree with sequence like Root | R | L
	 */
	public void printTree() {
		counterTree = 0;
		printTree(root);
	}

	private boolean sorted = true;

	/**
	 * Check if sorted
	 * 
	 * @param root
	 */
	private void isSorted(BinNodeGen<T> node) {

		if (node != null) {

			/*
			 * Check if right higher then left
			 */
			if (node.right != null && node.left != null) {
				if (!((node.data.compareTo(node.left.data) > 0) && (node.data.compareTo(node.right.data) < 0))) {
					sorted = false;
					return;
				}
			}

			/*
			 * Check if left smaller then Node and Root or root == node
			 */
			if (node.left != null) {
				if (!((root == node)
						|| (root.data.compareTo(node.left.data) < 0) && (node.data.compareTo(root.data) > 0)
						|| (root.data.compareTo(node.left.data) > 0) && (node.data.compareTo(node.left.data) > 0))) {
					sorted = false;
					return;
				}

			}

			/*
			 * Check if right higher then Node and Root or root == node
			 */
			if (node.right != null) {
				if (!((root == node)
						// || (root.data.compareTo(node.right.data) > 0) && ()
						|| (root.data.compareTo(node.right.data) > 0) && (node.data.compareTo(node.right.data) < 0))) {
					sorted = false;
					return;
				}

			}

			isSorted(node.left);
			isSorted(node.right);
		}

	}

	@Override
	public boolean isSorted() {
		isSorted(root);
		return sorted;
	}

	/**
	 * Search if value inside of tree
	 * 
	 * @param root
	 * @param value
	 */
	private void searchNode(BinNodeGen<T> root, T value) {

		if (root != null) {

			if (value.compareTo(root.data) == 0) {
				founded = true;
				return;
			}

			if (founded == false && root.left != null) {
				searchNode(root.left, value);
			}

			if (founded == false && root.right != null) {
				searchNode(root.right, value);
			}
		}
	}

	@Override
	public boolean searchNode(T value) throws NullPointerException {

		if (value == null) {
			throw new NullPointerException("value is null");
		}

		searchNode(root, value);

		return founded;
	}

	/**
	 * Helper methode for removeNode
	 * 
	 * @param root
	 * @param value
	 * @return boolean
	 */
	private boolean removeNode(BinNodeGen<T> node, T value) {

		if (root != null) {

			if (node.data.compareTo(value) == 0) {

				boolean left = false;
				boolean right = false;

				if(node.left == null && node.right == null) {
					
				}
				
				if (node.left != null && node.right != null) {

				}

			} else {

				// Check which side of Tree is the value
				if (node.data.compareTo(value) < 0) {

					removeNode(node.left, value);
				} else {

					removeNode(node.left, value);
				}
			}

		}

		return true;
	}

	@Override
	public boolean removeNode(T value) throws NullPointerException, IllegalArgumentException {

		if (value == null) {
			throw new NullPointerException("value is null");
		}

		// Check if item inside of Tree
		if (searchNode(value) == false) {
			throw new IllegalArgumentException("Value is not inside of tree!");
		}

		// Check if Tree sorted
		isSorted(root);
		if (sorted == false) {
			throw new IllegalArgumentException("Tree is not sorted!");
		}

		// tree have no child
		if (root.data.compareTo(value) == 0) {
			clear();
			return true;
		}

		return false;
	}

	private T minValue(BinNodeGen<T> node) {

		if (node.left != null) {
			return minValue(node.left);
		}

		return node.data;
	}

	public T minValue() {
		return minValue(root);
	}

	@Override
	public void clear() {
		root = null;
	}

	@Override
	public String toString() {
		return "root: " + root.data;
	}
}
