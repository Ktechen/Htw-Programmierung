package OPP.Punkt;

public class TestEnviroment {

	public static void main(String[] args) {
		Punkt punkt1 = new Punkt();
		
		System.out.println("Speicheradresse: " + punkt1.toString());
		
		Punkt punkt2 = new Punkt(7, 12, "Yellow");
		
		/*
		 * Punkt 1
		 */		
		punkt1.setColour("Black");
		punkt1.setX(1);
		punkt1.setY(1);
		
		//Output
		punkt1.printMessage();
		
		//Change +1
		punkt1.changePlusOne();
		punkt1.printMessage();
		
		//change + Delta
		punkt1.changeXY(3, 3);
		punkt1.printMessage();
		
		//Change colour
		punkt1.setColour("DunkelBundMetallic");
		punkt1.printMessage();
		
		//Calulation
		punkt1.printMessageRangeCaluDemsion("Output: ", punkt1);
		
		/*
		 * Punkt 2
		 */
		punkt2.printMessage();
		punkt2.printMessageRangeCaluDemsion("Output: ", punkt2);
	}
}