package LearningJava.Exceptions;

public class ArithExpectionProgram {
	public static void main(String ar[]) {
	int a = 10;
	int b = 0;
	try {
		int c = a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("Hello World");
	}
	
	
}
