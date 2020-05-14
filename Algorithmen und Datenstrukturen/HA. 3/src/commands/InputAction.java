package commands;

import cli.Console;
import data.Student;

public class InputAction implements IStudentInput {

	/*
	 * Read userinput about prename, surname, course and  Matriculation Number
	 * @return data object of Student
	 */
	@Override
	public Student createInputofCurrentParameter() {
		Console console = new Console();

		String prename = console.readStringFromStdin("Please enter prename: ", "Input is not valid !");
		String surname = console.readStringFromStdin("Please enter Surname: ", "Input is not valid !");

		int course = console.readIntegerFromStdin("Please enter Course: ", "Input is not valid !");
		int makNr = console.readIntegerFromStdin("Please enter Matriculation Number: ", "Input is not valid !");

		Student data = new Student(prename, surname, course, makNr);

		return data;
	}
}
