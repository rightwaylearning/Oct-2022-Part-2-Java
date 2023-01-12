package overloading.with.upcasting.autoboxing.vararg;

public class VarArgMethod {

	public void sum(int... x) {

		int s = 0;
		for (int i = 0; i < x.length; i++) {
			s = s + x[i];
		}

		System.out.println(s);
	}

	public static void main(String[] args) {

		VarArgMethod v = new VarArgMethod();
		v.sum();  // 0
		v.sum(10, 20); //30
		v.sum(10, 20, 30); // 60
	}
}
