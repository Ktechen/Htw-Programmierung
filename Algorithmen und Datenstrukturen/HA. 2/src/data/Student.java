package data;

public class Student {

	/* @Aufgabe 1.b
	 * Grund der Auswahl 
	 */
	private String surname; //weil Namen Zeichketten sind.
	private String prename; //weil Vornamen Zeichketten sind.
	
	/*
	 * Ein INT ist besser als ein String da dieser Eindeutiger ist.
	 * Für z.B die Suche nach einen Course X 
	 * z.B Angewandte Informatik = 1, BWL = 2 usw. 
	 */
	private int course; 
	private int matriculationNumber;

	public Student() {
		super();
		this.surname = null;
		this.prename = null;
		this.course = -1;
		this.matriculationNumber = -1;
	}
	
	public Student(String surname, String prename, int course, int matriculationNumber) {
		super();
		this.surname = surname;
		this.prename = prename;
		this.course = course;
		this.matriculationNumber = matriculationNumber;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", prename=" + prename + ", course=" + course + ", matriculationNumber="
				+ matriculationNumber + "]";
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

}
