package anonymous.inner.classes;



public class CreateThreadWithinnerClass {

	public static void main(String[] args) {
	
		Thread m = new Thread(){
			@Override
			public void run() {
				for(int i = 1; i <=1000 ; i++) {
					System.out.println("child = "+i);
				}
			}
		};
		
		m.start();
		
		for(int i = 1; i <=1000 ; i++) {
			System.out.println("Parent = "+i);
		}
	}
}
