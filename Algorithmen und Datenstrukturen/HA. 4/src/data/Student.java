package data;

public class Student {

	private String surname;
	private String prename; 
	private int course; 
	private int matriculationNumber;

	public Student() {
		super();
		this.surname = null;
		this.prename = null;
		this.course = -1;
		this.matriculationNumber = -1;
	}
	
	public Student(String prename, String surname, int course, int matriculationNumber) {
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
	
	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
