package LearningJava.Constructor;

public class ConstructorProg {
	String name;
	int age;
	
	public ConstructorProg() { //Initializing value
		name = "John";
		age = 21;
	}
	public ConstructorProg(String str, int n) { //Parameterized constructor
		name = str; 
		age = n;
	}
	public ConstructorProg(ConstructorProg obj) { //object as an argument
		name = obj.name;
		age = obj.age;
	}
	public static void main(String args[]) {
		ConstructorProg cc = new ConstructorProg(); //if there is no explicit null or 0 will be given to instances
		System.out.println(cc.name);
		System.out.println(cc.age);
		ConstructorProg ccv = new ConstructorProg("simbu",40); // we have overloaded the constructor
		System.out.println(ccv.name);
		System.out.println(ccv.age);
		ConstructorProg dn = new ConstructorProg(cc); // copy constructor used to copy values from another object
		System.out.println(dn.name);
		System.out.println(dn.age);
	}
}
