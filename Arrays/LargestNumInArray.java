package LearningJava.Arrays;

import java.util.Arrays;

public class LargestNumInArray {
	public static void main(String args[]) {
		long arr[] = new long[4];
		arr[0] = 1;
		arr[1] = 29;
		arr[2] = 13;
		arr[3] = 74;
		long max = arr[0];
		
		for(long temp : arr) {
			if(temp>max) {
				max = temp;
			}
		}
		System.out.println(max);
		String strArr[] = new String[arr.length];
		String temp = "\"";
		for(int i = 0;i < arr.length; i++) {
			strArr[i] = temp+arr[i]+temp;
		}
		System.out.println(Arrays.toString(strArr));
		
	}

}
