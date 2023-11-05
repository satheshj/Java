package FullStack;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int limit = 10;
		int no = 0;
		int no1 = 1;
		System.out.println("Fibnaocci series");
		for(int i = 1; i<=limit/2;i++) {
			if(i<limit/2) {
				System.out.print(no + ", ");
				System.out.print(no1 + ", ");
			}
			else {
				System.out.print(no + ", ");
				System.out.print(no1 + ".");
			}
			no += no1;
			no1 += no;
		}
		
	}
}
