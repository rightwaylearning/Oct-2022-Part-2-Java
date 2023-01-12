package collection_api.list;

import java.util.*;

public class CollectionMethodForAL {

	public static void main(String[] args) {
		
		 
		List al = new ArrayList();
		Collection ccc;
		
		Boolean b = al.add("string");
		Boolean b1 = al.contains("string");
		al.add(100);
		al.add(200);
		al.add(new Thread());
		al.add(100);
		           Vector v = new Vector();
		           v.add(99);v.add(9099);v.add(999);
		al.addAll(v);
		
		int i = al.size(); // 6
		al.remove(new Integer(100));
		System.out.println(i);
		System.out.println(al);
		
		Object o = al.get(1);
		System.out.println(o);
	}
}
