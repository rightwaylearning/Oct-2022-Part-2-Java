package static_snch_method;

class A {
	public static Integer i = 100;
	
	 static void m1() {
		i = i -1;
		i = i -1;
		try {
			Thread.sleep(5000);
			}catch(Exception e) {}
		i = i -1;
		i = i -1;
		
		System.out.println(Thread.currentThread().getName()+ " " +A.i);
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		A.m1();
		
	}
}

public class StaticSynchMethods {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		t1.start();t2.start();t3.start();t4.start();
	}
}
