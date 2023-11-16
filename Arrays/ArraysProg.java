package LearningJava.Arrays;

import java.util.Arrays;

public class ArraysProg {
	public static void main(String args[]) {
		int numArray[] = {1,2,3,4};
		//accessing individual elements
		System.out.println(numArray[1]+" "+numArray[3]);
		//finding length
		System.out.println(numArray.length);
		//for each  - used to iterate by values of the array for(variable : array){statement} 
		String[] cars = {"Toyota","BMW","Lexus"}; 
		for(String s : cars) {
			System.out.println(s);
		}
		//Simple way to print array
		System.out.println(Arrays.toString(numArray)); //[1, 2, 3, 4]
	}

}
