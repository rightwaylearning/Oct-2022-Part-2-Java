package assignment;

import java.util.LinkedList;

public class MyOwnStackWithAllMethod {

	private LinkedList<String> stack;
	
	public MyOwnStackWithAllMethod() {
		this.stack = new LinkedList<>();
	}
	
	public Boolean push(String obj) {
		stack.addLast(obj);
		return true;
	}
	
	public String pop() {
		return stack.removeLast();
	}
	
	public String peek() {
		return stack.getLast();
	}
	
	public Boolean isEmpty() {
		if(stack.size() == 0) {
			return true;
		}
		
		return false;
	}
	
	public int serach(String obj) {
		return  stack.indexOf(obj);
	}
}
