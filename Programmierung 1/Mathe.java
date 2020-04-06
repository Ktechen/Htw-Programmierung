package OPP;

public class Mathe {
	
	
	private static final String XTEXT = "X: ";
	private static final String YTEXT = " Y: ";
	private static final String ZTEXT = " Z: ";
	
	private int x;
	private int y;
	private int z;
	
	/*
	 * Kontruktor
	 */
	public Mathe() {
		super();
	}
	
	/*
	 * Print Methoden
	 */
	public void printMessage(Mathe m) {
		System.out.println(m.getXYZ());
		System.out.println("Aus X und Y: " + caluProtago(m.getX(), m.getY()));
		System.out.println("Aus X,Y und Z: " + caluProtago(m.getX(), m.getY(), m.getZ()));
		System.out.println();
	}
	
	/*
	 * Putago
	 */
	public static double caluProtago(double x, double y) {
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
	}
	
	public static double caluProtago(double x, double y, double z) {
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
	}
	
	/*
	 * XYZ
	 */
	public void setXYZ(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String getXYZ() {
		return XTEXT + this.x + YTEXT + this.y  + ZTEXT + this.z;
	}
		
	/*
	 * XY
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getXY() {
		return XTEXT + this.x + YTEXT + this.y;
	}
	
	/*
	 * X
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	/*
	 * Y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	/*
	 * Z
	 */
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return this.z;
	}	
}
