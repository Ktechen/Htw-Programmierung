package test;

import org.junit.Test;

import data.Student;
import list.SinglyLindedList;
import search.SearchPrename;
import search.ISearchable.Options;

public class SearchTest {

	@Test
	public void search() {

		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Donald", "Duck", 56, 55);
		Student s3 = new Student("Cooper", "Shelden", 1, 999);
		Student s4 = new Student("Alice", "Cooper", 56, 11);
		Student s5 = new Student("Mosby", "Ted", 1, 100);
		Student s6 = new Student("Mosby", "Ted", 1, 100);

		SinglyLindedList<Student> list = new SinglyLindedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		SearchPrename searchList = new SearchPrename();
		searchList.searchString(list, "", Options.prename);

	}
}
