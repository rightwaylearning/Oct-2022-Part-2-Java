package test;

class JOb{
	
	synchronized void myJob(String message) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(message + "  " + i);
		}
	}
}

class CildThread extends Thread {
	String message;
	JOb job;

	CildThread(String message,JOb job) {
		this.message = message;
		this.job =job;
	}

	@Override
	 public void run() {
         job.myJob(message);
	}
}

public class SycDemoExample extends Thread {
	public static void main(String[] args) {
		JOb job= new JOb();
		CildThread t1= new CildThread("I am dhoni thread",job);
		CildThread t2= new CildThread("I am yuvraj thread",job);
		CildThread t3= new CildThread("I am virendra thread",job);
		t1.start();t2.start();t3.start();

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("I am main method  & parent thread is running me  " + i);
//		}
	}

}
