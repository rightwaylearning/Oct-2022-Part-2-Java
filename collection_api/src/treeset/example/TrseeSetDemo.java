package treeset.example;

import java.util.TreeSet;

class Student{
	int i;
	int j;
	
	public Student() {}
	
	public Student(int i, int j) {
		this.i = i;
		this.j =j;
	}

	@Override
	public String toString() {
		return "Student [i=" + i + ", j=" + j + "]";
	}
	
}

public class TrseeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(100);
		t.add(10000);
		t.add(10);
		t.add(1);
		t.add(1000);
		System.out.println(t);
		// number  >> NSO >> 1.....ascending order
		// 1,10,100,1000,10000
		
		TreeSet<String> set = new TreeSet<>();
		set.add("Z");
		set.add("B");
		set.add("A");
		set.add("a");
		set.add("L");
		System.out.println(set); // A B L Z a
		
		TreeSet<Student> s= new TreeSet<>();
		s.add(new Student(10,20));
		s.add(new Student(10,20));
		s.add(new Student(23,45));
		System.out.println(s);
	}
}
