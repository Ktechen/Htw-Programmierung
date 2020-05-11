package commands.search.action;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import data.Student;
import list.Listable;

public class MatriculationNumberSearch implements ICommand {

	private Listable<Student> list = null;

	@Override
	public void execute() {
		if (CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		} else {
			list = SinglyLinkedListAction.list;
		}

	}

	@Override
	public String toString() {
		return "Matriculation Number? ";
	}

}
