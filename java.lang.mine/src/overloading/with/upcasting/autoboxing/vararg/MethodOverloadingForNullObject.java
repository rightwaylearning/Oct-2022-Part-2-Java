package overloading.with.upcasting.autoboxing.vararg;

public class MethodOverloadingForNullObject {

	void m1(Object o) {
		System.out.println("Object o");
	}
	
	void m1(Integer i) {
		System.out.println("Integer i");
	}
	
	void m1(Long i) {
		System.out.println("Long i");
	}
	
	public static void main(String[] args) {
		MethodOverloadingForNullObject m= new MethodOverloadingForNullObject();
		m.m1(null);
		
		/*
		 * here I am passing null object
		 * so whatever method are there required child-parent reln otherwise we will get
		 *  compile time error while calling method
		 */
	}
}
