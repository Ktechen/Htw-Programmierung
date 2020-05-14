package stack;

public class Stack<T> implements Stackable<T> {

	private Node head;
	private int counter;

	private class Node {
		T data;
		Node next;
	}

	@Override
	public void push(T data) {
		Node memorized = head;
		head = new Node();
		head.data = data;
		head.next = memorized;
		counter++;
	}

	@Override
	public T pop() {

		if (head == null) {
			return null;
		}

		T reObj = head.data;
		head = head.next;
		counter--;
		return reObj;
	}

	@Override
	public T peek() {
		if (head == null) {
			return null;
		}
		return head.data;
	}

	@Override
	public boolean empty() {
		return head == null;
	}

	@Override
	public void clear() {
		counter = 0;
		head = null;
	}

	@Override
	public int size() {
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

}
