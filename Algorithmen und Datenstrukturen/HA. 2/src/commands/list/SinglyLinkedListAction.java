package commands.list;

import java.util.LinkedList;

import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;
import list.Listable;
import list.SinglyLindedList;

public class SinglyLinkedListAction implements ICommand {
	
	//selfmade Singly linked list
	public static SinglyLindedList<Student> list = new SinglyLindedList<Student>();
	
	@Override
	public void execute() {
		Console console = new Console();
		LinkedList<ICommand> commands = CommandFactory.createCommandSinglyList();
		CommandInvoker invoker = new CommandInvoker(commands, console, "You selected SinglyLinkedList:");
		invoker.run();
	}

	@Override
	public String toString() {
		return "SinglyLinkedListAction";
	}

}
