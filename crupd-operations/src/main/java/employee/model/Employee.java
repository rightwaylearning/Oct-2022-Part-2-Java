package employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
// above annotation is optional if table name & class name is same
public class Employee {

	@Id
	@Column(name = "eid")
	private Integer employeeId;
	
	@Column(name="e_name")
	private String employeeName;
	
	@Column(name="e_dept")
	private String employeeDepartment;
	
	//@Column(name="salary") here salary column name & entity class property name is same in that case @Column annotation is optional
	private Double salary;
	
	public Employee() {}

	public Employee(Integer employeeId, String employeeName, String employeeDepartment, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.salary = salary;
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

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", salary=" + salary + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeDepartment()=" + getEmployeeDepartment()
				+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
