package collection_api.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListcapacityAndConst {

	public static void main(String[] args) {
		//1] default constructor 
		ArrayList<Integer> al= new ArrayList<>(); // 10
		// size 
		// capacity 
		
		for(int i=1; i<=10; i++) {
			al.add(i);
		}
		
		System.out.println(al.size());  // 
		// here capacity of ArrayList is  = 10
		
		// new capacity = current capacity *3/2 + 1
		al.add(100);
		// here capacity of arrayList = 16
   //------------------------------------------------------------
		ArrayList<Integer> al1 = new ArrayList<>(100);
		
  // advantage of aeeay list
   // 1] insertion order follow 2] duplicate object 3] null insertio  allow
	// 4] hetro object
 // why selected array list
	// Key >> most of the operation is search on index then we can go with arrayList
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); //..............
	// ----------------------------------------------------------	
		ArrayList<Integer> al2 = new ArrayList<>(list);
	// ------------------------------------------------
		
		/*
		 * 
		 Key features of Array List
		 1] insertion order follow
		 2] duplicate Object are allow
		 3] null insertion is possible , any time
		 4] hetro objects are allow
		 
		 -------------------------------
		 ArrayList >> Collection ,List
		        >> RandomAccess, Cloneable, Serializable (marker interface)
		        >> Growable or resizeable data structure
		        >> all classes of collection api alreday override toString.
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}
