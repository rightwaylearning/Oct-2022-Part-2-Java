package test;

public class InstanceBlockDemo {

	public InstanceBlockDemo() {  // property init
		System.out.println("i am constructor");
	}
	
	static {
		System.out.println("i am static block 1");
	}
	
	{
	   System.out.println("i am instance block 1");	
	}
	public static void main(String[] args) {
		System.out.println("i am main method");
		System.out.println("------------------");
	  InstanceBlockDemo i = new InstanceBlockDemo();
	  System.out.println("---------------------------");
	  InstanceBlockDemo i1 = new InstanceBlockDemo();
	  System.out.println("---------------------------");
	  InstanceBlockDemo i2 = new InstanceBlockDemo();
	}
	
	{
		System.out.println("i am instance block 2");
		
	}
	
	static {
		System.out.println("i am static block 2");
	}
}
