package sort;

import comparator.Comparator;
import list.Listable;

public interface Sortable<T>{
	public void sort(Listable<T> list, Comparator<T> comparator);
}
