package commands;

import java.util.LinkedList;

import cli.Console;
import commands.actions.DoublyLinkedListAction;
import commands.actions.SinglyLinkedListAction;
import commands.actions.singlyList.AddAction;
import commands.actions.singlyList.AddFirstAction;
import commands.actions.singlyList.AddIndexAction;
import commands.actions.singlyList.AddLastAction;
import commands.actions.singlyList.GetAction;
import commands.actions.singlyList.PrintAllAction;
import commands.system.ExitCmd;
import data.Student;
import list.DoublyLinkedList;
import list.SinglyLindedList;

public class CommandFactory {

	/*
	 * create SinglyLinkedList
	 */
	public static SinglyLindedList<Student> Singlylist = new SinglyLindedList<Student>();
	
	/*
	 * create DoublyLinkedList
	 */
	public static DoublyLinkedList<Student> DoublyList = new DoublyLinkedList<Student>();
	
	public static LinkedList<ICommand> createCommandList(Console console) {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new SinglyLinkedListAction());
		list.add(new DoublyLinkedListAction());
		return list;
	}

	/*
	 * Option for SinglyList
	 */
	public static LinkedList<ICommand> createCommandSinglyList(Console console){
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new AddAction());
		list.add(new AddIndexAction());
		list.add(new AddFirstAction());
		list.add(new AddLastAction());
		list.add(new GetAction());
		list.add(new PrintAllAction());
		return list;
	}
	
	/*
	 * Option for DoublyList
	 */
	public static LinkedList<ICommand> createCommandDoublyList(Console console){
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		return list;
	}
}
