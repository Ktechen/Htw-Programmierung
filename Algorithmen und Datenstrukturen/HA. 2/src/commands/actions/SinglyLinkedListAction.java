package commands.actions;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class SinglyLinkedListAction implements ICommand {
	
	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSinglyList(console);
		CommandInvoker invoker = new CommandInvoker(commands, console, headline, "You selected SinglyLinkedList:", footer);
		invoker.run();
	}

	@Override
	public String toString() {
		return "SinglyLinkedListAction";
	}

}
