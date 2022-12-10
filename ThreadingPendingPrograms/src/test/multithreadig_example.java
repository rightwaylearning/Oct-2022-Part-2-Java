package test;

class Worker extends Thread{
	
	@Override
	public void run() {
		for(int i= 0; i< 10; i++ ) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			if(i == 5) {
				try {
				Thread.sleep(1000);
				}catch(Exception e) {}
			}
		}
	}
}


public class multithreadig_example {

	public static void main(String[] args) {
		
		Worker w= new Worker();
		w.start();
		
		for(int i= 0; i< 10; i++ ) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
