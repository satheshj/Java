package LearningJava.Arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//matrix addition
		int a[][] = new int[2][1];
		int b[][] = new int[2][1];
		int res[][] = new int [2][1];
		System.out.println("Enter matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) { //a[i].length - a[i] is an array
				a[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter matrix");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) { 
				b[i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[i].length; j++) { //a[i].length - a[i] is an array
				res[i][j] = a[i][j] + b[i][j];
				System.out.print(res[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
