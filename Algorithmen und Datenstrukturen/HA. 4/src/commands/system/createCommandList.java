package commands.system;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class createCommandList implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommand();
		CommandInvoker invoker = new CommandInvoker(commands, console);
		invoker.run();
	}
	
	@Override
	public String toString() {
		return "Back to main";
	}

}
