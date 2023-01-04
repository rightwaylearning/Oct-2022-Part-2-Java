package string.info.pack;

class Student{
	
	String name;
	Integer rollNumber;
	
	public Student(String name, Integer rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
}

public class StringAndStudentComp {

	public static void main(String[] args) {
		
		Student s1 = new Student("Vijaybhaskar",101);
		Student s2 = new Student("Vijaybhaskar",101);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode() == str2.hashCode());
	}
}
