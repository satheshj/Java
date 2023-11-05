package LearningJava.OOPs.Polymorphism;

import java.util.Scanner;

public class MethOverLoadingProgram {
	static int add(int x,int y) {
		return x+y;
	}
	final static double add(double x,double y, double z) {
		return x+y+z;
	}
	static long add(long x, long y) {
		return x+y;
	}
	int volume(int l,int b,int h) {
		return l*b*h;
	}
	public static void main(String args[]) {
		int res = add(4,5);
		double var = add(3,4,5);
		long out = add(11L,4L);
		System.out.println(res+" "+var+" "+out);
		System.out.println(add(4,5));
		Scanner sc = new Scanner(System.in);
		MethOverLoadingProgram myObj = new MethOverLoadingProgram();
		System.out.println("Enter l,b,h");
		System.out.println(myObj.volume(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}
}
