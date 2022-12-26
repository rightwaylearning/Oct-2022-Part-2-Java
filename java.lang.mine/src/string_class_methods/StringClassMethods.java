package string_class_methods;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String str = "Right Way learning pvt ltd.";

		String[] arr = {"abc", "pqr","lmn"};
		
		System.out.println(str.length()); // string class have length() method
		System.out.println(arr.length); // array class have length property
		
		// --------------------------------------------------
		
		String str1 = "Right Way learning pvt ltd.";
		String[] arr1 = {"abc", "pqr","lmn"};
		
		char ch = str1.charAt(6);
		System.out.println(ch);  // W
		
		String s = arr1[2];
		System.out.println(s); //"lmn"
		
	//	System.out.println(str1.charAt(30));
	//	System.out.println(arr1[4]);
		
		//--------------------------------------------------
		
		String str5 = "Hi";
		String str6 = str5.concat(" hello good morning india...");
		System.out.println(str6);
		
		//  +  >>> to add 2 number if both side numbers are there
		//  +  >> to concat if atleast one parameter is string
		//---------------------------------------------------------
		
		String str9 = new String("hello");
		String str10 = "hello";
		boolean b = str9.equals(str10);
		System.out.println(b);             // true
		System.out.println(str9 == str10); // false
       // ---------------------------------------------		
		
		String s3 = "rightwaylearning";
		String s4 = "RIGHTWAYLEARNING";
		
		System.out.println(s3.equals(s4)); // false
		System.out.println(s3.equalsIgnoreCase(s4)); // true
		
	}
}
