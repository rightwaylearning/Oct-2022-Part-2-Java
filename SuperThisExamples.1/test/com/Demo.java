package test.com;


class Parent{
	
	Parent(){
		System.out.println("I am parent class Constructor");
	}
}

class  Child extends Parent{
	
	
	Child(){
	 this(10);
	}
	
	Child(int a){

	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		Child c = new Child();
	}
}
