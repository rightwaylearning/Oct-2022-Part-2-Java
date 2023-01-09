package collection_api.list.array.list.opt;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class OptOnProductWiThTheHelpOfAL {

	public static void main(String[] args) {
		
		ArrayList<Product> al=new ArrayList<Product>();
		// size 4  >> valid index range  0 - 3
		al.add(new Product(1, "TV", "electronic"));
		al.add(new Product(2, "pen", "study material"));
		al.add(new Product(3, "mobile", "electronic"));
		al.add(new Product(4, "notebook", "study matrial"));
		
		//System.out.println(al);  // there toString override to print data of AL
		
		// I am using for loop
		
		for(int i= 0; i < al.size() ; i++) {
			Product p  = al.get(i);
			//System.out.println(p);
		}
		
		// using while loop
		int j = 0;
		while(j < al.size()) {
			Product p  = al.get(j);
			//System.out.println(p);
			j++;
		}
		
		// forEach // generic type
		for(Product p : al) {
			//System.out.println(p);
		}
		
		// cursor (api which are going to help to travel collection objects)
		//Iterator<E>
		//ListIterator<E>
		//Enumeration<E>
		
		Iterator<Product> itr = al.iterator();
		while(itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p);
		}
		
	}
}
