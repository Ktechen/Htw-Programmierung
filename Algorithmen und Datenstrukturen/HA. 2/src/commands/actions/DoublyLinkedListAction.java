package commands.actions;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class DoublyLinkedListAction implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandDoublyList(console);
		CommandInvoker invoker = new CommandInvoker(commands, console, headline, "You selected DoublyLinkedList:", footer);
		invoker.run();
	}

	@Override
	public String toString() {
		return "DoublyLinkedListAction";
	}

}
