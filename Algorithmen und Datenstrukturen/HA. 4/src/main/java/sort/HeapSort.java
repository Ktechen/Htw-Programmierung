package sort;

import comparator.Comparator;

public class HeapSort<T> extends Swapper<T> implements Sortable<T> {

	@Override
	public void sort(T[] data, Comparator<T> com) {

		for (int i = data.length / 2 - 1; i >= 0; i--) {
			heap(data, data.length, i, com);
		}

		for (int i = data.length - 1; i > 0; i--) {
			swap(data, 0, i);
			heap(data, i, 0, com);
		}
	}

	private void heap(T[] data, int n, int i, Comparator<T> com) {
		int max = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && com.compare(data[l], data[max]) > 0) {
			max = l;
		}

		if (r < n && com.compare(data[r], data[max]) > 0) {
			max = r;
		}

		if (max != i) {
			swap(data, i, max);
			heap(data, n, max, com);
		}
	}

}
