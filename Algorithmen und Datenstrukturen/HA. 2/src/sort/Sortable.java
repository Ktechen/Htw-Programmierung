package sort;

import java.util.List;

public interface Sortable<T> {
	public void sort(List<T> list, Comparator<T> comparator);
}
