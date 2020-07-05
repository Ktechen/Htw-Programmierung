package commands.sort;

import commands.ICommand;
import comparator.MatriculationNumberComparator;
import data.Elements;
import data.Student;

public class SelectionSort implements ICommand{

	@Override
	public void execute() {
		SortInvoker.print(Elements.student, new sort.SelectionSort<Student>(), new MatriculationNumberComparator());
	}
	
	@Override
	public String toString() {
		return "SelectionSort";
	}

}
