import java.util.Arrays;

import java.util.List;

import data.Student;
import list.MatriculationNumberComparator;
import list.PrenameComparator;
import sort.BubbleSort;
import sort.SelectionSort;
import sort.Sortable;
import sort.Comparator;

class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		List<Student> list = Arrays.asList(s1, s2, s3, s4);

		sortAndPrint(list, new BubbleSort<Student>(), new MatriculationNumberComparator());
		sortAndPrint(list, new BubbleSort<Student>(), new PrenameComparator());

		sortAndPrint(list, new SelectionSort<Student>(), new MatriculationNumberComparator());
		sortAndPrint(list, new SelectionSort<Student>(), new PrenameComparator());
	}

	private static void sortAndPrint(List<Student> list, Sortable<Student> algorithm, Comparator<Student> comparator) {
		System.out.println("Sort Algorithm" + algorithm.getClass().getSimpleName() + " Comparator: "
				+ comparator.getClass().getSimpleName());

		algorithm.sort(list, comparator);

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println();
	}
}
