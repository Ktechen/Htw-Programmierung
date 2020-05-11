package commands.list.actions;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class SizeAction implements ICommand{

	@Override
	public void execute() {
		
		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		System.out.println("Size of List: " + list.size());
	}

	@Override
	public String toString() {
		return "Returns the number of Students in this list";
	}
	

}
