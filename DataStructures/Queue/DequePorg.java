package LearningJava.DataStructures.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePorg {
	public static void main(String ar[]) {
		Deque<Integer> dq = new ArrayDeque<>(); // double ended queue
		dq.addFirst(12);
		dq.addLast(3);
		dq.add(4);
		dq.addFirst(5);
		dq.addLast(4);
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		dq.removeFirst();
		System.out.println(dq);
		System.out.println(dq.getLast());
		
		
	}

}
