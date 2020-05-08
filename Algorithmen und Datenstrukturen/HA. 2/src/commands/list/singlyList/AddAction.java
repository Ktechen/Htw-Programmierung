package commands.list.singlyList;

import cli.Console;
import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;
import data.Student;

public class AddAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();

		String prename = console.readStringFromStdin("Please enter prename: ", "Input is not valid");
		String surname = console.readStringFromStdin("Please enter surname: ", "Input is not valid");

		int course = console.readIntegerFromStdin("Please enter course: ", "Input is not valid");
		int matriculationNumber = console.readIntegerFromStdin("Please enter Matriclation Number: ",
				"Input is not valid");

		Student data = new Student(surname, prename, course, matriculationNumber);
		SinglyLinkedListAction.list.add(data);
	}

	@Override
	public String toString() {
		return "Add Student to the end of this list";
	}
}
