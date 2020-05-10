package commands.sort.property;

import commands.CommandOption;
import commands.ICommand;
import commands.list.DoublyLinkedListAction;
import commands.list.SinglyLinkedListAction;
import commands.sort.Algorithm;
import comparator.CourseNumberComparator;
import comparator.MatriculationNumberComparator;
import comparator.SurnameComparator;
import data.Student;
import list.Listable;
import sort.BubbleSort;
import sort.SelectionSort;
import sort.Sortable;

public class MatriculationNumberSort implements ICommand{

	private Sortable<Student> sort = null;
	
	@Override
	public void execute() {
		
		Listable<Student> list = null;
		Sortable<Student> sort = null;
		
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
		
		Algorithm.sortAndPrint(list, sort, new MatriculationNumberComparator());
	}
	
	@Override
	public String toString() {
		return "Matriculation Number ?";
	}


}
