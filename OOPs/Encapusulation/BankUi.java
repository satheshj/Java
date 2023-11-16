package LearningJava.OOPs.Encapusulation;

import java.util.Scanner;

public class BankUi {
	public static void main(String a[]) {
		BankAccount obj  = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println(obj.name);
		System.out.println(obj.address);
		System.out.println(obj.mobileNo);
		System.out.println("Enter your pin");
		if(sc.nextInt() == obj.getAtmPin()) {
			System.out.println("Your credentials");
			System.out.println(obj.getUserName());
			System.out.println(obj.getPassword());
			System.out.println(obj.accountLimit);
		}
		
	}

}
