package LearningJava;

import java.util.Arrays;

public class MergeTwoArrays {
	public static int[] mergeArr(int a[],int n, int b[],int a1) {
		
		int[] merArr = new int[n+a1];
		int index = 0;
		for(int i = 0; i < n;i++) {
			merArr[index++] = a[i];
			merArr[index++] = b[i];
		}
		return merArr;
		
	}
 	public static void main(String ar[]) {
		int a[] = {1,3,5};
		int b[] = {2,4,6};
		System.out.println(Arrays.toString(mergeArr(a,3,b,3)));
		
		
	}

}
