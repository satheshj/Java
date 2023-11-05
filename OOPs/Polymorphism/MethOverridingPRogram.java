package LearningJava.OOPs.Polymorphism;

class Parent{
	void display() {
		System.out.println("...............Hello Everyone");
	}
}
class Child extends Parent{
	void display() {
		super.display(); 
		System.out.println("Hello World");
	}
}
public class MethOverridingPRogram {
	public static void main(String args[]) {
		Child ch = new Child();
		ch.display();
	}
}
