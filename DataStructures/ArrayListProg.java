package LearningJava.DataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {
	public static void main(String ar[]) {
		ArrayList<Integer> arrObj = new ArrayList<>();
		arrObj.add(16);
		arrObj.add(20);
		arrObj.add(4);
		arrObj.add(16);
		arrObj.add(100);
		System.out.println(arrObj);
		System.out.println(arrObj.size());
		System.out.println(arrObj.remove(0));
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Cristiaaanoooooo");
		strArr.add("Suuuuuuiiii");
		strArr.add("Athletico");
		strArr.add("vs");
		strArr.add("Juventus");
		int arr[] = { 1, 2, 3 };
		
		ArrayList<Object> objArr = new ArrayList<>();
		objArr.add(strArr);
		objArr.add(arr[1]);
		objArr.add("Str");
		System.out.println(objArr);
		System.out.println(objArr.get(0));
		objArr.set(0, "hello");
		System.out.println(objArr);
		//iterator used to iterate inside the lists
		Iterator<Object> it = objArr.iterator();
		System.out.println("Printing individual elements");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Printing individual elements");
		Iterator<Integer> itInt = arrObj.iterator();
		while(itInt.hasNext()) {
			System.out.println(itInt.next());
		}
		for(Object i : objArr) {
			System.out.println(i);
		}
		for(int i : arrObj) {
			System.out.println(i);
		}
	}

}
