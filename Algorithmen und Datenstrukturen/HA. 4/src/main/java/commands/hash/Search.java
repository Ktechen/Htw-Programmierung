package commands.hash;

import cli.Console;
import commands.ICommand;
import main.HashInvoker;

public class Search implements ICommand{

	@Override
	public void execute() {
		Console console = new Console();
		int key = console.readIntegerFromStdin("Value: ", "Invalid Value !");
		HashInvoker.search(HashInvoker.table, key);
	}

	@Override
	public String toString() {
		return "Search number in hash table";
	}
}
