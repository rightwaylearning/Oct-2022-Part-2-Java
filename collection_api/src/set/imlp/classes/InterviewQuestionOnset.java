package set.imlp.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InterviewQuestionOnset {
	
	public static void main(String[] args) {
		
		// How to remove duplicate objects from list
		// using api Or using custom logic
		List<Integer> list = new ArrayList<>();
		list.add(100); 
		list.add(200);
		list.add(300); 
		list.add(100);
		list.add(100);
		System.out.println(list.size()); // 5 
		
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set.size()); // 3
		//---------------------------------
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// tell me size of hashSet
		
		HashSet<Employee> h = new HashSet<>();
		boolean f1 = h.add(new Employee(11,"AB","IPL"));
		System.out.println(f1); // true
		
		boolean f2 = h.add(new Employee(11,"AB","IPL"));
		System.out.println(f2); // true
		
		System.out.println(h.size()); //  2
		
	}

}


class Employee{
	private Integer employeeId;
	private String name;
	private String companyName;
	
	public Employee() {}

	public Employee(Integer employeeId, String name, String companyName) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.companyName = companyName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", companyName=" + companyName + "]";
	}
	
	
}
