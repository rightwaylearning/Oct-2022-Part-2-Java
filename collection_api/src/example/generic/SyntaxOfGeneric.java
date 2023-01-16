package example.generic;

import java.util.ArrayList;

public class SyntaxOfGeneric {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList<String>();
		al.add(10);
		al.add("bsjdfbsjdf");
		
		ArrayList al1= new ArrayList();
		al1.add(100);
		al1.add("data");
		//-------------------------------
		
		ArrayList<String> all = new ArrayList();
		all.add("");
		all.add(67);
		ArrayList<String> alll = new ArrayList<String>();
		alll.add(45);
		
	}
}
