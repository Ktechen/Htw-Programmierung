package HA3.GeLa;

public class Mitarbeiter extends Person {

	private double bonus = 50 * getSeniority();
	private double bonusLeader = 50 * getSeniority() + 200;

	public Mitarbeiter(String surname, String prename, int seniority, boolean leader, double salary) {
		super(surname, prename, seniority, leader, salary, false);
	}

	public double getBonusLeader() {
		return bonusLeader;
	}

	public double getBonus() {
		return bonus;
	}

	public void addBonus(Mitarbeiter mitarbeiter) {

		if (isLeader()) {
			try {
				mitarbeiter.addSalary(bonusLeader);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} else {
			try {
				mitarbeiter.addSalary(bonus);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public String toString() {
		return "Surname: " + getSurname() + " Prename: " + getPrename() + " Salary: " + getSalary();
	}

}
