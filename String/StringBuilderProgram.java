package LearningJava.String;

public class StringBuilderProgram {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Sathesh");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.substring(0, 5));
		System.out.println(sb.insert(2, 16));
		System.out.println(sb.delete(4, sb.length()));
		System.out.println(sb.append(28));
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		
	}

}
