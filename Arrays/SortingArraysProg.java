package LearningJava.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArraysProg {
	public static void main(String ar[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(5);
		arr.add(7);
		ArrayList<Integer> sortarr = new ArrayList<>();
		//sorting in descending
		int max = 0;
		int arrlength = arr.size();
		for(int k = 0 ; k < arrlength; k++) {
			for(int i : arr) {
				if(max < i) {
					max = i;
				}
			}
			int j = arr.indexOf(max);
			
			arr.remove(j);
			sortarr.add(max);
			max = 0;
		}
		System.out.println(sortarr);
		
		

	}
}
