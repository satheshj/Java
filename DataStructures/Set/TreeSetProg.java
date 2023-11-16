package LearningJava.DataStructures.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetProg {
	public static void main(String ar[]) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(12);
		ts.add(7);
		ts.add(2);
		ts.add(13);
		System.out.println(ts);
		
		HashSet<Integer> ts1 = new HashSet<>();
		ts1.add(12);
		ts1.add(2);
		ts1.add(13);
		System.out.println(ts1);
	}
}
