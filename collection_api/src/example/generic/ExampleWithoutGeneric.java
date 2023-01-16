package example.generic;

import java.util.ArrayList;

public class ExampleWithoutGeneric {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("lmn");
		al.add("obs");
		al.add(new Integer(100));
		
		String s = (String)al.get(3);
		System.out.println(s);
		
	}
}
