package OPP.Punkt;

public class Punkt {
	
	/*
	 * Construktion
	 */
	public Punkt() {
		this.x = 0;
		this.y = 0;
		
	}
	
	public Punkt(int x, int y, String colour) {
		this.x = x;
		this.y = y;
		this.colour = colour;
	}
		
	//Print all stuff out
	public void printMessage() {
		System.out.println("X: " + x + " Y: " + y + " Colour: " + colour);
	}

	/*
	 * X is a Postion on coordinationsystem 
	 */
	private int x;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	/*
	 * Y is a Postion on coordinationsystem 
	 */
	private int y;
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	/*
	 * you may colour set and get
	 */
	private String colour;
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	
	/*
	 * Change Postion +1
	 */
	public void changePlusOne() {
		this.x += 1;
		this.y += 1;
	}
	
	/*
	 * Change a Postion 
	 */
	public void changeXY(int DeltaX, int DeltaY) {
		this.x += DeltaX;
		this.y += DeltaY;
	}
	
	
	public void printMessageRangeCaluDemsion(String message, Punkt p) {
		System.out.println(message + rangeCaluDemsion(p) + "\n");
	}
	
	/*
	 * Range of two points
	 */
	private double rangeCaluDemsion(Punkt p) {
		double x = p.getX();
		double y = p.getY();
		
		double calu = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		return calu;
	}
}
