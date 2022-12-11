package test;
class PPP{
	int x = 10;
	
	void m1() {
		System.out.println("I am m1 method of PPP");
	}
	
}

class CCC extends PPP{
	int y = 20;
	int x = 2000;
	
	void m2() {
		System.out.println("I am m2 method of CCC");
		System.out.println(super.x);
		super.m1();
	}
	
	void m1() {
		System.out.println("I am m2 method of CCC");
	}
}


public class SuperKeyWord {

	public static void main(String[] args) {
	 CCC c = new CCC();
	 c.m2();
	}
}
