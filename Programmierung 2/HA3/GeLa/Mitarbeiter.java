package HA3.GeLa;

public class Mitarbeiter extends Person {

	private double bonus = 50 * getSeniority();
	private double bonusLeader = 50 * getSeniority() + 200;

	public Mitarbeiter(String surname, String prename, int seniority, boolean leader, double salary) {
		super(surname, prename, seniority, leader, salary);
	}

	public double getMitarbeiterBonus() {
		if (isLeader()) {
			return bonusLeader;
		}
		return bonus;
	}

	public String toString() {
		return "Surname: " + getSurname() + " Prename: " + getPrename() + " Salary: " + getSalary();
	}

}
