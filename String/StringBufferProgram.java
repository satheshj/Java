package LearningJava.String;

public class StringBufferProgram {
	public static void main(String ar[]) {
		StringBuffer str = new StringBuffer("Welcome"); //mutable
		System.out.println(str.append(" World"));
		System.out.println(str); // Welcome world
		System.out.println(str.delete(0, 8));
		System.out.println(str.insert(0, "Hello "));
		System.out.println(str.reverse());
		System.out.println(str); //dlroW olleH because StringBuffer is 
		str.reverse();
		System.out.println(str.replace(5, 11, "Everyone")); //HelloEveryone
		
	}

}
