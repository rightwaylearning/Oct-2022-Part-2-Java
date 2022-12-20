package test;

class MyNewThread1 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("MyNewThread  1 >>>>  "+i);
		}
	}
}

class MyNewThread2 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("MyNewThread  2 >>>>  "+i);
			
			if(i == 10) {
				try {
					Thread.sleep(2000);
				}catch (Exception e) {}
			}
		}
	}
}

public class ThreadSleep {

	public static void main(String[] args) {
		
		MyNewThread1 t1 = new MyNewThread1();
		MyNewThread2 t2= new MyNewThread2();
		t1.start();t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Parent   >>>>  "+i);
		}
		
		
	}
}
