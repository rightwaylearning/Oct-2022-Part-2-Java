package langauge.info.pack;


class B{
	
}

class Student{
	int rollNumber;
	String name;
	
	Student(int rollNumber,String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
}
public class Test {

	public static void main(String[] args) {
		
		B a = new B();
		B a1 =new B();
		B a2 = a;
		
		System.out.println("-----------------------------");
	    System.out.println(a.hashCode());
	    System.out.println(a1.hashCode());
	    System.out.println(a2.hashCode());
	    
	    Student s1 = new Student(10,"Alex");
	    Student s2 = new Student(11,"Bee");
	    Student s3 = new Student(12,"Lee");
	    
	    System.out.println("----------------------------");
	    System.out.println(s1.hashCode()); // 10
		System.out.println(s2.hashCode()); // 11
		System.out.println(s3.hashCode()); // 12

		System.out.println("-------------------");
		// ------------------------------ ------- point 1
		String str = Integer.toHexString(a1.hashCode());
		System.out.println(str);
		System.out.println("-----------------------");
		// ---------------------------------------- point 2
      // here getClass() method return Class class object
//		Class obj = a1.getClass();
//		 String name = obj.getName();
//		 System.out.println(name);
		System.out.println(a1.getClass().getName());
		System.out.println(a1.getClass().getName() +"@"+Integer.toHexString(a1.hashCode()));
		
		System.out.println("---------------------------------");
		System.out.println(a1);  // a1.toString();
		System.out.println(a1.toString());
	}
}
