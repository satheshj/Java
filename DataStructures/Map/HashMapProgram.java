package LearningJava.DataStructures.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	public static void main(String ar[]) {
		Map<Integer,String> haMap = new HashMap<>();
		haMap.put(1, "Sathesh");
		haMap.put(16, "Sathesh");
		haMap.put(02, "SA16");
		haMap.put(17, "AR17");
		System.out.println(haMap);
		System.out.println(haMap.get(16));
		haMap.replace(16, "SA16");
		System.out.println(haMap);
		System.out.println(haMap.size());
		System.out.println(haMap.isEmpty());
	}

}
