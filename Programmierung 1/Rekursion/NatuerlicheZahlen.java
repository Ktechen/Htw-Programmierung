package Rekursion;

public class NatuerlicheZahlen {

	public static int Natur(int a) {
		if(a <= 0) {
			return 0;
		}else {
			return a+Natur(a - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Natur(5));
	}

}
