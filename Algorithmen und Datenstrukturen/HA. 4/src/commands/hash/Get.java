package commands.hash;

import cli.Console;
import commands.ICommand;
import main.HashInvoker;

public class Get implements ICommand {

	@Override
	public void execute() {
		Console console = new Console();
		int key = console.readIntegerFromStdin("Value: ", "Invalid Value !");

		try {
			HashInvoker.getValue(HashInvoker.table.getHashArray(), key);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}

	}

	@Override
	public String toString() {
		return "Get number from hash table";
	}
}
