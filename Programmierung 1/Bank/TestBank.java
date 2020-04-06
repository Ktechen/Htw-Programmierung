package OPP.Bank;

public class TestBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Bank bankaccount1 = new Bank("Tim","Bauer", 1);
		Bank bankaccount2 = new Bank("Lisa", "löffel", 2);
		Bank bankaccount3 = new Bank("Wilhelm", "Torsten", 3);
		Bank bankaccount4 = new Bank("Gert", "Berg", 4);

		bankaccount1.setMoneyWithraw(10000);
		bankaccount2.setMoneyWithraw(500000);
		bankaccount3.setMoneyWithraw(12506);
		bankaccount4.setMoneyWithraw(1200);
		
		bankaccount4.setMoneyRemove(4000);
		bankaccount1.setDispoAcitve(true);
		bankaccount1.setMoneyRemove(15000);
		
		bank.bankAccountInformation(bankaccount1);
		bank.bankAccountInformation(bankaccount2);
		bank.bankAccountInformation(bankaccount3);
		bank.bankAccountInformation(bankaccount4);
	}
}
