import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;
import list.Listable;

public class App {

	public static void main(String[] args) {
		run("Console-Application: Exercise-2  ", "Select list type before starting the main menu:",
				"Please enter a number for an option:");
	}

	private static void run(String headline, String title, String footer) {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandList();
		CommandInvoker invoker = new CommandInvoker(commands, console, headline, title, footer);
		invoker.run();
	}
}
