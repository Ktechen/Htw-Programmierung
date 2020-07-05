package commands.hash;

import cli.Console;
import commands.ICommand;
import main.HashInvoker;

public class Get implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int key = console.readIntegerFromStdin("Value: ", "Invalid Value !");
		HashInvoker.getIndexOfValue(HashInvoker.table.getHashArray(), key);
	}

	@Override
	public String toString() {
		return "Get number from hash table";
	}
}
