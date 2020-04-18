package Pflichaufgabe1;

public class Buch {

	// Aufgabe a

	private String title;
	private int date;
	private String prename; 
	private String surname;
	private String[] prenameArray; 
	private String[] surnameArray;

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

	//mehre Authoren
	public Buch(String title, String[] prenameArray, String[] surnameArray , int date) {
		this.title = title;
		this.prenameArray = prenameArray;
		this.surnameArray = surnameArray;
		this.date = date;
	}
	
	public String toString() {
		return this.prename + " " + this.surname + " : " + this.title + " : " + this.date;
	}

}
