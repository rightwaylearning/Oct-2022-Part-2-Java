package map.examples.hashmap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		
		IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
		
		String s1 = new String("sahil");
		String s2 = new String("sahil");
		
		
		map.put(s1, 1010);
		map.put(s2, 78899);
		
		System.out.println(map);
		
		
		
	}
}
