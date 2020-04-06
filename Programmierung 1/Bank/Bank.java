package OPP.Bank;

public class Bank {
	
	public Bank() {
		
	}

	public Bank(String firstname, String lastname, int bankNumber) {
		this.money = 0;
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.bankNumber = bankNumber;
	}
	
	public Bank(String firstname, String lastname, int bankNumber, boolean dispo) {
		this.money = 0;
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.bankNumber = bankNumber;
		this.dispoActive = dispo;
	}
	
	/*
	 * Console Output
	 */
	public void bankAccountInformation(Bank b) {
		String name = b.getFullName();
		double money = b.getMony();
		int bankNumber = b.getBankNumber();
		String status = b.checkMoney(b);
		
		System.out.println("Ihr name ist: " + name);
		System.out.println("Kontonumber: " + bankNumber);
		System.out.println("Akutelles Guthaben: " + money);
		System.out.println("Konto zustand: " + status);
		System.out.println();
	}
	
	/*
	 * Bank Values and Parameter
	 */
	private int bankNumber;
	
	public void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}
	
	public int getBankNumber() {
		return bankNumber;
	}
	
	private String firstname;
	private String lastname;
	
	public String getFullName() {
		return this.firstname + " " + this.lastname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	private double money;
	
	public double getMony() {
		return money;
	}
	
	private boolean dispoActive = false;
	
	
	public boolean getDispoActive() {
		return dispoActive;
	}
	
	public void setDispoAcitve(boolean dispoActive) {
		this.dispoActive = dispoActive;
	}
	
	private double dispo;
	
	public void setDispoLimit(double dispo) {
		this.dispo = dispo;
	}
	
	public double getDispoLimit() {
		return dispo;
	}
	
	private String checkMoney(Bank bank) {
		final double DISPOLIMIT = 1000;
		
		double money = bank.getMony();
		boolean dispo = bank.getDispoActive();
		
		if(money < 0) {
			if (dispo == false) {
				return "Konto im Kritischen Zustand";
			}else {
				if (money < DISPOLIMIT) {
					return "Konto überzogen";
				}else {
					return "Konto test";
				}
			}
			
		}else {
			return "Konto im normalen Zustand";
		}
	}
	
	public void setMoneyWithraw(double money) {
		this.money += money;
	}
	
	public void setMoneyRemove(double money) {
		this.money -= money;
	}
}
