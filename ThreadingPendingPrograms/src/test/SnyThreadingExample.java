package test;

class CommonWork {
	
	int sum =0 ;
	
	 public void sum() {
		System.out.println("i am first line");
		System.out.println("i am second line");
		System.out.println("i am third line");
		
		synchronized(this) {
			for(int i = 1; i <= 1000 ; i++) {
				sum = sum + i;
			}
			System.out.println(Thread.currentThread().getName()+" = "+sum);
			sum = 0;
		}
		
		System.out.println("i am third last line");
		System.out.println("i am second last line");
		System.out.println("i am first last line");
	}
}

class MyJob extends Thread{
	CommonWork c;
	
	MyJob(CommonWork c){
		this.c =c;
	}
	
	@Override
	public void run() {
		c.sum();
	}
}



public class SnyThreadingExample {

	public static void main(String[] args) {
		CommonWork c = new CommonWork();
		
		MyJob m = new MyJob(c);
		MyJob m1 = new MyJob(c);
		MyJob m2 = new MyJob(c);
		m.start();m1.start();m2.start();
		
	}
}
