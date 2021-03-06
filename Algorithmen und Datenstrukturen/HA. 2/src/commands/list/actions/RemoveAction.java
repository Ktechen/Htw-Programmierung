package commands.list.actions;

import cli.Console;
import commands.CommandFactory;
import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class RemoveAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int index = console.readIntegerFromStdin("Please enter Index to remove element: ", "Input is not valid");
		
		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		list.remove(index);

		System.out.println(index + " was been removed");
	}

	@Override
	public String toString() {
		return "Removes the Student at the specified position in this list. (Tested? [x])";
	}
}
