package collection_object_processing.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i <= 100; i = i + 6) {
			v.add(i); // auto boxing arr.add(Integer.valueOf(i))
		}

		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
