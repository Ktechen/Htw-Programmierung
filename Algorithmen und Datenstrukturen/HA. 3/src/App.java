import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class App {

	public static void main(String[] args) {
		run();
	}
	
	private static void run() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandList();
		CommandInvoker invoker = new CommandInvoker(commands, console);
		invoker.run();
	}

}
