package rwl.org_jdbc_employee_crud_operation;

import rwl.org_jdbc_employee_crud_operation.dao.EmployeeRepository;
import rwl.org_jdbc_employee_crud_operation.dao.EmployeeRepositoryImpl;
import rwl.org_jdbc_employee_crud_operation.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeRepository dao = new EmployeeRepositoryImpl();
        try {   
    	
    	Employee e=  dao.getEmployee(1011);
    	System.out.println(">>>>>>>>>>>>>"+e);
        }catch (Exception e) {
			System.out.println(e);
		}
    	
//    	try {
//			Employee e = new Employee(1011, "Bhagat", "singh", "india@gmail.com", "male", 12300000.00);
//    		Integer i = dao.saveEmployee(e);
//    		System.out.println(i);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
    }
}
