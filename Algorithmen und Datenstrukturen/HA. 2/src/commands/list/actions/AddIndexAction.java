package commands.list.actions;

import cli.Console;
import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.InputAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class AddIndexAction extends InputAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();

		int size = SinglyLinkedListAction.list.size();
		int index = console.readIntegerFromStdin("Please enter Index (in Range of " + "0 - " + size + " )",
				"Input is not valid");

		try {
			
			Listable<Student> list = null;
			
			if(CommandOption.isWhichList()) {
				list = DoublyLinkedListAction.list;
			}else {
				list = SinglyLinkedListAction.list;
			}
			
			list.add(index, createInputofCurrentParameter());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public String toString() {
		return "Inserts the Student at the specified position in this list (Tested? [x])";
	}

}
