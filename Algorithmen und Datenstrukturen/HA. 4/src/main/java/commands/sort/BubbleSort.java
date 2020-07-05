package commands.sort;

import commands.ICommand;
import comparator.MatriculationNumberComparator;
import data.Elements;
import data.Student;

public class BubbleSort implements ICommand{

	@Override
	public void execute() {
		SortInvoker.print(Elements.student, new sort.BubbleSort<Student>(), new MatriculationNumberComparator());
	}
	
	@Override
	public String toString() {
		return "Bubble sort";
	}

}
