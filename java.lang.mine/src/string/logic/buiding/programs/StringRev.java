package string.logic.buiding.programs;

public class StringRev {

	public static void main(String[] args) {
		
		String s = "lmnpqr";
		
		 StringBuffer rev = new StringBuffer();

		  for(int i = s.length()-1; i >= 0 ; i--)
		   {
		     char ch =  s.charAt(i);
		     rev = rev.append(ch);
		   }
		  
		  System.out.println(rev);
		  
	// ---------------------------------------------------------	  
		  String s1 = "Hi hello";
			 
		  StringBuffer br= new StringBuffer("Hi hello");
		  StringBuffer br1 = br.reverse();
		  System.out.println(br1);
		  
		  //------------------------------

			 //-----------------------------
			    // reverse string
//		  String st = "good morning";
//		  StringBuffer br3 = new StringBuffer(st);
//		  System.out.println(br3.reverse());
		  
		  // single line
		  System.out.println(new StringBuffer("good morning").reverse());
	}
	//  if most of the operation is updating string or editing string then never go with String class
	// object because string class object is immutable

	
	
	
}
