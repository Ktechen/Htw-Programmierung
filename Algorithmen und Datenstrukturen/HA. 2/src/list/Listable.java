package list;

public interface Listable<T> {

	public void add(T data);

	public void add(int index, T data);

	public void addFirst(T data);

	public void addLast(T data);

	public void set(int index, T data);

	public T get(int index);

	public void remove(int index);

	public void clear();

	public int size();

	public void printAll();

	public boolean isEmpty();

}
