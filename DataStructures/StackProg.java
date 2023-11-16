package LearningJava.DataStructures;

import java.util.Stack;

public class StackProg {
	public static void main(String a[]) {
		Stack<String> stk = new Stack<>();
		stk.push("Last");
		stk.push("In");
		stk.push("First");
		stk.push("Out");
		stk.push("Last");
		System.out.println(stk);
		System.out.println(stk.peek());
		stk.pop();
//		System.out.println(stk.get(2));
	}

}
