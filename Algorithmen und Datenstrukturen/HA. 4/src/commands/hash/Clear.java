package commands.hash;

import cli.Console;
import commands.ICommand;
import main.ADSHashTable;
import main.HashInvoker;

public class Clear implements ICommand{

	@Override
	public void execute() {
		HashInvoker.table.getHashArray().clear();
	}

	@Override
	public String toString() {
		return "Clear hash table";
	}
}
