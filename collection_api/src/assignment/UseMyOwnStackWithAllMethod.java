package assignment;

public class UseMyOwnStackWithAllMethod {

	public static void main(String[] args) {
		
		MyOwnStackWithAllMethod stack = new MyOwnStackWithAllMethod();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.serach("B"));
		
		
	}
}
