package test;

class ChildThread extends Thread{
	
	@Override
	public void run() {
	    
		System.out.println(this.hashCode());
		
		Thread t = Thread.currentThread();
		System.out.println(t.hashCode());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
//		ChildThread c = new ChildThread();
//		c.start();
//		System.out.println(c.hashCode());
//		Thread t = Thread.currentThread();
//		
//		System.out.println(t.hashCode());
		
		System.out.println("Hello");
		Thread c = Thread.currentThread();
		
		System.out.println(c.getName());
		
		
	}
}
