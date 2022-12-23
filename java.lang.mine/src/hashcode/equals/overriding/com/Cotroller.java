package hashcode.equals.overriding.com;

public class Cotroller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollNumber(23); s.setName("raju");
				
		
		Student s1 = new Student();
		s1.setRollNumber(23); s1.setName("raju");
		
		// ***********
		System.out.println(s.equals(s1)); // true
		System.out.println(s.hashCode()); 
		System.out.println(s1.hashCode());
		//---------------------------------------
		System.out.println(s.hashCode() == s1.hashCode()); // true
		System.out.println(s == s1); // false
	}
}
  // == opt & .equals() >>> 
// 1,2 ,3 ,4
//-------------------------------------------
// Contract between .equals() & hashCode();
// 1] r1.equals(r2) >> true    >> r1.hashCode() == r2.hashCode(); // true ****
// 2] r1.equals(r2) >> false   >> r1.hashCode() == r2.hashCode(); 
                                  // may be true or may false;

// 3] r1.hashCode() == r2.hashCode(); >> true; r1.equals(r2) >> may be true or may false;
// 4] r1.hashCode() == r2.hashCode(); >> false;  r1.equals(r2) >> false;
// -----------------------------------------------------------------------------


