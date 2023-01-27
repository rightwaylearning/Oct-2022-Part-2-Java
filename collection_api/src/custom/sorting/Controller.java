package custom.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Controller {
	
	public static void main(String[] args) {
		
		TreeSet<Student> tree=new TreeSet<>(new MyOrder());
		tree.add(new Student(12, "abc"));
		tree.add(new Student(1, "lmn"));
		tree.add(new Student(0, "apqrwbc"));
		tree.add(new Student(7, "ashdgfjhbc"));
		
		for (Student student : tree) {
			System.out.println(student);
		}
		
		
	}

}

class MyOrder implements Comparator<Student>{
	
	
	@Override
	public int compare(Student o1, Student o2) {
	
		  return - o1.getRollNumber().compareTo(o2.getRollNumber());
		
	}
	
}



