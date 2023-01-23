package sets.imlp23.classes.interview;

import java.util.HashSet;

public class InterviewQuestion {

	public static void main(String[] args) {

		HashSet<Employee> set= new HashSet<>();
		Boolean b1 = set.add(new Employee(11,"A"));  // true
		Boolean b2 =set.add(new Employee(11,"A")); //  false
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(set.size()); // 2
		
	}
	
}















