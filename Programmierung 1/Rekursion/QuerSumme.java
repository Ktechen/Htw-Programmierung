package Rekursion;

public class QuerSumme {

	public static void main(String[] args) {
		System.out.println(QuerSumme(1234));
	}
	
	public static int QuerSumme(int number) {
		if(number <= 0) {
			return 0;
		}else {
			return number%10+QuerSumme(number/10);
		}
	}

}
