package commands.search;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class SearchAction implements ICommand{

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSearch();
		CommandInvoker invoker = new CommandInvoker(commands, console, "Select a property to search for the student:");
		invoker.run();
	}

	@Override
	public String toString() {
		return "Search for student(s) by different characteristics";
	}

}
