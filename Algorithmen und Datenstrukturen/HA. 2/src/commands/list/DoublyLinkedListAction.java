package commands.list;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;
import list.DoublyLinkedList;

public class DoublyLinkedListAction implements ICommand {

	public static DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();;
	
	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandDoublyList();
		CommandInvoker invoker = new CommandInvoker(commands, console, headline, "You selected DoublyLinkedList:", footer);
		invoker.run();
	}

	@Override
	public String toString() {
		return "DoublyLinkedListAction";
	}

}
