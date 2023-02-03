package map.examples.hashmap;

import java.util.HashMap;

public class ArrayNumberCount {

	public static void main(String[] args) {

		Integer[] num = { 10, 10, 10, 1, 1, 2, 1, 3, 4, 1, 2, 5, 3, 7, 8, 5, 5 };

		HashMap<Integer, Integer> map = new HashMap<>(); // size = 0

		// itr {10 = 3, 1 = 2}

		for (Integer key : num) {
			
			if (map.containsKey(key)) {
				Integer v = map.get(key);
				v++;
				map.put(key, v);
			} 
			else 
			{
				map.put(key, 1);
			}

		}
		
		System.out.println(map);

	}

}
