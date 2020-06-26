package tree;

public interface IBinTree<T> {

	/**
	 * Check if Tree are sorted
	 * 
	 * @return
	 * @throws NullPointerException
	 */
	public abstract boolean isSorted() throws NullPointerException;

	/**
	 * Check if value inside of tree
	 * 
	 * @param value
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean searchNode(T value) throws NullPointerException;

	/**
	 * Remove a Node from Tree and after this process Tree is sorted
	 * 
	 * @param value
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean removeNode(T value) throws NullPointerException;

	/**
	 * Return size from Tree
	 */
	public abstract int size();
}
