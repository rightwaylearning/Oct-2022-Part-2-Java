package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,56,23,45,2,7);
	
		Optional<Integer> min = list.stream().max((n1,n2)->n1.compareTo(n2));
		
		System.out.println(min.get());
	}	
}
