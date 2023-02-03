package map.examples.hashmap;

import java.util.HashMap;

public class CountFrequecyOfString {

	public static void main(String[] args) {
		
		String[] arr = {"AA","BB","AA","A","CC","A","CC"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String str : arr) {
			
			if(map.containsKey(str)) {
				Integer v =  map.get(str);
				v++;
				map.put(str, v);
				
			}else {
				map.put(str, 1);
			}
			
		}
		
		System.out.println(map);
		
	}
}
