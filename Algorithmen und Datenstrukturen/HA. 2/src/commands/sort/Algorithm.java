package commands.sort;

import comparator.Comparator;
import data.Student;
import list.Listable;
import sort.Sortable;

public class Algorithm {

	public static void sortAndPrint(Listable<Student> list, Sortable<Student> algorithm,
			Comparator<Student> comparator) {

		System.out.println("Sort Algorithm " + algorithm.getClass().getSimpleName() + " Comparator: "
				+ comparator.getClass().getSimpleName());

		algorithm.sort(list, comparator);

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println();

	}

	@Override
	public String toString() {
		return "Algorithm";
	}

}
