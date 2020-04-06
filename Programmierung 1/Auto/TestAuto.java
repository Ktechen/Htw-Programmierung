package OPP.Auto;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto(32,"Red");
		Auto auto2 = new Auto(0,"Blue");
		Auto auto3 = new Auto(12,"Yellow");

		int i = 0;
		while (i <= 5) {
			Auto.printMessageOfAuto(auto1);
			Auto.printMessageOfAuto(auto2);
			Auto.printMessageOfAuto(auto3);
			i++;
		}
		//Auto.printMessageOfAuto(auto1.getSpeed(), auto1.getColour(), auto1.getRotationOfCar());
	}

}
