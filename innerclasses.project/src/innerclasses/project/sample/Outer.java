package innerclasses.project.sample;

public class Outer {
	
	Integer a ;
	static String name;
	
	Outer(){
		this.a =100;
		name = "hello! I am Outer sttaic property";
	}

	class Inner{
		void m1() {
			System.out.println("I am  inner ckass m1() method");
			System.out.println(a);
			System.out.println(name);
		}
	}
	
	void test() {
		Inner i= new Inner();
		i.m1();
	}
	
	static void test1() {
		Outer o= new Outer();
		Outer.Inner i= o.new Inner();
		i.m1();
	}
	
	public static void main(String[] args) {
		Outer o= new Outer();
		Outer.Inner i= o.new Inner();
		i.m1();
	}
}

// inside normal inner class u can't declare static 
// we can't declare main method

// outer class all data member it may be static or non static  , we can access inside inner class
