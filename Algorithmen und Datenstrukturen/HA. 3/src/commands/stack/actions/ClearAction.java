package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;

public class ClearAction implements ICommand{

	@Override
	public void execute() {
		CommandInvoker.stack.clear();
	}

	@Override
	public String toString() {
		return "Clear stack.";
	}

	
}
