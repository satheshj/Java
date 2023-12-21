package LearningJava.Arrays;

public class SumOfArr {
	static int sum(int[] a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
		
	}
	static double avg(int[] a) {
		int avg = 0;
		for(int i : a) {
			avg += i;
		}
		avg /= a.length;
		return avg;
		
	}
	public static void main(String ar[]) {
		int[] arr = {2,4,1,78,4};
		System.out.println(sum(arr)+" "+avg(arr));
		
	}

}
