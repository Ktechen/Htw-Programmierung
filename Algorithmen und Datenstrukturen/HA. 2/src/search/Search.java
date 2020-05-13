package search;

import data.Student;
import list.Listable;
import list.SinglyLindedList;

public class Search implements ISearchable<Student> {

	/*
	 * Search a String inside of List
	 * 
	 * @return LinkedList
	 */
	@Override
	public Listable<Student> search(Listable<Student> list, String search, SearchOptions option) {

		SinglyLindedList<Student> newList = new SinglyLindedList<Student>();

		if (search != null && list != null) {

			int counter = 0;

			for (int i = 0; i < list.size(); i++) {

				Student student = list.get(i);

				String value = search.toLowerCase().trim();

				switch (option) {

				case prename:
					String prename = student.getPrename().toLowerCase().trim();

					if (value.equals(prename)) {
						// System.out.println("prename:" + list.get(i));
						newList.add(counter, list.get(i));
						counter++;
					}

					break;

				case surname:
					String surname = student.getSurname().toLowerCase().trim();

					if (value.equals(surname)) {
						// System.out.println("surname:" + list.get(i));
						newList.add(counter, list.get(i));
						counter++;
					}

					break;

				default:
					break;
				}
			}
		} else {
			return null;
		}

		return newList;
	}

	/*
	 * Search a Integer inside of List
	 * 
	 * @return LinkedList
	 */
	@Override
	public Listable<Student> search(Listable<Student> list, int search, SearchOptions option) {

		SinglyLindedList<Student> newList = new SinglyLindedList<Student>();

		if (list != null) {
			int counter = 0;

			for (int i = 0; i < list.size(); i++) {

				Student student = list.get(i);

				int value = search;

				switch (option) {
				case course:
					int course = student.getCourse();

					if (value == course) {
						// System.out.println("course:" + list.get(i));
						newList.add(counter, list.get(i));
						counter++;
					}

					break;
				case matriculationNumber:
					int matriculationNumber = student.getCourse();

					if (value == matriculationNumber) {
						// System.out.println("matriculationNumber:" + list.get(i));
						newList.add(counter, list.get(i));
						counter++;
					}

					break;

				default:
					break;
				}
			}
		} else {
			return null;
		}

		return newList;
	}

	@Override
	public String toString() {
		return "search";
	}

}
