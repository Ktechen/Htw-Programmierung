package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;

public class PeekAction implements ICommand{

	@Override
	public void execute() {
		CommandInvoker.stack.peek();
	}

	@Override
	public String toString() {
		return "Peek student.";
	}
	

}
