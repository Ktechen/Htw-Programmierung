package HA2;

//@Author Kevin Techen
public class Konto {

	private double money;
	private final int MAX_TRANSFER_MONEY = 10000;
	private final int MIN_TRANSFER_MONEY = 1;
	private boolean dispo = false;

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	public double getMoney() {
		return money;
	}

	public Konto () {
		
	}
	
	public Konto(double money) {
		this.money = money;
	}
	
	public Konto(double money, boolean dispo) {
		this.money = money;
		this.dispo = dispo;
	}
	
	/*
	 * Geld einzahlen
	 */
	public void einzahlen(double transfer) {
		if (transfer >= MIN_TRANSFER_MONEY && transfer <= MAX_TRANSFER_MONEY) {
			this.money += transfer;
		}
	}
	
	/*
	 * With Exception
	 */
	
	/*
	public void einzahlen(double transfer) throws IllegalArgumentException{
		if(transfer < 0) {
			throw new IllegalArgumentException("Transfer ist kleine 0");
		}
		
		this.money += transfer;
	}
	*/

	/*
	 * Geld abheben
	 */
	public void abheben(double transfer) {
			
		// Limit
		if (transfer >= MIN_TRANSFER_MONEY && transfer <= MAX_TRANSFER_MONEY) {

			// transfer sum kleiner als money
			if (transfer >= this.money) {
				if (dispo) {
					this.money -= transfer;
				}
			}
			
			// transfer sum kleiner als money
			if (transfer <= this.money) {
				this.money = this.money - transfer;
				//1000 = 3000 - 100;
			}

		}
		
	}

	/*
	 * Check ob das Konto leer ist
	 */
	public boolean kontoIstLeer() {
		if (this.money == 0) {
			return true;
		}
		return false;
	}

	/*
	 * Clean konto
	 */
	public void kontoLeeren() {
		double money = this.money;
		this.money -= money;
	}
}
