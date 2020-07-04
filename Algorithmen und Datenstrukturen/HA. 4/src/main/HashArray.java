package main;

public class HashArray {

	private int size;

	private class Item {

		public Item(int key) {
			super();
			this.key = key;
		}

		int key = Integer.MIN_VALUE;
		boolean markAsDeleted = false;
	}

	private Item[] hashArray;

	public HashArray(int size) {
		super();
		this.size = size;
		this.hashArray = new Item[size];
	}

	public boolean isMarkAsDeleted(int idx) {
		return this.hashArray[idx].markAsDeleted;
	}

	public boolean compareKeys(int idx, int key) {
		return this.hashArray[idx].key == key;
	}

	public void markAsDeleted(int idx) {
		this.hashArray[idx].markAsDeleted = true;
		this.hashArray[idx].key = Integer.MIN_VALUE;
	}

	public boolean isFree(int idx) {
		return this.hashArray[idx] == null;
	}

	public int get(int idx) {

		if (idx >= 0) {

			if (idx <= size) {

				if (hashArray[idx] != null) {
					return this.hashArray[idx].key;
				} else {
					throw new NullPointerException("key is null");
				}

			} else {
				throw new ArrayIndexOutOfBoundsException("Index out of Range");
			}

		}

		throw new NullPointerException("key is null");
	}

	public void set(int idx, int key) {
		this.hashArray[idx] = new Item(key);
	}

	public void clear() {
		this.hashArray = new Item[size];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (Item item : hashArray) {
			if (item == null) {
				builder.append("**, ");
			} else {
				builder.append(item.markAsDeleted ? "##, " : item.key + ", ");
			}
		}
		builder.append("]");
		return builder.toString();
	}

}
