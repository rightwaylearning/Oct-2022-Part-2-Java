package comparator_custom_sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> tree= new TreeSet<>(new CustomSorting());
		 tree.add("Ab");
		 tree.add("Cc");
		 tree.add("aB");
		 tree.add("Zz");
		 System.out.println(tree);
	}
}

class CustomSorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
//		int i = o1.compareTo(o2);
//		return -i;
		
		return o2.compareTo(o1);
	}
	
}