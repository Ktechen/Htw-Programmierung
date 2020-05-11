package test;

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

		System.out.println("addLast");

		list.printAll();
	}

	@Test
	public void addFirst() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();
		list.addFirst(s1);
		list.addFirst(s2);
		list.addFirst(s3);
		list.addFirst(s4);

		System.out.println("addFirst");

		list.printAll();
	}

	@Test
	public void addIndex() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();
		list.add(0, s1);

		System.out.println("AddIndex 0");

		list.printAll();
	}

	@Test
	public void addIndexAddMore() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);
		Student s5 = new Student("Paul", "Panzer", 56, 11);
		Student s6 = new Student("Peter", "NichtLustig", 56, 11);

		DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		list.add(0, s5);
		list.add(2, s6);

		System.out.println("addIndexAddMore ");

		list.printAll();
	}
}
