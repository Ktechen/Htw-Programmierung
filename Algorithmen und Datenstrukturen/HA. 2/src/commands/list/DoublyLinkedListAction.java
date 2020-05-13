package commands.list;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;
import list.DoublyLinkedList;
import list.Listable;

public class DoublyLinkedListAction implements ICommand {

	//selfmade Doubly linked list
	public static DoublyLinkedList<Student> list = new DoublyLinkedList<Student>();;
	
	/*
	 * Load List of option and open console input
	 */
	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandDoublyList();
		CommandInvoker invoker = new CommandInvoker(commands, console, "You selected DoublyLinkedList:");
		invoker.run();
	}

	@Override
	public String toString() {
		return "DoublyLinkedListAction";
	}

}
