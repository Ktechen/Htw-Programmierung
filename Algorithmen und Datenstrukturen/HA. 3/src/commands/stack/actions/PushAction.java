package commands.stack.actions;

import commands.CommandInvoker;
import commands.ICommand;
import commands.InputAction;

public class PushAction implements ICommand{

	@Override
	public void execute() {
		InputAction action = new InputAction();
		CommandInvoker.stack.push(action.createInputofCurrentParameter());
	}
	
	@Override
	public String toString() {
		return "Push student to stack.";
	}

}
