package LearningJava;

public class ArmStrongNo {
	public static void main(String ar[]) {
		int n = 153;
		int count = 0;
		int temp = n;
		int sum = 0;
		while(temp!=0) {
			temp = temp/10;
			count++;
		}
		temp = n;
		while(temp!=0) {
			sum+=Math.pow(temp%10, count);
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println("Armstrong num");
		}
		else {
			System.out.println("Not Armstrong num");
		}
	}
}
