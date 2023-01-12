package collection_api.list.vector;

import java.util.LinkedList;
import java.util.Vector;

public class VectorConstructor {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>(); // 10
		
		System.out.println(v.capacity()); // 10
		System.out.println(v.size()); // 0
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i = 10 ; i <= 100; i = i+10) {
			v.add(i);
		}
		
		System.out.println(v.capacity()); // 10
		System.out.println(v.size()); // 10
		 
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		v.add(110);
		
		System.out.println(v.capacity()); // 20
		System.out.println(v.size()); // 11
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		
		
		Vector<Integer> v1= new Vector<>(100);
		System.out.println(v1.capacity()); // 100
		System.out.println(v1.size()); // 0
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i =1; i<=101;i++) {
			v1.add(i);
		}
		
		System.out.println(v1.capacity()); // 200
		System.out.println(v1.size()); //  101
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Vector<Integer> v2 = new Vector<>(100,5);
		
		System.out.println(v2.capacity()); // 100
		System.out.println(v2.size()); // 0
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i =1; i<=101;i++) {
			v2.add(i);
		}
		
		System.out.println(v2.capacity()); // 105
		System.out.println(v2.size()); //  101
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100); ll.add(200);
		
		Vector<Integer> v3 = new Vector<>(ll);
	}
}
