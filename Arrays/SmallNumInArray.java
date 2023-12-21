package LearningJava.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallNumInArray {
	public static void main(String a[]) {
		int arr[] = {21,3,45,66,4,1};
		int min = arr[0];
		int secondMin = arr[0];
		for(int i : arr) {
			if(i < min) {
				min = i;
				
			}
		}
		for(int i : arr) {
			if(secondMin > i && min < i) {
				secondMin = i;
			}
		}
		System.out.println(min);
		System.out.println(secondMin);
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
