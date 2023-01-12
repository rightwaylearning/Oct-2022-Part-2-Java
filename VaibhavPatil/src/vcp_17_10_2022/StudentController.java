package vcp_17_10_2022;

public class StudentController {
public static void main(String[] args) {
	Student s=new Student(1,"Vaibhav","MCA");
	System.out.println(s.getRollNumber());
	System.out.println(s.getName());
	System.out.println(s.getStd());
	
	Student s1=new Student();
	s1.setRollNumber(2);
	s1.setName("Akash");
	s1.setStd("MCAS");
	
	int data1=s1.getRollNumber();
	String data2=s1.getName();
	String data3=s1.getStd();
	System.out.println(data1);
	System.out.println(data2);
	System.out.println(data3);
	
	Student s2=new Student(3,"dipak","MCA");
	System.out.println(s2.getRollNumber());
	System.out.println(s2.getName());
	System.out.println(s2.getStd());

	
}
}
