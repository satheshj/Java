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

		int max = 0;
		for(int k = 0 ; k < 3; k++) {
			for(int i : arr) {
				if(max < i) {
					max = i;
				}
			}
			arr.remove(max);
			sortarr.add(max);
		}
		System.out.println(sortarr);

	}
}
