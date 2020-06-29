package tree;

public class BinNodeGen<T extends Comparable<T>> {

	protected BinNodeGen<T> left = null;
	protected BinNodeGen<T> right = null;
	protected T data = null;

	/**
	 * Default Constructor
	 */
	public BinNodeGen() {
		this.left = null;
		this.right = null;
		this.data = null;
	}

	/**
	 * Create a leave from Tree without left or right side
	 * 
	 * @param data
	 * @throws NullPointerException
	 */
	public BinNodeGen(T data) {

		if (data == null) {
			throw new NullPointerException("data is null");
		}

		this.left = null;
		this.right = null;
		this.data = data;
	}

	/**
	 * Create a leave from Tree
	 * 
	 * @param left
	 * @param right
	 * @param data
	 * @throws NullPointerException
	 */
	public BinNodeGen(BinNodeGen<T> left, BinNodeGen<T> right, T data) {

		if (data == null) {
			throw new NullPointerException("data is null");
		}

		this.left = left;
		this.right = right;
		this.data = data;
	}

	@Override
	public String toString() {
		return "[left=" + left + ", right=" + right + ", data=" + data + "]";
	}

}