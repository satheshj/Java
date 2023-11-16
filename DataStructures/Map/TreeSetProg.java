package LearningJava.DataStructures.Map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetProg {
	public static void main(String ar[]) {
		SortedMap<Integer,String> srM = new TreeMap<>(); // ascending order
		srM.put(34, "sathesh");
		srM.put(37, "Mappla");
		srM.put(43, "suraj");
		srM.put(11, "pj");
		System.out.println(srM);
		//iterating using key 
		for(Integer key : srM.keySet()) {
			System.out.println(key + ":" + srM.get(key));
		}
		
		for(Map.Entry<Integer,String> entry : srM.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
