package test;

class A{
	A(){
		super();
		System.out.println("I am A class Constructor");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("");
	}
}


public class SuperDemo {
	
	SuperDemo(){
		super();
	}

	public static void main(String[] args) {
		 B b= new B();
	}
}
