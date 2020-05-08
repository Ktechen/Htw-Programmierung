package commands.list.singlyList;

import cli.Console;
import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;

public class GetAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int index = console.readIntegerFromStdin("Please enter Index ", "Input is not valid");
		SinglyLinkedListAction.list.get(index);
	}

	@Override
	public String toString() {
		return "Returns the Student at the specified position in this list.";
	}
}
