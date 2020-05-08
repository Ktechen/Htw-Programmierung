package commands.actions.singlyList;

import commands.ICommand;

public class AddLastAction implements ICommand{

	@Override
	public void execute() {
		AddAction action = new AddAction();
		action.execute();
	}
	
	@Override
	public String toString() {
		return "Appends the Student to the end of this list";
	}

}
