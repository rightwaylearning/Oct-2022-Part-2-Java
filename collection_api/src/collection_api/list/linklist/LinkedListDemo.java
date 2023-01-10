package collection_api.list.linklist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<>();
		
		ll.add("A");
		ll.add("B");
		ll.add(null);
		ll.add("C");
		ll.add("D");
		System.out.println(ll.toString());
		
		System.out.println(ll.contains("C"));// true
		System.out.println(ll.remove(0));
		System.out.println(ll.size());
		System.out.println(ll);
	}
}
