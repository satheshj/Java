package LearningJava.Arrays;

public class SecondLargestInArray {
	public static void main(String ar[]) {
		long arr[] = new long[5];
		arr[0] = 1;
		arr[1] = 29;
		arr[2] = 13;
		arr[3] = 74;
		arr[4] = 100;
		long max = arr[0];
		long scmax = 1;
		for(long temp : arr) {
			if(temp>max) {
				max = temp;
			}
		}
		for(long temp : arr) {
			if((scmax < temp) && (max > temp)) {
				scmax = temp;
			}
		}
		System.out.println(max);
		System.out.println(scmax);
		
	}

}
