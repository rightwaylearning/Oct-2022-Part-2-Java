package threading.program;

class A{

public Integer i = 100;
synchronized void m1() {
	i = i -1;
	i = i -1;
	i = i -1;
	i = i -1;
  try {
	  Thread.sleep(5000);
  }catch(Exception e) {}
  System.out.println(Thread.currentThread().getName()+" "+this.i);
  
   }
 }
class MyThread extends Thread{
	A a;
	
	MyThread(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
public class ProblemWithData {

	public static void main(String[] args) {
		A a = new A();
		
		MyThread t1 = new MyThread(a); 
		MyThread t2 = new MyThread(a); 
		MyThread t3 = new MyThread(a); 
		MyThread t4 = new MyThread(a); 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
