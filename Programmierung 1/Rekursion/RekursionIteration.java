package Rekursion;

import java.util.Scanner;

public class RekursionIteration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Eingabe: ");
		int n = sc.nextInt();
		
		System.out.println("\nOutput: " + Aufruf(n));
	}
	
	/*
	public static int Aufruf (int n) {
		if(n > 1) {
			return n + Aufruf(n - 1);
		}
		else {
			return 1;
		}
	}
	
	*/
	public static int Aufruf(int n) {
		
		int output = 0;
		
		System.out.println("\nAblauf:");
		for (int i = 1; i <= n; i++){
			
			output = output + i;
			
			/*
			 *  output = 00 + 1;
			 * ##################
			 * # print = 01;    #
			 * ##################
			 * 
			 *  output = 01 + 2;
			 * ##################
			 * # print = 03;    #
			 * ##################
			 * 
			 * 	output = 03 + 3;
			 * ##################
			 * # print = 06;    #
			 * ##################
			 * 
			 *  output = 06 + 4;
			 * ##################
			 * # print = 10;    #
			 * ##################
			 * 
			 *  output = 10 + 5;
			 * ##################
			 * # print = 15;    #
			 * ##################
			 * 
			 * 	output = 15 + 6;
			 * ##################
			 * # print = 21;    #
			 * ##################
			 * 
			 *  output = 21 + 7;
			 * ##################
			 * # print = 28;    #
			 * ##################
			 * 
			 *  output = 28 + 8;
			 * ##################
			 * # print = 36;    #
			 * ##################
			 * 
			 */
			
			System.out.println("Durchlauf: " + i + " Calu: " + output);
			
		}
		return output;
	}
	

}
