package test;

class parent{
	
	parent(){
		System.out.println("i am prent class constructor");
	}
}

class Child extends parent{
	
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
