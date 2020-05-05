import comparator.Comparator;
import comparator.CourseNumberComparator;
import comparator.MatriculationNumberComparator;
import comparator.PrenameComparator;
import comparator.SurnameComparator;
import data.Student;
import list.DoublyLinkedList;
import list.Listable;
import list.SinglyLindedList;
import sort.BubbleSort;
import sort.SelectionSort;
import sort.Sortable;

class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> SinglyList = new SinglyLindedList<Student>();
		SinglyList.add(s1);
		SinglyList.add(s2);
		SinglyList.add(s3);
		SinglyList.add(s4);

		sortAndPrint(SinglyList, new BubbleSort<Student>(), new PrenameComparator());
		sortAndPrint(SinglyList, new BubbleSort<Student>(), new SurnameComparator());
		sortAndPrint(SinglyList, new BubbleSort<Student>(), new CourseNumberComparator());
		sortAndPrint(SinglyList, new BubbleSort<Student>(), new MatriculationNumberComparator());
		
		sortAndPrint(SinglyList, new SelectionSort<Student>(), new PrenameComparator());
		sortAndPrint(SinglyList, new SelectionSort<Student>(), new SurnameComparator());
		sortAndPrint(SinglyList, new SelectionSort<Student>(), new CourseNumberComparator());
		sortAndPrint(SinglyList, new SelectionSort<Student>(), new MatriculationNumberComparator());

		
		run(new SinglyLindedList<Student>());
		System.out.println();
		run(new DoublyLinkedList<Student>());

	}

	private static void sortAndPrint(Listable<Student> list, Sortable<Student> algorithm, Comparator<Student> comparator) {
		System.out.println("Sort Algorithm " + algorithm.getClass().getSimpleName() + " Comparator: "
				+ comparator.getClass().getSimpleName());

		algorithm.sort(list, comparator);

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println();
	}

	private static void run(Listable<Student> students) {
		students.addLast(readStudentsFromStdIn());

		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		students.add(s2);
		students.addLast(s3);

		printList(students);
	}

	private static Student readStudentsFromStdIn() {
		Student student = new Student("Mosby", "Ted", 1, 100);
		return student;
	}

	private static void printList(Listable<Student> students) {
		System.out.println("Type: " + students.getClass().getSimpleName());
		System.out.println("Size: " + students.size());
		System.out.println("IsEmpty: " + students.isEmpty());
		System.out.println("Students");
		System.out.println("------------------------");
		System.out.println("Get 0:" + students.get(0));
		System.out.println("Get 1:" + students.get(1));
		System.out.println("Get 2:" + students.get(2));
		students.printAll();
	}
}
