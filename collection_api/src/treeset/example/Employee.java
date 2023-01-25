package treeset.example;

public class Employee implements Comparable<Employee>{
	
	private Integer employeeId;
	private String name;
	
	public Employee() {}
	
	public Employee(Integer employeeId, String name) {
		this.employeeId = employeeId;
		this.name= name;
	}
	
	@Override
	public int hashCode() {
		return this.employeeId.hashCode() + this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 =(Employee)obj;
		
		if(this.employeeId.equals(e1.employeeId) && this.name.equals(e1.name)) {
			return true;
		}
		return false;
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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}
// DNSO on id
//	@Override
//	public int compareTo(Employee o) {
//		Integer e1 = this.getEmployeeId();
//		Integer e2 = o.getEmployeeId();
//		
//		if(e1 < e2) {
//			return -1;
//		}else if( e1 > e2) {
//			return +1;
//		}else {
//			return -1;
//		}
//		
//	}
	/*
	 * 
	 * @Override
	public int compareTo(Employee o) {
	// only by string DNSO
	String name1 = this.getName();
		String name2 = o.getName();
		int i = name1.compareTo(name2);
		
		if(i == 0) {
			return this.compareUsingId(o);
		}else {
			return i;
		}
	}
	 * *
	 */
	// mix
	@Override
	public int compareTo(Employee o) {
		//return this.getName().compareTo(o.getName());
		// 3 line code I am going to convert in one line
		
		String name1 = this.getName();
		String name2 = o.getName();
		int i = name1.compareTo(name2);
		
		if(i == 0) {
			return this.compareUsingId(o);
		}else {
			return i;
		}
				
	}
	
	public int compareUsingId(Employee o) {
	Integer e1 = this.getEmployeeId();
	Integer e2 = o.getEmployeeId();
	
	if(e1 < e2) {
		return -1;
	}else if( e1 > e2) {
		return +1;
	}else {
		return -1;
	}
	
}
	

}
