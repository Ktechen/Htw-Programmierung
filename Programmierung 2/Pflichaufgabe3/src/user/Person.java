package user;

import intelligent.Lebensmittel.ILebensmittel;

public class Person implements INutzer{

	private String username;
	private ILebensmittel lebensmittel;
	
	public Person(String username) {
		super();
		this.username = username;
	}
	
	public Person() {
		this.username = "TestUser";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String[] getEssbar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean istEssbar(String produkt) {
		lebensmittel.getVerfallsDatum();
		return false;
	}

	@Override
	public void empfangeMeldung(String meldung) {
		System.out.println(meldung);
	}

}
