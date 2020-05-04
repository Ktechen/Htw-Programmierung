package sort;

import java.util.List;

import comparator.Comparator;

public class BubbleSort<T> extends Swapper<T> implements Sortable<T> {

	@Override
	public void sort(List<T> list, Comparator<T> comparator) {
		for (int i = 1; i < list.size(); i++) {
			for (int e = 0; e < list.size() - i; e++ ) {
				if (comparator.compare(list.get(e), list.get(e + 1)) > 0) {
					swap(list, e, e + 1);
				}
			}
		}
	}

}
