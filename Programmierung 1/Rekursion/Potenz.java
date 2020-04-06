package Rekursion;

public class Potenz {

	public static int CaluPotenz(int a, int n) {
		if(n <= 1) {
			return a;
		}else {
			return a*CaluPotenz(a, n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(CaluPotenz(2, 8));
		System.out.println("====================");
		CaluPotenzInter(2,8);
	}
	
	public static void CaluPotenzInter(int a, int n) {
		int erg = a;
		for (int i = 1; i < n; i++) {
			erg = erg * a;
			System.out.println(erg);
		}
	}

}
