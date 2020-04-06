package main;

public class testVektor {

	public static void main(String[] args) {
		
		Punkt p1 = new Punkt(1.3f, 2.0f);
		Vektor2D v1 = new Vektor2D(3, 5.5f, p1);

		System.out.println(p1.toString());
		System.out.println(v1.toString());
		
		/*
		Vektor2D[] array = {new Vektor2D()};
		
		String[] a = {"dasd"};
		System.out.println(a.getClass().getSimpleName());
		
		System.out.println(array.getClass().getSimpleName());
		
		for (Vektor2D vektor2d : array) {
			System.out.println(vektor2d.toString());
		}
		*/
		
		v1.printVektor();

		
		
		Matrix matrix = new Matrix();
		
		float array[][] = {{1, 2}, {3, 4}};
		
		matrix.print(array);
		
	}

}

