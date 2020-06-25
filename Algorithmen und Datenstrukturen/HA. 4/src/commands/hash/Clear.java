package commands.hash;

import commands.ICommand;
import main.HashInvoker;

public class Clear implements ICommand{

	@Override
	public void execute() {
	}

	@Override
	public String toString() {
		return "Clear hash table";
	}
}
