package commands.actions.singlyList;

import cli.Console;
import commands.CommandFactory;
import commands.ICommand;
import data.Student;

public class AddFirstAction implements ICommand{


	@Override
	public void execute() {
		Console console = new Console();

		String prename = console.readStringFromStdin("Please enter prename: ", "Input is not valid");
		String surname = console.readStringFromStdin("Please enter surname: ", "Input is not valid");

		int course = console.readIntegerFromStdin("Please enter course: ", "Input is not valid");
		int matriculationNumber = console.readIntegerFromStdin("Please enter Matriclation Number: ",
				"Input is not valid");

		Student data = new Student(surname, prename, course, matriculationNumber);
		CommandFactory.Singlylist.addFirst(data);
	}
	
	@Override
	public String toString() {
		return "Inserts the Student at the beginning of this list";
	}
}
