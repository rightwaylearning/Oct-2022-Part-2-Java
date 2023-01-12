package patil.vaibhav11_10_2022_part2;

public class ControllerForEmployee {
public static void main(String[] args) {
	
	//Case2::Accessing instance and static property in Another class

	//case 2 maddhe static property n static behaviour sathi object create karaychi kahich garaj nahi 
	//using class name as reference variable we can  easily access those properties
	Employee.OfficeName="Microsoft";
	Employee.s1();
	Employee.s2();
	
	Employee e=new Employee();
	e.name="vaibhav";
	e.empId=23;
	e.cellphone=7895641218L;
	e.m1();
	e.m2();
	
	
	
}
}
