package main;

import comparator.Comparator;
import comparator.MatriculationNumberComparator;
import data.Student;
import sort.BubbleSort;
import sort.InsertSort;
import sort.SelectionSort;
import sort.Sortable;

public class Main {

	public static void main(String[] args) {

		Student[] data0 = { new Student("Kevin", "Techen", 3, 3000), new Student("Kevin", "li", 2, 2000),
				new Student("Tim", "Bauer", 1, 5000), new Student("Hans", "Paul", 7, 4000) };
		
		Student[] data1 = { new Student("Kevin", "Techen", 3, 3000), new Student("Kevin", "li", 2, 2000),
				new Student("Tim", "Bauer", 1, 5000), new Student("Hans", "Paul", 7, 4000) };
		
		Student[] data2 = { new Student("Kevin", "Techen", 3, 3000), new Student("Kevin", "li", 2, 2000),
				new Student("Tim", "Bauer", 1, 5000), new Student("Hans", "Paul", 7, 4000) };

		print(data0, new BubbleSort<Student>(), new MatriculationNumberComparator());
		print(data1, new SelectionSort<Student>(), new MatriculationNumberComparator());
		print(data2, new InsertSort<Student>(), new MatriculationNumberComparator());
		
	}

	private static <T> void print(T[] data, Sortable<T> sortable, Comparator<T> com) {

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
