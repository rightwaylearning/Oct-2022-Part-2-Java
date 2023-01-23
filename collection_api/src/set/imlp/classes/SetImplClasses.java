package set.imlp.classes;

import java.util.LinkedHashSet;

public class SetImplClasses {

	public static void main(String[] args) {
		
		
		//HashSet<Integer> hashSet = new HashSet<>();
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		
		hashSet.add(10); // true
		hashSet.add(10); // false
		
		hashSet.add(null); // true
		hashSet.add(null); // false
		
		hashSet.add(90); // true
		hashSet.add(91); // true
		hashSet.add(100); // true
		
		System.out.println(hashSet);
		
		
		
		
		
	}
}
