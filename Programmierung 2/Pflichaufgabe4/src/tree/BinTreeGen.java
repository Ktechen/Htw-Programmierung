package tree;

public class BinTreeGen<T extends Comparable<T>> implements IBinTree<T> {

	private BinNodeGen<T> root = null;
	private boolean founded = false;
	private boolean sorted = true;
	private int counterTree = 0;

	private T leftMaxData;
	private T rightMinData;

	public BinNodeGen<T> getRoot() {
		return root;
	}

	/**
	 * Binary Tree
	 */
	public BinTreeGen() {
		this.leftMaxData = null;
		this.rightMinData = null;
		this.root = null;
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

		if (root.left != null) {
			this.leftMaxData = maxValue(root.left);
		}

		if (root.left != null) {
			this.rightMinData = minValue(root.right);
		}

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
	@Override
	public void printTree() {
		counterTree = 0;
		printTree(root);
	}

	/**
	 * Check if sorted
	 * 
	 * @TODO Fix right side problem
	 * @param root
	 */
	private void isSorted(BinNodeGen<T> node) {

		if (node != null) {

			// Node == root and have not nodes or leaves
			if ((node == root) && (node.left == null && node.right == null)) {
				sorted = true;
				return;
			}

			// check is left < node and right > node
			if (node.left != null && node.right != null) {
				if (!((node.data.compareTo(node.left.data) > 0) && (node.data.compareTo(node.right.data) < 0))) {
					sorted = false;
					return;
				}
			}

			// check is left == null and right > node
			if (node.left == null && node.right != null) {
				if (!(node.data.compareTo(node.right.data) < 0)) {
					sorted = false;
					return;
				}
			}

			// check is right == null and left < node
			if (node.left != null && node.right == null) {
				if (!(node.data.compareTo(node.left.data) > 0)) {
					sorted = false;
					return;
				}
			}

			/*
			 * check max value at left side of tree and min value at right side of tree left
			 * < root and root < right
			 */
			if (!((root.data.compareTo(leftMaxData) > 0) && (root.data.compareTo(rightMinData) < 0))) {
				sorted = false;
				return;
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
	private void searchNode(BinNodeGen<T> node, T value) {

		if (node != null) {

			if (value.compareTo(node.data) == 0) {
				founded = true;
				return;
			}

			if (founded == false && node.left != null) {
				searchNode(node.left, value);
			}

			if (founded == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
	}

	@Override
	public boolean searchNode(T value) throws NullPointerException {

		founded = false;

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
	private BinNodeGen<T> removeNode(BinNodeGen<T> node, T value) {

		if (node != null) {
			if (value.compareTo(node.data) < 0) {
				node.left = removeNode(node.left, value);
			} else if (value.compareTo(node.data) > 0) {
				node.right = removeNode(node.right, value);
			} else {

				if (node.left == null) {
					return node.right;
				}

				if (node.right == null) {
					return node.left;
				}

				node.data = minValue(node.right);
				node.right = removeNode(node.right, node.data);
			}
		}

		return node;
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

		// tree have child
		root = removeNode(root, value);

		isSorted(root);

		if (sorted == false) {
			return false;
		}

		return true;
	}

	/**
	 * Return max Value of Tree left Side
	 * 
	 * @param node
	 * @return node.data
	 */
	private T maxValue(BinNodeGen<T> node) {

		if (node != null && node.right != null) {
			return minValue(node.right);
		}

		return node.data;
	}

	/*
	 * Return min Value of tree.data
	 */
	public T getMaxValue() {
		return leftMaxData;
	}

	/**
	 * Return min Value of Tree left Side
	 * 
	 * @param node
	 * @return node.data
	 */
	private T minValue(BinNodeGen<T> node) {

		if (node != null && node.left != null) {
			return minValue(node.left);
		}

		return node.data;
	}

	/*
	 * Return min Value of tree.data
	 */
	public T getMinValue() {
		return rightMinData;
	}

	@Override
	public void clear() {
		root = null;
	}

	@Override
	public String toString() {
		
		printTree();
		
		return "Tree end";
	}
}
