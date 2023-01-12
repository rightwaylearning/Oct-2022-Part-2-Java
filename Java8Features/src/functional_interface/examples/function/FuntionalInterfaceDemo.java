package functional_interface.examples.function;

import java.util.function.Function;

/*
 *    interface Function<String,Integer>{
 *       Integer apply(String s);
 *    }
 * 
 */


public class FuntionalInterfaceDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("sachin")); // 6
		System.out.println(f.apply("Hi"));// 2
	
	}
}

