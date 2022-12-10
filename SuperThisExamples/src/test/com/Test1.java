package test.com;

class M{
	int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println("I am m1 method of M class");
	}
		
}

class N extends M{
	
	int a = 100;
	int b = 200;
	int x = 300;
	
	void m3() {
		System.out.println("I am m3 method of N class");
	}
	
	void m1() {
		System.out.println("I am m1 method of N class");
	}
	
	void showParendata() {
		System.out.println(super.x);
		super.m1();
	}
}

public class Test1 {

	public static void main(String[] args) {
	
	    N n= new N();
//		System.out.println(n.x); // child
//		n.m1(); // child
	    
	    n.showParendata();
		
	}
}
