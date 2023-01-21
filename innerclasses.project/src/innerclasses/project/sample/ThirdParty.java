package innerclasses.project.sample;

public class ThirdParty {
	
	
	void m2() {
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
