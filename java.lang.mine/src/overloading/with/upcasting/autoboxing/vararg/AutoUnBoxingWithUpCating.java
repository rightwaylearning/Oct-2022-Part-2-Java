package overloading.with.upcasting.autoboxing.vararg;

public class AutoUnBoxingWithUpCating {

	public void m1(long l) {
	   System.out.println("long l");	
	}
	
//	public void m1(Object o) {
//		System.out.println("Object o");
//	}
	
	public void m1(Long l) {
		System.out.println("Long l");
	}
	
	public static void main(String[] args) {
		AutoUnBoxingWithUpCating a = new AutoUnBoxingWithUpCating();
		Integer  i = 10;
		a.m1(i);
		
		/*
		 * here we are passing input as wrapper class object
		 * 1] match
		 * 2] Child to Parent
		 * 3] auto un boxing  wrapper to primitive
		 * 4] then find of match
		 * 5] up casting 
		 */
	}
}
