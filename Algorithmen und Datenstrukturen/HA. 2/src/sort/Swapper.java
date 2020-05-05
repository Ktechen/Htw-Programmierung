package sort;

import list.Listable;
public class Swapper<T>{

	protected void swap(Listable<T> list, int i, int j) {
		T memorizedObject = list.get(i);
		list.set(i, list.get(j));
		list.set(j,  memorizedObject);
	}
}
