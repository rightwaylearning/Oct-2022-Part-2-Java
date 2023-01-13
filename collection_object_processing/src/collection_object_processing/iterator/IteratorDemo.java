package collection_object_processing.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(100);al.add(123); al.add(234); al.add(999); al.add(1233);
		
		Iterator<Integer> itr = al.iterator();
		
//		// with the help of while loop
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		
		Iterator<Integer> itr1 = al.iterator();
		
		// remove 999 from given collection.
		
		while(itr1.hasNext()) {
			
			Integer i = itr1.next();
			
			if(i.equals(999)) {
				itr1.remove();
			}
		}
		
		System.out.println(al);
		
	}
}

// there are 3 method 
 // 1] hasNext
//  2] next
//  3] remove


