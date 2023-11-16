package LearningJava.DataStructures;

import java.util.LinkedList;

public class LinkedListProg {
	public static void main(String a[]) {
		//Contains methods same as ArrayList but difference is how it is stored in memory
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("sathesh");
		ll1.add("sa16");
		ll1.add("vikki");
		ll1.add("cristiano ");
		ll1.add("siuu");
		System.out.println(ll1.size());
	}
}
