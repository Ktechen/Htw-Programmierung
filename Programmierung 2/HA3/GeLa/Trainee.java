package HA3.GeLa;

public class Trainee extends Person {

	private String titleOfTrainee;
	private int age;
	private double bonusTrainee = 10 * age;

	public Trainee(String surname, String prename, int seniority, double salary, String titleOfTrainee, int age) {
		super(surname, prename, seniority, false, salary, true);
		this.titleOfTrainee = titleOfTrainee;
		this.setAge(age);
	}

	public void addBonus(Trainee trainee) {
		try {
			trainee.addSalary(bonusTrainee);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
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
		return bonusTrainee;
	}

	public String toString() {
		return "Surname: " + getSurname() + " Prename: " + getPrename() + " Age: " + getAge() + " Salary: "
				+ getSalary() + " Title: " + getTitleOfTrainee();
	}
}
