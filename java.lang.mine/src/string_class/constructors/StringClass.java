package string_class.constructors;

public class StringClass {
	
	public static void main(String[] args) {
		
		// zero-arg constructor
		/* 1]
		 * public String(){
		 * 
		 * }
		 */
		String s1= new String();
		
		/*
		 * 2]  public String(String literal){
		 * 
		 *     }
		 */
		String st1 = new String("data");
		
		/*
		 * 3]
		 * 
		 * consider I have StringBuffer object I want to convert into
		 *  String object
		 *  
		 *  public String(StringBuffer abcd){
		 *    
		 *  }
		 * 
		 */
		 StringBuffer br= new StringBuffer("KGF chapter-2");
		
		 String str2 = new String(br);
		
		 /*
		  * 4]
		  * 
		  * 
		  */
		 
		 char ch[] = {'s','a','c','h','i','n'};
		 
		 String str3 = new String(ch);
		 
		 
		/*
		 * public String(byte[] arr){
		 * 
		 * }
		 * 
		 */
		 
		 byte b[] = {97,98,99};
		 
		 String str4 = new String(b);
		 System.out.println(str4);
	}

}
