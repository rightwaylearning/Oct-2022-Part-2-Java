package rwl.org_jdbc_employee_crud_operation.dao;

import rwl.org_jdbc_employee_crud_operation.model.Employee;

public interface EmployeeRepository {

	public Employee getEmployee(Integer employeeId) throws Exception;

	public Employee[] getAllEmployee() throws Exception;

	public Integer saveEmployee(Employee e) throws Exception;

	public Integer updateEmployee(Employee e) throws Exception;

	public Integer deleteEmployee(Integer employeeId) throws Exception;

}
