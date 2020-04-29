package Pflichaufgabe1;

public class Buch {

	// Aufgabe a

	private String title = null;
	private int date;
	private String prename = null;
	private String surname = null;
	private String[] prenameArray = null;
	private String[] surnameArray = null;

	public int getPrenameArrayLength() {
		return prenameArray.length;
	}

	public int getSurnameArrayLength() {
		return surnameArray.length;
	}

	public String[] getPrenameArray() {
		return prenameArray;
	}

	public void setPrenameArray(String[] prenameArray) {
		this.prenameArray = prenameArray;
	}

	public String[] getSurnameArray() {
		return surnameArray;
	}

	public void setSurnameArray(String[] surnameArray) {
		this.surnameArray = surnameArray;
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// Ein Author
	public Buch(String title, String prename, String surname, int date) {
		this.title = title;
		this.prename = prename;
		this.surname = surname;
		this.date = date;
	}

	// mehre Authoren
	public Buch(String title, String[] prenameArray, String[] surnameArray, int date) {
		this.title = title;
		this.prenameArray = prenameArray;
		this.surnameArray = surnameArray;
		this.date = date;
	}

	/*
	 * Hilfsmethode für toString()
	 * 
	 * @return list of one Book
	 */
	private String printToStringArray() {
		String liste = "";

		for (int i = 0; i < getPrenameArrayLength(); i++) {
			liste += getPrenameArray()[i] + " " + getSurnameArray()[i] + " : ";
		}

		liste += getTitle() + " : " + getDate();

		return liste;
	}

	/*
	 * toString
	 */
	public String toString() {

		if (getPrenameArray() != null) {
			return printToStringArray();
		}

		return this.prename + " " + this.surname + " : " + this.title + " : " + this.date;
	}

}
