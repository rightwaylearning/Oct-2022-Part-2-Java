package collection_object_processing.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemoExample {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i = i + 6) {
			arr.add(i); // auto boxing arr.add(Integer.valueOf(i))
		}

		ListIterator<Integer> listItr = arr.listIterator();

//        while(listItr.hasNext()) {
//        	System.out.println(listItr.next());
//        }
//        
//        while(listItr.hasPrevious()) {
//        	System.out.println(listItr.previous());
//        }
		
//		System.out.println(arr);
//		while (listItr.hasNext()) {
//		       Integer ele = listItr.next();
//		       if(ele % 9 == 0) {
//		    	   listItr.remove();
//		       }
//		}
//		System.out.println(arr);
		
//		System.out.println(arr);
//		while (listItr.hasNext()) {
//		       Integer ele = listItr.next();
//		       if(ele % 9 == 0) {
//		    	   listItr.set(ele+1);
//		       }
//		}
//		System.out.println(arr);
		
		
//		System.out.println(arr);
//		while (listItr.hasNext()) {
//		       Integer ele = listItr.next();
//		       if(ele % 9 == 0) {
//		    	   listItr.add(1);
//		       }
//		}
//		System.out.println(arr);


	}
}
