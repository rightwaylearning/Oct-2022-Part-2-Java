package rutujanimbhore;

class Student{
	String name;
	Integer rollno;
	
	
   public Student(String name,Integer rollno) {
	 this.name=name;
	 this.rollno=rollno;
			
   }

  public boolean equals (object obj) {
	  Student s1=(student)obj;
	  if(this.name.equals(s2.name)&& this.rollno.equals(s2.rollno));
  }
	
}

public class StringStudentCompare {
	public static void main(String[] args) {
		Student s1=new Student("vinayak",101);
		Student s2=new Student("vinayak",101);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		
		String str1="abc";
		String str2=new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()==str2.hashCode());
		
		
		
		
		
		
		
		
	}

}
