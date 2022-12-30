package nirmal_equal_method;

public class Employee {

	String employee;
	Integer RollNumber;

	@Override
	public int hashCode() {
		return this.employee.hashCode() + this.RollNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Employee e = (Employee) obj;

		if (this.employee.equals(e.employee) && this.RollNumber.equals(e.RollNumber)) {
			return true;
		}
		return false;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public Integer getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}

}
