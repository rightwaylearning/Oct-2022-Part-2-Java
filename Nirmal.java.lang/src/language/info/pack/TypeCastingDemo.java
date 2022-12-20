package language.info.pack;

class Test11{
	
	public void doSome(Object o) {
	//	o.m1();
		AAA a = (AAA)o;
		a.m1();
	}
}
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		Test11 t = new Test11();
		AAA a= new AAA();
		t.doSome(a);
		
	}
}

class AAA{
	
	void m1() {
		System.out.println(" AAA");
	}
}