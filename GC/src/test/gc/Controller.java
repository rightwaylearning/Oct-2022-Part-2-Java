package test.gc;

public class Controller {
	
	public static void main(String[] args) throws Exception {
		
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.freeMemory());
		Test t=new Test();
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		Test tt1=new Test();
		Test ttt2=new Test();
		Test ttttt3=new Test();
		Test t7=new Test();
		Test t01=new Test();
		Test t21=new Test();
		Test t31=new Test();
		t =null;t1=null;t3=null;t4=null;tt1=null; ttt2 =null;
		r.gc();
		Test t221=new Test();
		Test t321=new Test();
		Test t2221=new Test();

		
		Thread.currentThread().sleep(10000);
		System.out.println(r.freeMemory());
		
		
	}

}
