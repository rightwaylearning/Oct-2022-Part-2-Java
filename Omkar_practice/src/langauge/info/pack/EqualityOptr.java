package langauge.info.pack;

class A{}

class D{}
class E extends D{};

public class EqualityOptr {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		A a2 = a;
		
		E e = new E();
		D d = new D();
		Object o = new Object();
		
		// == operator with refrence variable
		
		System.out.println(a == a1);
		System.out.println(e == d);
		System.out.println(o == e);
		// System.out.println(a == e);
		System.out.println(a == a2);
		
		//----------------------------
		int aa = 10;
		int bb = 20;
		
		System.out.println(aa == bb);// true
		
	}
}
