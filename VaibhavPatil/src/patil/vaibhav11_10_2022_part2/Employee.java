package patil.vaibhav11_10_2022_part2;

public class Employee {
	int empId;
	String name;
	long cellphone;
	static String OfficeName;
	
	void m1() {
		System.out.println(" I am Instance Method");
	}
	
	static void s1() {
		System.out.println("I am Static Powerfull method");
	}
	
	void m2() {
		//Case1::Accessing instance and static property in instance method
		System.out.println(empId);
		System.out.println(name);
		System.out.println(cellphone);
		m1();
		
		System.out.println(OfficeName);
		s1();
	}
	
	static void s2() {
		//Case1::Accessing instance and static property in Static method
		//static method madhe class same jari asla insance property kivha instance method cha object create kelyashivay
		//apan tyanche behaviour access karu shakat nahi
		
		Employee e=new Employee();
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.cellphone);
		e.m1();
		
		System.out.println(OfficeName);
		s1();
	}
	
	

}
