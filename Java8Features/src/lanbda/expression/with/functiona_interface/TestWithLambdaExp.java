package lanbda.expression.with.functiona_interface;

interface Calculator{
	void add(int a, int b);
}

interface B{
	int countCharcater(String str);
}

public class TestWithLambdaExp {

	public static void main(String[] args) {
		
		Calculator c = (a,b)->System.out.println(a+b);
		c.add(10, 20);
		
		
		//B b = (String str)->{return str.length();};
		
		B b = str->str.length();
		int count = b.countCharcater("Hi hello");
		System.out.println(count);
		
	}
}
