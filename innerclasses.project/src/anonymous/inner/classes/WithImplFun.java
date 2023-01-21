package anonymous.inner.classes;

interface Fun{
	
	void doFun(); 
}

public class WithImplFun {

	public static void main(String[] args) {
		
		Fun f = new Fun() {
			@Override
			public void doFun() {
				System.out.println("spend time with your friends");
			}
		};
		f.doFun();
	}
}
