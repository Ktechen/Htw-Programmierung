package HA3.GeLa;

public class Trainee extends Person {

	private String titleOfTrainee;
	private int age;
	private double bonus = 10 * getAge();
	private int yearsOfTrainiee;

	public Trainee(String surname, String prename, int seniority, double salary, String titleOfTrainee, int age) {
		super(surname, prename, seniority, false, salary);
		this.titleOfTrainee = titleOfTrainee;
		this.setAge(age);
	}

	public double getTraineeBonus() {
		return bonus;
	}
	
	public String getTitleOfTrainee() {
		return titleOfTrainee;
	}

	public void setTitleOfTrainee(String titleOfTrainee) {
		this.titleOfTrainee = titleOfTrainee;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getbonusTrainee() {
		return bonus;
	}
	
	public int getYearsOfTrainiee() {
		return yearsOfTrainiee;
	}

	public void setYearsOfTrainiee(int yearsOfTrainiee) {
		this.yearsOfTrainiee = yearsOfTrainiee;
	}

	public String toString() {
		return "Surname: " + getSurname() + " Prename: " + getPrename() + " Age: " + getAge() + " Salary: "
				+ getSalary() + " Title: " + getTitleOfTrainee();
	}
}
