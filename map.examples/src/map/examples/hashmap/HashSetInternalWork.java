package map.examples.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetInternalWork {

	public static void main(String[] args) {
		
		// tell me about internal working of HashSet
		
		HashSet<String> set= new HashSet<>();
		
		boolean b = set.add("A");
		System.out.println(b); // true
		
		boolean b1 = set.add("A");;
		System.out.println(b1); // false
		
		// create set of keys
		
		HashMap<String, Integer> map = new HashMap<>();
		
        map.put("A", 100);
        map.put("B", 100);
        map.put("C", 100);
        map.put("D", 100);
        
        System.out.println(map);
        
        //--------------------
        
        Set<String> set1= map.keySet();
        System.out.println(set1); // 
        
        Collection<Integer> list=  map.values();
        System.out.println(list);
        
        
        
		
		
	}
}
