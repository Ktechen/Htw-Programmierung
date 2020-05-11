package commands.search.action;

import cli.Console;
import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;
import search.Search;
import search.SearchOptions;

public class CourseSearch implements ICommand {

	private Listable<Student> list = null;
	private Console console = new Console();
	private Search newSearch = new Search();

	@Override
	public void execute() {
		if (CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		} else {
			list = SinglyLinkedListAction.list;
		}

		String search = console.readStringFromStdin("Please enter course for the search: ", "Input is not valid !");

		Listable<Student> text = newSearch.search(list, search, SearchOptions.course);
		System.out.println("Search: " + search);
		text.printAll();
	}

	@Override
	public String toString() {
		return "Search by Course? ";
	}

}
