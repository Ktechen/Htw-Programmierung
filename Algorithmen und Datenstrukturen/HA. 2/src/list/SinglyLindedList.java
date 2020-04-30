package list;

public class SinglyLindedList<T> implements Listable<T> {

	Node head = null;

	private class Node {
		T data;
		Node next;
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
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	@Override
	public void set(int index, T data) {

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
		head = null;
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
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

}
