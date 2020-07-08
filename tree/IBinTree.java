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
	 * Remove a Node from Tree and after this process this Tree is sorted
	 * 
	 * @param value
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean removeNode(T value) throws NullPointerException;

	/**
	 * Print tree:
	 * 
	 * <p>
	 * <hr>Example:
	 * <p>
	 * ---( 2 )
	 * <p>
	 * ------( 4 )
	 * <p>
	 * ----( 7 )
	 * <p>
	 * ------------( 6 )
	 * <p>
	 * -----( 9 )
	 */
	public abstract void printTree();

	/**
	 * Clear Tree
	 */
	public abstract void clear();
}
