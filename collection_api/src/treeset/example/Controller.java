package treeset.example;

import java.util.Iterator;
import java.util.TreeSet;

public class Controller {
	public static void main(String[] args) {
		
		TreeSet<Employee> tree= new TreeSet<>();
		tree.add(new Employee(10,"A"));
		tree.add(new Employee(9,"C"));
		tree.add(new Employee(3,"N"));
		tree.add(new Employee(90,"B"));
		tree.add(new Employee(12,"Z"));
		tree.add(new Employee(90,"A"));
		tree.add(new Employee(15,"B"));
		
		for(Employee e:tree){
			System.out.println(e);
		}
		
		
	}

}
