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
		
         String st1 = new String("data");
         String st2 = "data";
         System.out.println(st1.hashCode() == st2.hashCode());
         System.out.println(st1 == st2);
         
         System.out.println("---------------------------------------");
         
         // subString
         
         String st3 = "Hi hello Good morning india"; //0-26 >> 27

         String str2 = st3.substring(9); // Good morning india

         String str3 = st3.substring(22); // india
         
         System.out.println(str2);
         System.out.println(str3);
         
        // System.out.println(st3.substring(29)); // Exception
         
         String str4 = st3.substring(9,20); 
         // 9 is strat index , 20-1 = 19 is last index
         System.out.println(str4);
         
         System.out.println(st3.substring(0,2));
         
         //  length() >> String vs length >> array class
         
         // replace 
         
         String st4 = "Hi hello Good morning";
         
         String st5 = st4.replace('o' , 'O');
         String st6 =  st4.replace('l', '1');
         System.out.println(st6);
         //----------------------------------------
         System.out.println("-------------------------");
         
         String sr = "Hi Hello good MOrning iNdia";
         String sr1 = sr.toUpperCase();
         String sr2 = sr.toLowerCase();
         System.out.println(sr1);
         System.out.println(sr2);
         String sr3 = sr1.toUpperCase();
         System.out.println(sr1 == sr3);
         
         // rule if after calling method there are no any change in object
         // so jvm is not creating new object, here we are refering exiting object that object
         // may be on heap or may be on SCP.
         
         
         String h = "   hi   hello   ";
         String h1 = h.trim();
         System.out.println(h1);
         
         //---------------------------------------
         
         // indexOf 
         
         String g = "Hi hello Good mroning india"; // 27
         System.out.println(g.indexOf('o')); // 7
         System.out.println(g.indexOf('z')); // -1
         System.out.println(g.lastIndexOf('o'));  // 16
         
         //  >> How to create custom class object is immutable ??
         
         
	}
}

