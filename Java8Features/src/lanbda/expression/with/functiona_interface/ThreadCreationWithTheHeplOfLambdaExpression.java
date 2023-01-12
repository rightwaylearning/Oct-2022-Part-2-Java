package lanbda.expression.with.functiona_interface;

public class ThreadCreationWithTheHeplOfLambdaExpression {

	public static void main(String[] args) {
		
//		Runnable r = ()->System.out.println(Thread.currentThread().getName());
//		Thread t = new Thread(r);
		
//		Thread t = new Thread(()->System.out.println(Thread.currentThread().getName()));
//		t.start();
		
		new Thread(()->System.out.println(Thread.currentThread().getName())).start();
		
	}
}

