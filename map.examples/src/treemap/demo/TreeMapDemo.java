package treemap.demo;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree= new TreeMap<>();
		
		tree.put(11,"farida");
		tree.put(1, "afroz");
		tree.put(21, "tabbu");
		tree.put(15, "diya");
		
		// option create set object with the help of  keySet() method
		Set<Integer> set = tree.keySet();
		//System.out.println(set);
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i +" : "+tree.get(i));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		// option 
		
		Set<Entry<Integer, String>> entry = tree.entrySet();
		
		for(Entry<Integer, String> e:entry) {
			System.out.println(e.getKey() +":"+e.getValue());
		}
		
	}

}
