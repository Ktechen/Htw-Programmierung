package commands.sort;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class BubbleSortAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandPropertOfSortFromBubbleSort();
		CommandInvoker invoker = new CommandInvoker(commands, console,
				"Please select a property for sorting with the 'Bubblesort' algorithm:");
		invoker.run();
	}

	@Override
	public String toString() {
		return "Bubblesort?";
	}

}
