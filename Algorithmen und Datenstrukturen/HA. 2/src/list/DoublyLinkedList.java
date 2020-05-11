package list;

public class DoublyLinkedList<T> implements Listable<T> {

	private Node head = null; // Listenanfang
	private Node tail = null; // Listenende

	private class Node {
		T data;
		Node next; // nachfolger
		Node prev; // vorgänger
	}

	/*
	 * add
	 */
	@Override
	public void add(T data) {
		Node node = new Node();
		node.data = data;

		/*
		 * If list null
		 */
		if (head == null) {
			head = node;
			tail = node;
			node.prev = null;
		} else {
			addLast(data);
		}

	}

	@Override
	public void add(int index, T data) {

		if (data != null && index >= 0) {

			if (index <= 0) {
				addFirst(data);

			} else if (index == size()) {
				addLast(data);

			} else {
				Node node = new Node();
				Node temp = head;

				while (temp.next != null) {
					temp = temp.next;
				}

			}
		}

	}

	/*
	 * Put the data to first postion of DLL
	 */
	@Override
	public void addFirst(T data) {
		if (data != null) {
			// create temp Object
			Node node = new Node();

			// no prev object
			node.prev = null;

			// pick data
			node.data = data;

			// head is first element
			node.next = head;

			// temp add to head
			head = node;
		}

	}

	/*
	 * Put the data to last postion of DLL
	 */
	@Override
	public void addLast(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		/*
		 * If list null
		 */
		if (head == null) {
			node.prev = null;
			head = node;
		} else {

			node.prev = tail;
			tail.next = node;
			tail = node;

		}

	}

	//!! fix to tail
	@Override
	public void set(int index, T data) {
		if (data != null && index >= 0) {

			Node node = head;

			for (int i = 0; i < index; i++) {
				node = node.next;

			}

			node.data = data;
		}
	}

	
	//!! fix to tail
	@Override
	public T get(int index) {
		if (index >= 0) {
			int counter = 0;
			Node temp = head;

			while (temp != null) {
				if (counter == index) {
					return temp.data;
				}
				counter++;
				temp = temp.next;
			}
		}

		return null;
	}

	@Override
	public void remove(int index) {
		if (index > -1) {
			Node node = head;

			for (int i = 0; i < index; i++) {
				node = node.next;
			}

			node.data = null;
		}
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
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
		Node node = head;

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	@Override
	public String toString() {
		return "DoublyLindedList";
	}

}
