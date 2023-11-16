package LearningJava.String;

public class LearnString {
	public static void main(String args[]) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String name = "s";
		String name1 = null;
		System.out.println("The length of alphabets is " + alphabets.length());
		System.out.println("The capital letters " + alphabets.toUpperCase());
		String obj = new String("Sathesh"); //immutable , stored in heap
		System.out.println(obj.length()); 
		System.out.println(obj.endsWith("y"));
		System.out.println(obj.concat(obj));
		System.out.println(obj);
		System.out.println(obj.isBlank()); // returns true only when it has blank space
		System.out.println("SAthesh \"calm\"");
		System.out.println(name.compareTo("r")); // returns value of letter that is greater or lesser 1 i.e - s is greater and leads by one character
		System.out.println(obj.contains("s"));
		System.out.println(obj.equals("s"));
		System.out.println(obj.startsWith("s"));
//		System.out.println(name1.isBlan
		String obj1 = new String("Sathesh");
		obj1 = "Jathes"; // creates new memory
		System.out.println(obj1);
	}

}
