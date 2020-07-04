package commands.hash;

import cli.Console;
import commands.ICommand;
import main.HashInvoker;

public class Delete implements ICommand{

	@Override
	public void execute() {
		Console console = new Console();
		int key = console.readIntegerFromStdin("Value: ", "Invalid Value !");
		HashInvoker.remove(HashInvoker.table, key);
	}

	@Override
	public String toString() {
		return "Delete number from hash table.";
	}
}
