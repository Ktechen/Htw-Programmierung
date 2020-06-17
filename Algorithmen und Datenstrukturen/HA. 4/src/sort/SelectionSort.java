package sort;

import comparator.Comparator;

public class SelectionSort<T> extends Swapper<T> implements Sortable<T>{

	@Override
	public void sort(T[] data, Comparator<T> com) {
		
		int minimun = 0;
		for (int i = 0; i < data.length; i++) {
			minimun = i;
			for (int e = i + 1; e < data.length; e++) {
				if(com.compare(data[e], data[minimun]) < 0) {
					minimun = e;
				}
				
			}
			swap(data, i, minimun);
		}
	}

}
