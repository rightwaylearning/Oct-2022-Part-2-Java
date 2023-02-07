package interview.questions;

public class Employee{
	private Integer employeeId;
	private String employeeName;
	
	public Employee() {}
	
	
	@Override
	public int hashCode() {
		return this.getEmployeeId().hashCode() + this.getEmployeeName().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee)obj;
		
		if(this.getEmployeeId().equals(e.getEmployeeId()) && this.getEmployeeName().equals(e.getEmployeeName())) {
           return true;			
		}
		
		return false;
	}

	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}
