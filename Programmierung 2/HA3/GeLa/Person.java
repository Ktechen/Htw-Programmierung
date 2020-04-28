package HA3.GeLa;

public class Person {

	private String surname; // name
	private String prename; // vorname
	private int seniority; // Betriebszugehörigkeit
	private boolean leader; // chef ja/Nein
	private double salary; // Gehalt


	public Person(String surname, String prename, int seniority, boolean leader, double salary) {
		this.surname = surname;
		this.prename = prename;
		this.seniority = seniority;
		this.leader = leader;
		this.salary = salary;
	}

	public void addSalary(double summe) throws IllegalArgumentException {

		if (summe < 0) {
			throw new IllegalArgumentException("Summe darf nicht kleiner 0 sein");
		}

		this.salary += summe;
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public boolean isLeader() {
		return leader;
	}

	public void setLeader(boolean leader) {
		this.leader = leader;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String toString() {
		return "surname: " + this.surname + " prename: " + this.prename + " seniority: " + this.seniority + " Years "
				+ " leader: " + this.leader + " salary: " + this.salary;
	}

}
