package commands.list.actions;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class PrintAllAction implements ICommand{

	@Override
	public void execute() {
		
		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		list.printAll();
	}
	
	@Override
	public String toString() {
		return "Print all students to console from list";
	}

}
