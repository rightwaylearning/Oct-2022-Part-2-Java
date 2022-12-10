package test;

class Job extends Thread {

	Thread parent;

	Job(Thread parent) {
		this.parent = parent;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
			// Thread.yield();
			try {
				if (i == 3) {
					parent.join();
				}
			} catch (Exception e) {
			}
		}
	}
}

public class YeildMethod {

	public static void main(String[] args) throws Exception {

		Thread parent = Thread.currentThread();

		Job w = new Job(parent);
		w.start();

		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName());

		}
	}
}
