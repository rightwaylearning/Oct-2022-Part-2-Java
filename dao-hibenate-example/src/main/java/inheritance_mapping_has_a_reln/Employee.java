package inheritance_mapping_has_a_reln;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="new_employee")
public class Employee {

	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="salary")
	private Double salary;
	
	@Embedded
	private Address adr;
	
	public Employee() {}

	public Employee(Integer empId, String employeeName, Double salary, Address adr) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.adr = adr;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	
}
