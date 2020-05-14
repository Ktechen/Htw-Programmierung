package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;

public class PrintAction implements ICommand{

	@Override
	public void execute() {
		CommandInvoker.stack.printAll();
	}

	@Override
	public String toString() {
		return "Print all students from stack.";
	}
	
	
	
}
