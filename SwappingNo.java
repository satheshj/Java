package LearningJava;

import java.util.Scanner;

public class SwappingNo {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a - b;
		c = c + a;
		a = c - a;
		c = c-a;
		System.out.println(a+" "+b+" "+c);
		
	}

}
