package comparator_custom_sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringBylength {

	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet<>(new MyOwnSorting());
		tree.add("abcbshdhfh");
		tree.add("abcbshdhfhjsdfjksdkf");
		tree.add("ytuuy");
		tree.add("abchd");
		tree.add("abcbshdhfh989");
		
		for(String str :tree) {
			System.out.println(str);
		}
		
	}
}

class MyOwnSorting implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2) {
		
		if(o1.length() > o2.length()) {
			return -1;
		}else if(o1.length() <o2.length()) {
			return +1;
		}else {
			return o1.compareTo(o2);
		}
	}
}
