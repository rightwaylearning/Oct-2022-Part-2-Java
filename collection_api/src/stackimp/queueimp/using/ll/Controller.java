package stackimp.queueimp.using.ll;

public class Controller {

	public static void main(String[] args) {
		
//		MyOwnStack stack = new MyOwnStack();
//		
//		stack.push(new Book("Core Java", "orcale corp.", 5500));  // 1
//		stack.push(new Book("jee", "orcale corp.", 7500)); //2
//		stack.push(new Book("hibernate", "web logic", 7000)); // 3
//		stack.push(new Book("spring boot", "spring", 10000)); //4
//		
//		Book b = stack.pull();
//	   // System.out.println(b);
//	    
//	    stack.pull();
//	    
//	    Book b1 = stack.pull();
//	    System.out.println(b1);
		
		
		MyOwnQueue queue = new MyOwnQueue();
		
		queue.push(new PersonOnATMLine("A", 2000.00, "ICICI"));
		queue.push(new PersonOnATMLine("B", 4000.00, "SBI"));
		queue.push(new PersonOnATMLine("C", 8000.00, "CITY"));
		queue.push(new PersonOnATMLine("D", 2000.00, "YES"));
		
		System.out.println(queue.pull());
		System.out.println(queue.pull());
	}
}
