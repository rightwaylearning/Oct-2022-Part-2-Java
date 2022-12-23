package threading.program;

class B extends Thread{
	
	@Override
	public void run() {
		System.out.println("start");
		int n = 10/0;
		System.out.println("end");
	}
}

public class ExceptionalMethod {

	public static void main(String[] args) {
		B b = new B();
		b.start();
	}
}
