package LearningJava;

public class MyFirstProgram {
	int c = 12; //instance variable
	static int b = 2; //static
	public static void main(String args[]) {
		System.out.println("Hello World");
		int a = 10; //local variable
		b = b +1;
		System.out.println(b);

		System.out.println(a); 
		MyFirstProgram obj = new MyFirstProgram();
		System.out.println(obj.c);
	}
}
