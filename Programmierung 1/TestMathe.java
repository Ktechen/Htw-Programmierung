package OPP;

public class TestMathe {

	public static void main(String[] args) {
		Mathe mathe  = new Mathe();
		Mathe mathe1 = new Mathe();
		Mathe mathe2 = new Mathe();
		Mathe mathe3 = new Mathe();
		Mathe mathe4 = new Mathe();
		Mathe mathe5 = new Mathe();
		
		mathe1.setXYZ(3, 4, 2);
		mathe2.setXYZ(2, 1, 12);
		mathe3.setXYZ(7, 8, -16);
		mathe4.setXYZ(5, 6, -1);
		mathe5.setXYZ(3, 4, 2);
		
		mathe.printMessage(mathe1);
		mathe.printMessage(mathe2);
		mathe.printMessage(mathe3);
		mathe.printMessage(mathe4);
		mathe.printMessage(mathe5);
		
		System.out.println(mathe1.equals(mathe5));
	}
}
