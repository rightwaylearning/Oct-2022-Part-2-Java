package collection_object_processing.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(100);al.add(123); al.add(234); al.add(999); al.add(1233);
		
		ListIterator<Integer> litr =  al.listIterator();
		
		
		while(litr.hasNext()) {
			Integer i = litr.next();
			System.out.println(i);
			litr.remove();
		}
		
		litr.hasNext();// boolean >> some thing is there forward
		litr.next(); // return object & go next
		litr.nextIndex();// index 0...1
		
		
		litr.hasPrevious(); // boolean some thing is there backward
		litr.previous(); //return object & go back
		litr.previousIndex();
		
		litr.add(78); // he is adding element also
		litr.set(23); // he is replace object which is return by next or previous
		litr.remove(); // he can remove object which return by next()
		
		
		
	}
}
