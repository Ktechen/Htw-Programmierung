package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import data.Student;
import list.SinglyLindedList;

public class SinglyListTest {

	@Test
	public void PrintAll() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> singlyLindedList = new SinglyLindedList<Student>();
		singlyLindedList.add(s1);
		singlyLindedList.add(s2);
		singlyLindedList.add(s3);
		singlyLindedList.add(s4);

		System.out.println();

		singlyLindedList.printAll();

		System.out.println();

		assertNotNull(singlyLindedList.get(0));
	}

	@Test
	public void addElement() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);

		SinglyLindedList<Student> singlyLindedList = new SinglyLindedList<Student>();
		singlyLindedList.add(s1);

		assertNotNull(singlyLindedList.get(0));
	}

	@Test
	public void addFirst() {

		Student s0 = null;
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println();

		list.addFirst(s0);

		list.printAll();

		System.out.println();
	}

	@Test
	public void add() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println("add");

		list.add(3, new Student("Bobs", "Burger", 2000, 4));

		list.printAll();

		System.out.println();

		assertEquals(list.get(3).toString(), "Student [surname=Bobs, prename=Burger, course=2000, matriculationNumber=4]");
	}
	
	@Test
	public void set() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		list.set(0, new Student("Bobs", "Burger", 2000, 4));
		
		System.out.println("set");
		list.printAll();
		
		System.out.println();
		
		assertEquals(list.get(0).toString(), "Student [surname=Bobs, prename=Burger, course=2000, matriculationNumber=4]");
	}
	
	@Test
	public void remove() {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("remove");
		
		list.remove(0);
		list.printAll();
		
		System.out.println();
		
		assertEquals(list.get(0), null);
	}
}
