package language.info.pack;

  class RR{
	  int a;
	  int b;
	  
	  public RR(int a, int b) {
		  this.a =a;
		  this.b =b;
	  }
	  
	  @Override
	public boolean equals(Object obj) { 
		
		  RR r2 =(RR)obj;
		  
		// Object obj =new RR(10,20)
		//  float f = 45.89f;
		// int h = (int)f;
		  
		  
		  if(this.a == r2.a && this.b == r2.b) {
			  return true;
		  }	
		  
		  return false;
	}
	  
	  @Override
	public int hashCode() {
		return this.a + this.b + 67890;
	}  
	  
  }


public class HashtableRestriction {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode()); // true
		System.out.println("----------------------------------------");
		
		RR r1 = new RR(10,20);
		RR r2 = new RR(10,20);
		System.out.println(r1.equals(r2)); // true
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.hashCode() ==  r2.hashCode());
	}
}
