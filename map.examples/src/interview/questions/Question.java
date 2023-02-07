package interview.questions;

import java.util.HashMap;

public class Question {

	public static void main(String[] args) {
		
		HashMap<Employee, Double> map= new HashMap<>();
		
		map.put(new Employee(1,"A"), 23450.89);
		map.put(new Employee(2,"B"), 7000.00);
		map.put(new Employee(1,"A"), 10000.00);
		
		System.out.println(map.size()); //3
		System.out.println(map.get(new Employee(1,"A"))); //
		
	}
}


