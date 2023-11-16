package LearningJava.Arrays;

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
	}

}
