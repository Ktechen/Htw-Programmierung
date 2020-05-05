package sort;

import java.util.List;

import comparator.Comparator;
import list.Listable;
import list.SinglyLindedList;

public interface Sortable<T>{
	public void sort(Listable<T> list, Comparator<T> comparator);
}
