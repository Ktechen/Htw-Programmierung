package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;

public class SizeAction implements ICommand{

	@Override
	public void execute() {
		System.out.println(CommandInvoker.stack.size());
	}

	@Override
	public String toString() {
		return "Get size of stack.";
	}
	
}
