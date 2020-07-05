package commands.sort;

import comparator.Comparator;
import sort.Sortable;

public class SortInvoker {
	
	public static <T> void print(T[] data, Sortable<T> sortable, Comparator<T> com) {

		System.out.println("Name: " + sortable.getClass().getSimpleName());
		System.out.println("Before:");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		sortable.sort(data, com);

		System.out.println("After:");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		System.out.println("-------------------------------------------------------------------------");
	}
	
}
