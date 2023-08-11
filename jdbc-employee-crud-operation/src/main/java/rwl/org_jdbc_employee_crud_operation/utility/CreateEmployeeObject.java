package rwl.org_jdbc_employee_crud_operation.utility;

import java.sql.ResultSet;

import rwl.org_jdbc_employee_crud_operation.model.Employee;

public class CreateEmployeeObject {

	static public Employee getEmployeeObject(ResultSet resultSet) throws Exception {
		Employee employee = null;
		if(resultSet.next()) {
			employee = new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getDouble(6));
		}
		return employee;
	}
}
