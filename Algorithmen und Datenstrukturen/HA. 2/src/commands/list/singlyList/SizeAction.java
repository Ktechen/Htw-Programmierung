package commands.list.singlyList;

import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;

public class SizeAction implements ICommand{

	@Override
	public void execute() {
		System.out.println("Size of List: " + SinglyLinkedListAction.list.size());
	}

	@Override
	public String toString() {
		return "Returns the number of Students in this list";
	}
	

}
