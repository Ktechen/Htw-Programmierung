package commands;

import java.util.LinkedList;

import cli.Console;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import commands.list.singlyList.AddAction;
import commands.list.singlyList.AddFirstAction;
import commands.list.singlyList.AddIndexAction;
import commands.list.singlyList.AddLastAction;
import commands.list.singlyList.ClearAction;
import commands.list.singlyList.GetAction;
import commands.list.singlyList.PrintAllAction;
import commands.list.singlyList.RemoveAction;
import commands.list.singlyList.SizeAction;
import commands.search.SearchAction;
import commands.sort.BubbleSortAction;
import commands.sort.SelectionSortAction;
import commands.sort.SortAction;
import commands.system.ExitCmd;
import data.Student;
import list.DoublyLinkedList;
import list.SinglyLindedList;
import sort.SelectionSort;

public class CommandFactory {

	/*
	 * Start Options
	 */
	public static LinkedList<ICommand> createCommandList() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new SinglyLinkedListAction());
		list.add(new DoublyLinkedListAction());
		return list;
	}

	/*
	 * Option for SinglyList
	 */
	public static LinkedList<ICommand> createCommandSinglyList() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new AddAction());
		list.add(new AddIndexAction());
		list.add(new AddFirstAction());
		list.add(new GetAction());
		list.add(new AddLastAction());
		list.add(new PrintAllAction());
		list.add(new SizeAction());
		list.add(new RemoveAction());
		list.add(new ClearAction());
		list.add(new SearchAction());
		list.add(new SortAction());
		return list;
	}

	/*
	 * Option for DoublyList
	 */
	public static LinkedList<ICommand> createCommandDoublyList() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		return list;
	}

	/*
	 * Option for sort
	 */
	public static LinkedList<ICommand> createCommandSort() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new BubbleSortAction());
		list.add(new SelectionSortAction());
		return list;
	}
	
	/*
	 * Option for sort
	 */
	public static LinkedList<ICommand> createCommandSearch() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		return list;
	}
	
	@Override
	public String toString() {
		return "CommandFactory";
	}
}
