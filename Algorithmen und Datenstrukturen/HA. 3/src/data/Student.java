package data;

public class Student {

	private String surname;
	private String prename;
	private int course;
	private int matriculationNumber;
	
	public Student(String surname, String prename, int course, int matriculationNumber) {
		super();
		this.surname = surname;
		this.prename = prename;
		this.course = course;
		this.matriculationNumber = matriculationNumber;
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

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", prename=" + prename + ", course=" + course + ", matriculationNumber="
				+ matriculationNumber + "]";
	}
	
}
