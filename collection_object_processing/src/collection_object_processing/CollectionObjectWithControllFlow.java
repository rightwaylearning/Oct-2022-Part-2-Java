package collection_object_processing;

import java.util.ArrayList;
import java.util.List;

public class CollectionObjectWithControllFlow {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(21);
		al.add(30);
		al.add(41);
		al.add(50);
		al.add(61);
		al.add(70);
		al.add(80);
		al.add(91);
		al.add(100);

		// 1] first wya print AL objects
		 System.out.println(al); // al.toString();

		// 2] for loop
		// string have length() && array have .length property
//		for(int i = 0 ; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}

		// 3] using while loop

//		int j =0 ;
//		while(j < al.size()) {
//			System.out.println(al.get(j));
//			j++;
//		}

		// 4] forEach
//		for(Integer i:al) {
//			System.out.println(i);
//		}

		// assignment
		// create new one more list& add inside that list only even number from above
		// list

		List<Integer> evenNo= new ArrayList<>();
		
		for (Integer i : al) {
			if(i%2 == 0) {
				evenNo.add(i);
			}
		}
		System.out.println(evenNo);

	}
}
