package example.generic;

import java.util.ArrayList;

import javax.net.ssl.ExtendedSSLSession;

class Test<T extends Number>{
	 T t;
	T getData(T t) {
		this.t = t;
		return  this.t;
	}
}


public class BoundedTypeExample {
	
	public static void main(String[] args) {
		
		
		Test<Integer> t1= new Test();
		System.out.println(t1.getData(10));

		Test<Float> t2= new Test();
		System.out.println(t2.getData(10.0F));
		
	}

}
