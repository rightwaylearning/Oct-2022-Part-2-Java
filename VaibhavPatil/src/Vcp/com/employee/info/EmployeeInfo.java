package Vcp.com.employee.info;

public class EmployeeInfo {

 Employee[] getEmployeeInfo() {
		Employee[] emp=new Employee[4];
		Employee e1=new Employee("Sandesh",45,"Bhandari associate");
		emp[0]=e1;
		emp[1]=new Employee("vaibhav",55,"IBM");
		emp[2]=new Employee("akash",12,"Wipro");
		emp[3]=new Employee("Swagat",34,"Cognizont");
		
		return emp;
	}
}
