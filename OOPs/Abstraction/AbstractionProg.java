package LearningJava.OOPs.Abstraction;
abstract class Atm{
	//abstract class should have atleast one abstract method
	abstract void cash();
	
	void pinChange() {
		System.out.println("Change of pin");
	}
}
abstract class WithDraw extends Atm{

	@Override
	void cash() {
		// TODO Auto-generated method stub
		System.out.println("Rs. 1000 has been debited");
		
	}
	abstract void balanceCheck();
	
}
public class AbstractionProg extends WithDraw{
	//concrete class will only have implementation 

	@Override
	void balanceCheck() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is 1200");
		
	}
	public static void main(String args[]) {
		AbstractionProg obj = new AbstractionProg();
		obj.pinChange();
		obj.balanceCheck();
		obj.cash();	
	}
}
