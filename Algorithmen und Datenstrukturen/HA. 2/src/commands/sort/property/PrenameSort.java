package commands.sort.property;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import commands.sort.Algorithm;
import commands.sort.BubbleSortAction;
import comparator.CourseNumberComparator;
import comparator.PrenameComparator;
import data.Student;
import list.Listable;
import sort.BubbleSort;
import sort.SelectionSort;
import sort.Sortable;

public class PrenameSort implements ICommand{

	private Sortable<Student> sort = null;
	
	@Override
	public void execute() {
		Listable<Student> list = null;

		
		if(CommandOption.isWhichList()) {
			list = DoublyLinkedListAction.list;
		}else {
			list = SinglyLinkedListAction.list;
		}
		
		if(CommandOption.isWhichSort()) {
			sort = new BubbleSort<Student>();
		}else {
			sort = new SelectionSort<Student>();
		}
		
		Algorithm.sortAndPrint(list, sort, new PrenameComparator());
	}
	
	@Override
	public String toString() {
		return "Prename ?";
	}

}
