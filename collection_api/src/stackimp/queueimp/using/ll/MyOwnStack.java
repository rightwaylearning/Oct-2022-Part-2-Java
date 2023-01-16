package stackimp.queueimp.using.ll;

import java.util.LinkedList;

public class MyOwnStack {

	private LinkedList<Book> list;
	
	public MyOwnStack() {
		this.list = new LinkedList<>();
	}
	
	// add element inside list >> push opt
	public void push(Book book) {
		this.list.addLast(book);
	}
	
	public Book pull() {
		return this.list.removeLast();
	}
	
}
