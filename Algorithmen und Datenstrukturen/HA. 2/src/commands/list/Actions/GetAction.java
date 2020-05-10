package commands.list.Actions;

import cli.Console;
import commands.CommandFactory;
import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class GetAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int index = console.readIntegerFromStdin("Please enter Index ", "Input is not valid");
		
		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		list.get(index);
	}

	@Override
	public String toString() {
		return "Returns the Student at the specified position in this list.";
	}
}
