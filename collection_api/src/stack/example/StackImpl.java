package stack.example;

import java.util.Stack;

public class StackImpl {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		System.out.println(stack.capacity());
		stack.push("FIRST");
		stack.push("SECOND");
		stack.push("THIRD");
		stack.push("FOUR");
		stack.push("FIVE");
		
		System.out.println(stack);
		
		String obj = stack.pop();
		System.out.println(obj);
		
		System.out.println(stack);
		
		String obj1 = stack.peek();
		System.out.println(obj1);
		System.out.println(stack);
		
		int i = stack.search("SECOND");
		System.out.println(i);
		
		System.out.println(stack.search("TWO")); // -1
		
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
	}

}
