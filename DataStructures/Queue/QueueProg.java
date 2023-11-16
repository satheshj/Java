package LearningJava.DataStructures.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProg {
	public static void main(String a[]) {
		Queue<String> qu = new LinkedList<>();
		qu.add("Sathesh");
		qu.add("Jathesh");
		qu.add("Jagan");
		qu.add("Gopal");
		qu.add("Sathesh");
		System.out.println(qu);
		
		PriorityQueue<String> pqu = new PriorityQueue<>();
		pqu.add("hello");
		pqu.add("World");
		pqu.add("hello");
		pqu.add("zxko");
		System.out.println(pqu);
		System.out.println(pqu.peek());
		
	}

}
