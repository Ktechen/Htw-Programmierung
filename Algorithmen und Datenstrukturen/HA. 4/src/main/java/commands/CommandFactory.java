package commands;

import java.util.LinkedList;

import commands.hash.Add;
import commands.hash.Clear;
import commands.hash.Delete;
import commands.hash.Get;
import commands.hash.Search;
import commands.hash.SortByMatriculation;
import commands.sort.BubbleSort;
import commands.sort.InsertSort;
import commands.sort.HeapSort;
import commands.sort.SelectionSort;
import commands.sort.ShowData;
import commands.system.ExitCmd;
import commands.system.createCommandList;

public class CommandFactory {

	/*
	 * Start Options
	 * 
	 * @return list of options
	 */
	public static LinkedList<ICommand> createCommand() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new Add());
		list.add(new Get());
		list.add(new Search());
		list.add(new Delete());
		list.add(new Clear());
		list.add(new SortByMatriculation());
		return list;
	}

	/*
	 * Option for SinglyList
	 * 
	 * @return list of options
	 */
	public static LinkedList<ICommand> createCommandSort() {

		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new ExitCmd());
		list.add(new BubbleSort());
		list.add(new InsertSort());
		list.add(new SelectionSort());
		list.add(new HeapSort());
		list.add(new createCommandList());
		list.add(new ShowData());
		return list;
	}

	@Override
	public String toString() {
		return "CommandFactory";
	}
}
