package sort;

import comparator.Comparator;
import data.Student;

public interface Sortable<T> {
	public void sort(T[] data, Comparator<T> com);
}
