package FullStack;

import java.util.Scanner;

public class Amstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int userInp = n1;
		int digit;
		int result = 0;
		while(n1>0) {
			digit = n1%10;
			result += Math.pow(digit, 3);
			
			n1 /= 10;
			
		}
		if(userInp == result) {
			System.out.println("Entered number is an armstrong number");
		}
		else {
			System.out.println("Entered number is not an armstrong number");
		}
		
	}
}
