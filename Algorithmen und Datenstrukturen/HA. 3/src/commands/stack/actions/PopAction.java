package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;

public class PopAction implements ICommand{

	@Override
	public void execute() {
		CommandInvoker.stack.pop();
	}
	
	@Override
	public String toString() {
		return "Pop student from stack.";
	}

}
