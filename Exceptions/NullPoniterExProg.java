package LearningJava.Exceptions;

public class NullPoniterExProg {
	public static void main(String a[]) {
		String str = null;
		try {
			int a1 = str.length();
			
		}
		catch(NullPointerException e){
			System.out.println("Exception "+e);;
			
		}
		System.out.println("Hello");
	}
}
