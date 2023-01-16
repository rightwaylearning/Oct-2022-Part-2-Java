package stackimp.queueimp.using.ll;

import java.util.LinkedList;

public class MyOwnQueue {

	private LinkedList<PersonOnATMLine> queue;
	
	public MyOwnQueue() {
		this.queue = new LinkedList<>();
	}
	
	void push(PersonOnATMLine person) {
		this.queue.addLast(person);
	}
	
	PersonOnATMLine pull() {
		return this.queue.removeFirst();
	}
}
