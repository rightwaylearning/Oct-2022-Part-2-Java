package map.examples.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		
		//HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("help", 6546254);
		map.put("fine", 656256);
		map.put("Hi", 635462);
		map.put("see", 76547);
		
		Set<String> set = map.keySet();
		
		Iterator<String> itr = set.iterator();
		
		 while(itr.hasNext()) {
			 String key =itr.next();
			 Integer value = map.get(key);
			 System.out.println(key +" = "+value);
		 }
		
		
		
	}
}
