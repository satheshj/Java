package LearningJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MulOf6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		int limit = sc.nextInt();
//		for(int i = 1; i <=limit; i++) {
//			System.out.println(i*6);
//		}
		//arrays sort
		ArrayList<Integer> arr  = new ArrayList<>();
		System.out.println("Enter five elements");
		for(int i = 0; i < 5 ; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		
		System.out.println("Enter five numbers");
		int arr1[] = new int[5];
		for(int i = 0; i < 5 ; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("");
		
		
	}
}
