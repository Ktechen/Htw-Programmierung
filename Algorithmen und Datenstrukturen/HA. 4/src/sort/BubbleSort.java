package sort;

import comparator.Comparator;

public class BubbleSort<T> extends Swapper<T> implements Sortable<T> {

	@Override
	public void sort(T[] data, Comparator<T> com) {

		for (int i = 0; i < data.length; i++) {

			for (int e = 0; e < data.length - 1; e++) {
				T a = data[e];
				T b = data[e + 1];

				if (com.compare(a, b) > 0) {
					swap(data, e, e + 1);
				}
			}
		}

	}

}
