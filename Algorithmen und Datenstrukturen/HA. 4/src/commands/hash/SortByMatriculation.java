package commands.hash;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class SortByMatriculation implements ICommand{

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSort();
		CommandInvoker invoker = new CommandInvoker(commands, console, "Select a Sort property: ");
		invoker.run();
	}

	@Override
	public String toString() {
		return "Sort students by matriculation number";
	}
}
