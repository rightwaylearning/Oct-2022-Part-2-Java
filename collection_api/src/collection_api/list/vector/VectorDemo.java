package collection_api.list.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v= new Vector<>();
		v.add("A");
		v.add("B");
		v.add("B");
		v.add("B");
		v.add("B");
		v.add("C");
		v.addElement("D");
		v.add(4,"E");
		System.out.println(v);
		

	}
}
