package map.classes;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(11, "Rohit");
		map.put(12, "Kiran");
		map.put(111, "Mohit");
		
		System.out.println(map);
		
	}
}
