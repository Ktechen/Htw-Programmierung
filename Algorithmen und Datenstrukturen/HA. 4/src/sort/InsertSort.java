package sort;

import comparator.Comparator;

public class InsertSort<T> extends Swapper<T> implements Sortable<T>{

	@Override
	public void sort(T[] data, Comparator<T> com) {
        for (int i = 0; i < data.length; i++) {
            for (int e = 1; e < data.length; e++) {
            	
            	if(com.compare(data[e-1], data[e]) > 0) {
            		swap(data, e-1, e);
            	}
            	
            }
        }
	}

}
