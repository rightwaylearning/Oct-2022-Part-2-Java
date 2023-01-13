package double_colon.opt;

public class MathsOpeartion {
	
	public MathsOpeartion() {}

	public  MathsOpeartion(int a){
		System.out.println("I am MathsOpeartion constructor");
		System.out.println(a*a);
	}
	
	public void instanceMethod(int x) {
		System.out.println("I am MathsOpeartion instance method");
		System.out.println(x*x);
	}
	
	public static void staticMethod(int s) {
		System.out.println("I am MathsOpeartion static method");
		System.out.println(s*s);
	}
}
