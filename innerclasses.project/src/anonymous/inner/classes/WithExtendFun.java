package anonymous.inner.classes;

class PopCorn{
	
	public void test() {
		System.out.println("spicy");
	}
	
}



public class WithExtendFun {

	public static void main(String[] args) {
		
		PopCorn p= new PopCorn();
		p.test();
		
		PopCorn p1= new PopCorn() {
			@Override
			public void test() {
				System.out.println("salty");
			}
		};
		
		p1.test();
		
		
	}
}
