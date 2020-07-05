package commands.hash;

import commands.ICommand;
import main.HashInvoker;
import cli.Console;

public class Add implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int key = console.readIntegerFromStdin("Value: ", "Invalid Value !");
		HashInvoker.insert(HashInvoker.table, key);
	}

	@Override
	public String toString() {
		return "Add number to hash table";
	}

}
