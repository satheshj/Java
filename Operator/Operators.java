package LearningJava.Operator;

import java.util.Scanner;

public class Operators {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two inputs:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("========Arithmetic=====");
		System.out.println("Addition "+ (a+b));
		System.out.println("Subtraction " + (a-b));
		System.out.println("Multiply "+(a*b));
		System.out.println("Divison " + (a/b));
		System.out.println("======Logical=====");
		System.out.println((a==b) && (a<b));
		System.out.println((a==b) || (a<b));
		System.out.println(!(a==b));
	}

}
