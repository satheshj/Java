package FullStack;

import java.util.Scanner;

public class PrimeProg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		for(int i = n; i >= 2; i--) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime");
		}
	}

}
