package list;

public class DoublyLinkedList<T> implements Listable<T>{

	Node head = null;
	Node tail = null;
	
	private class Node{
		T data;
		Node next; //nachfolger
		Node prev; //vorgänger
	}
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		int counter = 0;
		Node temp = head;

		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		
		return counter;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
