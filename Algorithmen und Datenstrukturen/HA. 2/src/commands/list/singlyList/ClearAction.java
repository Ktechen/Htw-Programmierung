package commands.list.singlyList;

import commands.CommandFactory;
import commands.ICommand;
import commands.list.SinglyLinkedListAction;

public class ClearAction implements ICommand {

	@Override
	public void execute() {

		SinglyLinkedListAction.list.clear();

		System.out.println("Clean list");

	}

	@Override
	public String toString() {
		return "Removes all of the Students from this list";
	}

}
