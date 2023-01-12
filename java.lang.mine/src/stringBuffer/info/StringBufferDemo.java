package stringBuffer.info;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer b = new StringBuffer();
		System.out.println(b.capacity());  // 16
		b.append("12345678901234563"); // new capacity =  (current capacity + 1) * 2
		System.out.println(b.capacity());  // 34
		b.append("12345678901234563876");
		System.out.println(b.capacity());  
		
		//-------------------------------------------------
		
		StringBuffer br = new StringBuffer(100);
		System.out.println(br.capacity());
		
		//--------------------------------
		
		StringBuffer br1= new StringBuffer("hello"); // "hello".length +  16 = 21
		System.out.println(br1.capacity());
		
		// methods
		System.out.println(br1.length()); // 5 (0-4)
		System.out.println(br1.capacity());  // 21
		System.out.println(br1.charAt(0)); // 'h'
		
		br1.setCharAt(0, 'H'); // Hello // replace 
		System.out.println(br1);
		
		br1.insert(2, "xyz");
		System.out.println(br1);
		
		// delete  // delete character
		// reverse  // reverse string
		// setLength // 
		
		StringBuffer br2 = new StringBuffer("Hi hello");
		br2.setLength(2);
		System.out.println(br2);
		
		// what is diff. between StringBuffer & StringBuilder ??
		
		StringBuilder sb = new StringBuilder();
	    // all methods are same
		
		// method chaining
		
		StringBuffer br5= new StringBuffer("Hello How are you ?");
		br5  = br5.append(" nice").insert(6, "rakesh! ").append(" good");
		System.out.println(br5);
		
		// wrapper classes
		

		
	}
}
