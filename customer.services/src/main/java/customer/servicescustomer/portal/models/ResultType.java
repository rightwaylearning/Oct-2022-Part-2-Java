package customer.servicescustomer.portal.models;

import javax.persistence.Entity;

@Entity
public class ResultType {

	private String departmentName;
	private Double salary;
	private Integer count;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "ResultType [departmentName=" + departmentName + ", salary=" + salary + ", count=" + count + "]";
	}
	
	
}
