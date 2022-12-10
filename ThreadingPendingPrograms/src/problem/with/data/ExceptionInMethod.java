package problem.with.data;

class B extends Thread{
	
	@Override
	public void run() {
		System.out.println("start");
		int n = 10/0;
		System.out.println("end >>> vishwa");
	}
}

public class ExceptionInMethod {

	public static void main(String[] args) {
		 B b= new B();
		 b.start();
	}
}
