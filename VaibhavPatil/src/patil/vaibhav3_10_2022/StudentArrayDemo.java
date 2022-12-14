package patil.vaibhav3_10_2022;

public class StudentArrayDemo {

	public static void main(String[] args) {
		
		Student [] s=new Student[3];
		
		Student obj=new Student();
		obj.rollnumber=1;
		obj.name="vaibhav patil";
		s[0]=obj;
		
		Student obj1=new Student();
		obj1.rollnumber=2;
		obj1.name="Mahakal";
		 s[1]=obj1;
		 
		 Student obj2=new Student();
		 obj2.rollnumber=3;
		 obj2.name="Ganesh gurav";
		 s[2]=obj2;
		 
		 System.out.println(obj.rollnumber);
		 System.out.println(s[0].name);
		 
		 System.out.println(s[1].rollnumber);
		 System.out.println(obj1.name);
		 
		 System.out.println(s[2].rollnumber);
		 System.out.println(s[2].name);
		
		
	}
}
