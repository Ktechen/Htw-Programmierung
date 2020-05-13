package commands.sort;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class SortAction implements ICommand{

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSort();
		CommandInvoker invoker = new CommandInvoker(commands, console, "Select a sorting method for sorting: ");
		invoker.run();
	}

	@Override
	public String toString() {
		return "Sort list by different properties (Tested? [x])";
	}

}
