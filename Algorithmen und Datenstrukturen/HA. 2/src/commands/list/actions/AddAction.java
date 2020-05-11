package commands.list.actions;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.InputAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class AddAction extends InputAction implements ICommand {

	@Override
	public void execute() {
		
		Listable<Student> list = null;
		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		list.add(createInputofCurrentParameter());
	}

	@Override
	public String toString() {
		return "Add Student to the end of this list";
	}
}
