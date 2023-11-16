package LearningJava.Exceptions;

public class NumberFormatExpProg {
	public static void main(String a[]) {
		int a1 = 5;
		String conInt = Integer.toString(a1);
		System.out.println(conInt.charAt(0));
		int a2 = Integer.parseInt(conInt) + 1;
		System.out.println(a2);
		String li = "two";
		
		try {
			int num = Integer.parseInt(li);
			
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
