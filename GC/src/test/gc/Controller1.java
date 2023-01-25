package test.gc;

public class Controller1 {

	public static void main(String[] args) {
		
		
		Test t1= new Test();
		t1=null;
		
		System.gc();
		
		System.out.println(">>>>>>>>>>>>>>>");
		
		
	}
}
