package nirmal_super;

public class AA {

	int a = 10;
	int b = 20;
	
	
	public void m1() {
		System.out.println("i am a m1  of class a");
	}
	
	
	void m2() {
		System.out.println("i am a m2 method of class AA");
	}
}

class BB extends AA{
	int a = 30;
	int b = 40;
	
	void m3() {
		System.out.println("i am a m3");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
		super.m1();
		super.m2();
		

	}
	
}