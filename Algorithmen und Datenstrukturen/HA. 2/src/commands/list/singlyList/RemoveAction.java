package commands.list.singlyList;

import cli.Console;
import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;

public class RemoveAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int index = console.readIntegerFromStdin("Please enter Index to remove element: ", "Input is not valid");
		SinglyLinkedListAction.list.remove(index);

		System.out.println(index + " was been removed");
	}

	@Override
	public String toString() {
		return "Removes the Student at the specified position in this list.";
	}
}
