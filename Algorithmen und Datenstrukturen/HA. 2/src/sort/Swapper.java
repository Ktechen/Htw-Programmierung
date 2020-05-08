package sort;

import list.Listable;
public class Swapper<T>{

	protected void swap(Listable<T> list, int a, int b) {
		T memorizedObject = list.get(a);
		list.set(a, list.get(b));
		list.set(b,  memorizedObject);
	}
}
