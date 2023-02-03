package map.examples.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map= new HashMap<>();
		map.put(12, "Sushant");
		map.put(13, "nana");
		map.put(11, "Mahesh");
		String v = map.put(12, "Riya");
		String v1 = map.put(15, "nana");
		System.out.println(v); // sushant
		System.out.println(v1); // null
		System.out.println("-------------------");
		System.out.println(map.size()); //4
		System.out.println(map);
		System.out.println("-------------------");
		
		String s1 =  map.get(12);
		System.out.println(s1); // Riya
		
		String s2 = map.get(18);
		System.out.println(s2); // null
		
		
	}
}
