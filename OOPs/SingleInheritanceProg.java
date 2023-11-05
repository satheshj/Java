package LearningJava.OOPs;
class ParentP{
	String str1 = "PArent";
	void myMethod() {
		System.out.println("I'm Batman");
	}
}

class ChildC extends ParentP{
	String str = "Child";
	void myMethod1() {
		System.out.println("I'm Batman's Robin");
	}
}


public class SingleInheritanceProg {
	public static void main(String args[]) {
		ChildC myObj = new ChildC();
		System.out.println(myObj.str1);
		System.out.println(myObj.str);
		myObj.myMethod();
		myObj.myMethod1();
	}
}
