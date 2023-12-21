package LearningJava.OOPs.Interface;

interface BaseA{ //interface will only have abstract methods, method overriding not possible, helps to achieve multiple 
	void display();
}
interface BaseB{
	void display2();
	abstract void disp();
	int a = 5;
}
public class InterfaceProg implements BaseA,BaseB {
	public static void main(String args[]) {
		InterfaceProg ic = new InterfaceProg();
		ic.display();
		ic.display2();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Cristiano Ronaldo siiiuuuuuuuuuuuu");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Bellingol Bellingol  el eu");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Jude 5");
		
	}
	
	
}
