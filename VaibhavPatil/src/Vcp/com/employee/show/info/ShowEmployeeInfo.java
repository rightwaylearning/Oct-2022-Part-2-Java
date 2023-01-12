package Vcp.com.employee.show.info;
import Vcp.com.employee.info.Employee;
import Vcp.com.employee.info.EmployeeInfo;

public class ShowEmployeeInfo {
public static void main(String[] args) {
	//Vcp.com.employee.info.Employee obj=new Vcp.com.employee.info.Employee();
	//using fully qulified name
	
	EmployeeInfo obj=new EmployeeInfo();
	Employee[] employeeArray=obj.getEmployeeInfo();
	for(int i=0;i<employeeArray.length;i++) {
		System.out.println(employeeArray[i].getEmployeeName());
		System.out.println(employeeArray[i].getEmployeeNumber());
		System.out.println(employeeArray[i].getOfficeName());

		
	}
	
}
}
