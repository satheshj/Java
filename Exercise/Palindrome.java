package FullStack;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String revStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
//			System.out.println(str.charAt(i));
			revStr += str.charAt(i);
		}
		if(str.contains(revStr)) {
			System.out.println(str + " is a Palindrome");
		}else {
			System.out.println(str + " is not a PAlindrome");
		}
	}
}
