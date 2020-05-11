package list;

public class SinglyLindedList<T> implements Listable<T> {

	private Node head = null;

	private class Node {
		T data;
		Node next;
	}

	/*
	 * @Aufgabe a Add Element to list at the last position
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
		} else {
			addLast(data);
		}
	}

	@Override
	public void add(int index, T data) throws IllegalArgumentException{
		if (data != null && index >= 0) {
			if (index == 0) {
				addFirst(data);
			} else if (size() == index) {
				addLast(data);
			} else {
				
				/*
				 * Inside of list
				 */
				if(index < size()) {
					Node node = new Node();
					Node temp = head;

					for (int i = 0; i < index - 1; i++) {
						temp = temp.next;
					}

					node.next = temp.next;
					node.data = data;
					temp.next = node;
				}else {
					throw new IllegalArgumentException("Index out of Range");
				}
			}

		}
	}

	/*
	 * @Aufgabe b
	 */
	@Override
	public void addFirst(T data) {
		if (data != null) {
			// create temp Object
			Node node = new Node();

			// pick data
			node.data = data;

			// head is first element
			node.next = head;

			// temp add to head
			head = node;
		}
	}

	/*
	 * @Aufgabe c
	 * 
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
		if (data != null && index > -1) {

			Node node = head;

			for (int i = 0; i < index; i++) {
				node = node.next;
			}

			node.data = data;
		}
	}

	/*
	 * @Aufgabe d
	 */
	@Override
	public T get(int index) {
		if (index > -1) {
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

	/*
	 * @Aufgabe g
	 */
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

	/*
	 * @Aufgabe h
	 */
	@Override
	public void clear() {
		head = null;
	}

	/*
	 * @Aufgabe f
	 */
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

	/*
	 * @Aufgabe e
	 */
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

	@Override
	public String toString() {
		return "SinglyLindedList";
	}

}
