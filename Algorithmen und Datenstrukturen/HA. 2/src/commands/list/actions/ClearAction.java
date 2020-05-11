package commands.list.actions;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class ClearAction implements ICommand {

	@Override
	public void execute() {

		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		list.clear();

		System.out.println("Clean list");

	}

	@Override
	public String toString() {
		return "Removes all of the Students from this list";
	}

}
