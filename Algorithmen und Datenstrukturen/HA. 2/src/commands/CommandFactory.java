package commands;

import java.util.LinkedList;

import commands.list.DoublyLinkedListAction;

import commands.list.SinglyLinkedListAction;
import commands.list.actions.AddAction;
import commands.list.actions.AddFirstAction;
import commands.list.actions.AddIndexAction;
import commands.list.actions.AddLastAction;
import commands.list.actions.ClearAction;
import commands.list.actions.GetAction;
import commands.list.actions.PrintAllAction;
import commands.list.actions.RemoveAction;
import commands.list.actions.SizeAction;
import commands.search.SearchAction;

import commands.sort.BubbleSortAction;
import commands.sort.SelectionSortAction;
import commands.sort.SortAction;
import commands.sort.action.CourseSort;
import commands.sort.action.MatriculationNumberSort;
import commands.sort.action.PrenameSort;
import commands.sort.action.SurnameSort;
import commands.system.ExitCmd;

public class CommandFactory {

	/*
	 * Start Options
	 * @return list of options
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
	 * @return list of options
	 */
	public static LinkedList<ICommand> createCommandSinglyList() {

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
	 * @return list of options
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
	 * @return list of options
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
	 * @return list of options
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
	 * @return list of options
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
	 * @return list of options
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
