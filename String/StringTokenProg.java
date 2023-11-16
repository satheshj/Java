package LearningJava.String;

import java.util.StringTokenizer;

public class StringTokenProg {
	public static void main(String ar[]) {
		String str = "Eat Sleep Suplex Repeat";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
