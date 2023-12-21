package LearningJava.Loops;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		
		System.out.println("Square");
		for(int i = 0;i<rows;i++) {
			for(int j = 0; j<rows;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("left reverse Triangle");
		//reverse left angle
		for(int i = 0 ; i < rows; i++) {
			for(int j = rows; j>i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//left angle
		System.out.println("Left angled Triangle");
		for(int i = 0 ; i < rows; i++) {
			for(int j = 0; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Right Triangle");
		for(int i = 0; i < rows ; i++) {
			for(int j = rows-1;j >i;j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Reverse right Triangle");
		for(int i = 0; i<rows;i++) {
			for(int j = 0;j<rows-i;j++) {
				System.out.print("*");
			}
			for(int k = 0;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("Triangle");
		for(int i = 0; i <= rows-1;i++) {
			for(int j = rows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//try
		for(int i = 0;i<=rows-1;i++) {
			for(int k = 1; k<=i+1;k++) {
				System.out.print("*");
			}
			for(int j = rows;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//
		for(int i = 0;i<=rows-1;i++) {
			for(int k = 1; k<=i+1;k++) {
				System.out.print(" ");
			}
			for(int j = rows;j>=i+1;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//right angled try
		for(int i = 0; i < rows ; i++) {
			for(int j = rows-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//pyramid try
		for(int i = 0; i< rows ; i++) {
			for(int j= rows; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i < rows; i++) {
			for(int j = rows; j>=i;j--) {
				System.out.print(" *");
			}
			for(int k = 0; k <= i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
	
}
