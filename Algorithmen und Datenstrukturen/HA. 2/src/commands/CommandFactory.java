package commands;

import java.util.LinkedList;

import commands.list.DoublyLinkedListAction;

import commands.list.SinglyLinkedListAction;
import commands.list.Actions.AddAction;
import commands.list.Actions.AddFirstAction;
import commands.list.Actions.AddIndexAction;
import commands.list.Actions.AddLastAction;
import commands.list.Actions.ClearAction;
import commands.list.Actions.GetAction;
import commands.list.Actions.PrintAllAction;
import commands.list.Actions.RemoveAction;
import commands.list.Actions.SizeAction;
import commands.search.SearchAction;

import commands.sort.BubbleSortAction;
import commands.sort.SelectionSortAction;
import commands.sort.SortAction;
import commands.sort.property.CourseSort;
import commands.sort.property.MatriculationNumberSort;
import commands.sort.property.PrenameSort;
import commands.sort.property.SurnameSort;
import commands.system.ExitCmd;

public class CommandFactory {

	/*
	 * Start Options
	 */
	public static LinkedList<ICommand> createCommandList() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new SinglyLinkedListAction());
		list.add(new DoublyLinkedListAction());
		list.add(new ExitCmd());
		return list;
	}

	/*
	 * Option for SinglyList
	 */
	public static LinkedList<ICommand> createCommandSinglyList() {
		CommandOption.setWhichList(false);

		LinkedList<ICommand> list = new LinkedList<ICommand>();
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
		list.add(new ExitCmd());
		return list;
	}

	/*
	 * Option for DoublyList
	 */
	public static LinkedList<ICommand> createCommandDoublyList() {
		CommandOption.setWhichList(true);

		LinkedList<ICommand> list = new LinkedList<ICommand>();
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
		list.add(new ExitCmd());
		return list;
	}

	/*
	 * Option for propertOfSort
	 */
	public static LinkedList<ICommand> createCommandPropertOfSortFromBubbleSort() {
		CommandOption.setWhichSort(false);
		
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new PrenameSort());
		list.add(new SurnameSort());
		list.add(new CourseSort());
		list.add(new MatriculationNumberSort());
		list.add(new ExitCmd());
		return list;
	}
	
	/*
	 * Option for propertOfSort
	 */
	public static LinkedList<ICommand> createCommandPropertOfSortFromSelectionSort() {
		CommandOption.setWhichSort(true);
		
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new PrenameSort());
		list.add(new SurnameSort());
		list.add(new CourseSort());
		list.add(new MatriculationNumberSort());
		list.add(new ExitCmd());
		return list;
	}

	/*
	 * Option for search
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
