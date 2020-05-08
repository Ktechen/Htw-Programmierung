package Test;

import org.junit.Test;

import data.Student;
import list.DoublyLinkedList;

public class DoublyListTest {

	@Test
	public void addLast() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		list.printAll();
	}

}
