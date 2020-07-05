package main;

import java.util.LinkedList;
import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;

public class Main {
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommand();
		CommandInvoker invoker = new CommandInvoker(commands, console);
		invoker.run();
	}
}
