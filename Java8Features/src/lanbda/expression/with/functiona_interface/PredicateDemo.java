package lanbda.expression.with.functiona_interface;

import java.util.function.Predicate;

class Student{
	Double percentage;
	String name;
	//
	public Student() {}

	public Student(Double percentage, String name) {
		super();
		this.percentage = percentage;
		this.name = name;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class PredicateDemo {

	public static void main(String[] args) {
		

		 Predicate<Student> check = el -> {
			if(el.percentage > 70.0) {
				return true;
			}else {
				return false;
			}
		 };
	
		 Student s = new Student(67.89, "A");
		 Student s1= new Student(89.90,"B");
		 
		 System.out.println(check.test(s));
		 System.out.println(check.test(s1));
	}
	
}
