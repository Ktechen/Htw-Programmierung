package HA2;

//@Author Kevin Techen
public class Konto {

	private double money;
	private double startMoney = 100;
	private final int MAX_TRANSFER_MONEY = 10000;
	private final int MIN_TRANSFER_MONEY = 1;
	private boolean dispo = false;

	public double getMoney() {
		return money;
	}

	/*
	 * Geld einzahlen
	 * 
	 * @return boolean
	 */
	public void einzahlen(double transfer) {
		if (transfer >= MIN_TRANSFER_MONEY && transfer <= MAX_TRANSFER_MONEY) {
			this.money += transfer;
		}
	}

	/*
	 * Geld abheben
	 * 
	 * @return boolean
	 */
	public void abheben(double transfer) {
		// Limit
		if (transfer >= MIN_TRANSFER_MONEY && transfer <= MAX_TRANSFER_MONEY) {

			// transfer sum kleiner als money
			if (transfer < this.money) {
				this.money -= transfer;
			}

			// transfer sum kleiner als money
			if (transfer > this.money) {
				if (dispo) {
					this.money -= transfer;
				}
			}
		}
	}

	/*
	 * Check ob das Konto leer ist
	 */
	public boolean kontoIstLeer(Konto konto) {
		if (konto.money == 0) {
			return true;
		}
		return false;
	}

	/*
	 * Clean konto
	 */
	public void kontoLeeren(Konto konto) {
		double money = konto.money;
		konto.money -= money;
	}
}
