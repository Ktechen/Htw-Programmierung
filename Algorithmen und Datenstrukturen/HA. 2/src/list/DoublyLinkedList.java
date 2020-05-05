package list;

public class DoublyLinkedList<T> implements Listable<T>{

	private Node head = null;
	private Node tail = null;
	
	private class Node{
		T data;
		Node next; //nachfolger
		Node prev; //vorgänger
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
			node.prev = null;
		} else {
			addLast(data);
		}
		
	}

	@Override
	public void add(int index, T data) {
		// TODO Auto-generated method stub
		
	}

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
		Node node = head;

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

}
