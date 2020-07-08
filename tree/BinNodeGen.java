package tree;

public class BinNodeGen<T extends Comparable<T>> {

	BinNodeGen<T> left = null;
    BinNodeGen<T> right = null;
	T data = null;

	/**
	 * Default Constructor
	 */
	public BinNodeGen() {
		this.left = null;
		this.right = null;
		this.data = null;
	}

	/**
	 * Create a leaves from Tree without left or right side
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
	 * Create a leaves from Tree
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
