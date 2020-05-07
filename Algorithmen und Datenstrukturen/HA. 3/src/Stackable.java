
public interface Stackable<T> {
	public void push(T data);

	public T pop();

	public T peek();

	public boolean empty();
	
	public void clear();

	public int size();

	public void printAll();
}
