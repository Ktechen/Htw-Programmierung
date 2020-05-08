package commands.list.singlyList;

import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;

public class PrintAllAction implements ICommand{

	@Override
	public void execute() {
		SinglyLinkedListAction.list.printAll();
	}
	
	@Override
	public String toString() {
		return "Print all students to console from list";
	}

}
