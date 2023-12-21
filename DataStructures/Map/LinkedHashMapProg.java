package LearningJava.DataStructures.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapProg {
	public static void main(String ar[]) {
		Map<Integer,String> linkHM = new LinkedHashMap<>();
		linkHM.put(2, "naveen");
		linkHM.put(43, "suraj");
		linkHM.put(11, "pooshan");
		linkHM.put(13, "prakash");
		linkHM.put(28, "Santhosh");
		System.out.println(linkHM);
		
		for(Map.Entry<Integer, String> entry : linkHM.entrySet()) {
			System.out.println(entry.getKey() + ":"+entry.getValue());
		}
		System.out.println(linkHM.values());
		
		
	}
}
