package test;

import org.junit.Test;

import data.Student;
import list.Listable;
import list.SinglyLindedList;
import search.Search;
import search.SearchOptions;

public class SearchTest {

	@Test
	public void searchString() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);
		Student s5 = new Student("Trumph", "Ted", 16, 300);
		Student s6 = new Student("Tröger", "Ted", 1, 200);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		Search searchList = new Search();
		Listable<Student> test = searchList.search(list, "Ted", SearchOptions.prename);
		
		test.printAll();

	}
	
	@Test
	public void searchInt() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);
		Student s5 = new Student("Trumph", "Ted", 16, 300);
		Student s6 = new Student("Tröger", "Ted", 1, 200);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Search searchList = new Search();
		Listable<Student> test = searchList.search(list, 1, SearchOptions.course);
		
		test.printAll();
	}
}
