package collection_api.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMethods {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		// boolean add(object){}
		boolean b = al.add("Hi");
		//System.out.println(b);
		
								// boolean addAll(Collection)
								LinkedList ll= new LinkedList();
								ll.add("LL1");ll.add("LL2");ll.add("LL3");
		
		al.addAll(ll);
		
		System.out.println(al);
		System.out.println(al.size());
		
		boolean b1 = al.remove("Hi");
		System.out.println(b1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("----------------------");
		al.removeAll(ll);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("is arry list empty"+ al.isEmpty());
		
		al.add("hello");
		al.add(100);
		al.add(200);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("is 100 present inside list " + al.contains(100));
		System.out.println("is arry list empty"+ al.isEmpty());
		
	}
}
