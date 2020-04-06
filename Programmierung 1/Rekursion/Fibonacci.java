package source;

public class Fibonacci {

	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			System.out.println(fib(i));
		}
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2); // der rekursive Aufruf
		}
	}

}
