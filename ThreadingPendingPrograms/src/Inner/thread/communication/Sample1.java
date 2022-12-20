package Inner.thread.communication;


class Sum {
	int s = 0;
	public void add() {
		int local = 0;
       for(int  i =1; i<=10 ;i ++) {
    	   local = local + i;
       }
       s = local;
       synchronized (this) {
          this.notify();
       }
	}
	public void printResult() {
		if(s == 0) {
			synchronized (this) {
				try {
				this.wait(1000);
				}catch(Exception e) {}
			}
		}
		System.out.println(s);
	}
}

class ChildThread extends Thread{
	
	public Sum s;
	
	public ChildThread(Sum s){
		this.s = s;
	}
	
	public void run() {
		s.add();
	}
}

public class Sample1 {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		
		ChildThread c = new ChildThread(s);
	    c.start();
	    
	    s.printResult();
		
	}
}
