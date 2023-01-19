package set.imlp.classes;

import java.util.HashSet;

public class HashSetDemo {
	// what will happen If i insert duplicate object inside ant set impl ?

	public static void main(String[] args) {
		
		 HashSet<Integer> h = new HashSet<>(); 
		 
		 System.out.println(h.add(100)); //  true
		 System.out.println(h.add(null)); // true
		 System.out.println(h.add(200)); // true
		 System.out.println(h.add(300)); // true
		 System.out.println(h.add(100)); // false
		 System.out.println(h.add(400)); // true
		 System.out.println(h.add(null)); // false
		 
		 System.out.println(h);
		 System.out.println(h.size()); // 5
	}
}
