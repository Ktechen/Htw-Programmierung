package tree;

public class BinTreeGen<T extends Comparable<T>> implements IBinTree<T> {

	private BinNodeGen<T> root = null;
	private boolean founded = false;
	private boolean sorted = true;
	private int counterTree = 0;
	private final T LEFT_MIN_DATA;
	private final T RIGHT_MIN_DATA;

	public T getLEFT_MIN_DATA() {
		return LEFT_MIN_DATA;
	}

	public T getRIGHT_MIN_DATA() {
		return RIGHT_MIN_DATA;
	}

	/**
	 * Binary Tree
	 */
	public BinTreeGen() {
		this.LEFT_MIN_DATA = null;
		this.RIGHT_MIN_DATA = null;
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
		this.LEFT_MIN_DATA = maxValue(root.left);
		this.RIGHT_MIN_DATA = minValue(root.right);
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

			if (node.left != null && node.right != null) {
				if (!((node.data.compareTo(node.left.data) > 0) && (node.data.compareTo(node.right.data) < 0))) {
					sorted = false;
					return;
				}
			}

			if (node.left == null && node.right != null) {
				if (!(node.data.compareTo(node.right.data) < 0)) {
					sorted = false;
					return;
				}
			}

			if (node.left != null && node.right == null) {
				if (!(node.data.compareTo(node.left.data) > 0)) {
					sorted = false;
					return;
				}
			}

			if (!((root.data.compareTo(LEFT_MIN_DATA) > 0) && (root.data.compareTo(RIGHT_MIN_DATA) < 0))) {
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
	public T maxValue() {
		T data = maxValue(root);
		return data;
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
	public T minValue() {
		T data = minValue(root);
		return data;
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
