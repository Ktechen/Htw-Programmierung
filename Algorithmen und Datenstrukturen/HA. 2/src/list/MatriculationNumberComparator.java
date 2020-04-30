package list;

import data.Student;
import sort.Comparator;

public class MatriculationNumberComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.getMatriculationNumber() - o2.getMatriculationNumber(); 
	}
	
}
