package overloading.with.upcasting.autoboxing.vararg;

public class WideningOrUpcastingOfPrimitive {

//	public void m1(long l) {
//		System.out.println("upcasting long l");
//	}
	
//	public void m1(Object o) {
//		System.out.println("Object o");
//	}
	
	public void m1(Long l) {
		System.out.println("Long l");
	}
	
//	public void m1(Integer i) {
//		System.out.println("auto boxing Integer i");
//	}
	
	public void m1(int... x) {
		System.out.println("var-arg");
	}
	
//	public void m1(int a) {
//		System.out.println("match found");
//	}
	
	public static void main(String[] args) {
		
		WideningOrUpcastingOfPrimitive w = new WideningOrUpcastingOfPrimitive();
		int i = 10;
		w.m1(i);
	}
}
 /*
  *  here I am considering input type is primitive
  *  1] exact match
  *  2] up casting/widening 
  *  3] auto boxing (Child to Parent)
  *  4] var - arg method 
  */

