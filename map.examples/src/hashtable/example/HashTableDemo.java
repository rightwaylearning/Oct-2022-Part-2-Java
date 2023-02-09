package hashtable.example;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "hello");
		map.put(2, "k");
		
		System.out.println(map);
	}
}
