package map.examples.hashmap;

import java.util.HashMap;

public class CharacterCountOfString {

	public static void main(String[] args) {
		
		String str = "Hi hello hi good morning";
		//char[] arr=  str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				Integer v =  map.get(ch);
				v++;
				map.put(ch, v);
				
			}else {
				map.put(ch, 1);
			}
						
		}
		System.out.println(map);
	}
}
