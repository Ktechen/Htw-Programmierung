package commands.actions.singlyList;

import commands.CommandFactory;
import commands.ICommand;

public class PrintAllAction implements ICommand{

	@Override
	public void execute() {
		CommandFactory.Singlylist.printAll();
	}
	
	@Override
	public String toString() {
		return "Print all students to console from list";
	}

}
