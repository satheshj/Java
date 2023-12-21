package LearningJava;

public class FactorialRecur {
	public static int factorialn(int n,int fact) {
		fact *= n;
		n--;
//		if(n==0) {
//			
//		}
//		else
//			fact = factorialn(n,fact);
		if(n!= 0) {
			fact = factorialn(n,fact);
		}
			
		return fact;
	}
	public static void main(String ar[]) {
		int n = 4;
		int fact = 1;
		
		System.out.println(factorialn(n,fact));
	}
	

}
