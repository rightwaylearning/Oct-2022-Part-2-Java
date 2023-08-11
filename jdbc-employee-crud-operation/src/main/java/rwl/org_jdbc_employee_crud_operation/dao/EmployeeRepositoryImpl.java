package rwl.org_jdbc_employee_crud_operation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import rwl.org_jdbc_employee_crud_operation.model.Employee;
import rwl.org_jdbc_employee_crud_operation.utility.CreateEmployeeObject;
import rwl.org_jdbc_employee_crud_operation.utility.DbConnection;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee getEmployee(Integer employeeId) throws Exception{
		
			Connection con = DbConnection.getDBConnection();
			
            PreparedStatement stm = con.prepareStatement("select * from employee e where e.id = ?");
            stm.setInt(1, employeeId);
            ResultSet result =  stm.executeQuery();
            
            Employee employee = CreateEmployeeObject.getEmployeeObject(result);
            con.close();
            
      		return employee;
	}

	@Override
	public Employee[] getAllEmployee() {
		return null;
	}

	@Override
	public Integer saveEmployee(Employee e) throws Exception {
		
		Connection con = DbConnection.getDBConnection();
		PreparedStatement stm = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		stm.setInt(1, e.getEmployeeId());
		stm.setString(2, e.getFirstName());
		stm.setString(3, e.getLastName());
		stm.setString(4, e.getEmail());
		stm.setString(5, e.getGender());
        stm.setDouble(6, e.getSalary());
        int i = stm.executeUpdate();
		return i;
	}

	@Override
	public Integer updateEmployee(Employee e) {
		return null;
	}

	@Override
	public Integer deleteEmployee(Integer employeeId) {
		return null;
	}

}
