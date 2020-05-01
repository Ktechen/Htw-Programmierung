package list;

public class SinglyLindedList<T> implements Listable<T> {

	private Node head = null;

	private class Node {
		T data;
		Node next;
	}

	@Override
	public void add(T data) {
		Node node = new Node();
		node.data = data;

		/*
		 * If list null
		 */
		if (head == null) {
			head = node;
		} else {
			addLast(data);
		}
	}

	@Override
	public void add(int index, T data) {
		if (data != null) {
			Node temp = new Node();
			int counter = size();

			if (index == 0) {
				addFirst(data);
			} else if (counter - 1 == index) {
				addLast(data);
			} else {

			}

		}
	}

	@Override
	public void addFirst(T data) {
		if (data != null) {
			// create temp Object
			Node temp = new Node();

			// pick data
			temp.data = data;

			// head is first element
			temp.next = head;

			// temp add to head
			head = temp;
		}
	}

	@Override
	public void addLast(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		/*
		 * If list null
		 */
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
		Node node = new Node();
		node.data = data;

	}

	@Override
	public T get(int index) {
		int counter = 0;
		Node temp = head;

		while (temp != null) {
			if (counter == index) {
				return temp.data;
			}
			counter++;
			temp = temp.next;
		}

		return null;
	}

	@Override
	public void remove(int index) {
		Node node = new Node();

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

		while (temp != null) {
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
