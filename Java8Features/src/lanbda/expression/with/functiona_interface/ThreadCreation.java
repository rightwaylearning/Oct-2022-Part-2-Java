package lanbda.expression.with.functiona_interface;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	// ()->System.out.println(Thread.currentThread().getName());
	
}


public class ThreadCreation {

	public static void main(String[] args) {
		
		Runnable m= new MyThread();
		
		Thread t = new Thread(m);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
