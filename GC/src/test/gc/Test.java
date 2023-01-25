package test.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test {

	List<Integer> list;
	Vector<Integer> v;
	
	public Test() {
		list = new ArrayList<>(100000);
		v= new Vector<>(100000);
		for (int i = 0; i < 100000; i++) {
			list.add(i);
			v.add(i);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("&&&&&&&&&&&&&&&");
	}
	
}
