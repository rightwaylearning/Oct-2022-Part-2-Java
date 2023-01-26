package sorting.comparable;

import java.util.TreeSet;

public class SortStudentObjects {

	public static void main(String[] args) {
		
		TreeSet<Student> tree= new TreeSet<>();
		
		tree.add(new Student(12,"Amit","kumar"));
		tree.add(new Student(15,"Suraj","Bansal"));
		tree.add(new Student(1,"Vijay","kumar"));
		tree.add(new Student(12,"Anand","Mahidra"));
		tree.add(new Student(1,"Vijay","kumar"));
		tree.add(new Student(31,"Ratan","Tata"));
		
		for (Student student : tree) {
			System.out.println(student);
		}
	}
}
