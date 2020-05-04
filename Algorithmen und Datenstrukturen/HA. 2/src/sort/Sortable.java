package sort;

import java.util.List;

import comparator.Comparator;

public interface Sortable<T> {
	public void sort(List<T> list, Comparator<T> comparator);
}
