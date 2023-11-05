package FullStack;

import java.util.Scanner;

public class AccessUserInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your phone no");
		long phno = sc.nextLong();
		System.out.println("Enter your mark in percentage");
		float percentage =  sc.nextFloat();
		System.out.println("Enter your address");
		String doorno = sc.next();
		String streetname = sc.next();
		String district = sc.next();
		System.out.println("Welcome "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your number is " +phno);
		System.out.println("Your percentage is "+percentage);
		System.out.println("Your address is No "+doorno+" Street " + streetname + " district " + district);
	}

}
