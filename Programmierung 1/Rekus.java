package HomeWork;

public class Rekus {

	
	public static int fakut(int x) {
		if (x <= 1) {
			return 1;
		}else {
			return x * fakut(x - 1);
		}
	}
	
	public static void main(String[] args) {
		
		int x = fakut(5);
		System.out.println(x);

	}

}
