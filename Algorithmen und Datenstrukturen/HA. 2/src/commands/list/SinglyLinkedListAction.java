package commands.list;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;
import list.SinglyLindedList;

public class SinglyLinkedListAction implements ICommand {
	
	public static SinglyLindedList<Student> list = new SinglyLindedList<Student>();
	
	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSinglyList();
		CommandInvoker invoker = new CommandInvoker(commands, console, headline, "You selected SinglyLinkedList:", footer);
		invoker.run();
	}

	@Override
	public String toString() {
		return "SinglyLinkedListAction";
	}

}
