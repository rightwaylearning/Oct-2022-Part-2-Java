package wrapperclasses.example;

public class UtilityMethods {

	public static void main(String[] args) {
		
		// 1] valueOf (static)
		
		Integer i = 10; // Integer i = Integer.valueOf(int i)
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10"); // Character class not contain this method
        
        //----------------------------------
        
        //2 ] xxxValue() instance method e.g intValue(), charValue()
        
            int i4 =  i.intValue();
            
            Character ch = new Character('E');
            char ch1 = ch.charValue();
            
       // 3]   parseXXX static , String object convert into primitive
            
            
            int p = Integer.parseInt("10"); 
            byte b = Byte.parseByte("100");
            
       // 4] toString(); toString() instance method to show wrapper class object into string formatt
            
            
           Integer j = new Integer(10);
           System.out.println(j.toString());   // 10
           
           String j_string = j.toString();
           
        // 5]  toString() // static method convert primitive into string object
           
           
           String s23 = Integer.toString(10);
           
           String ch5 = Character.toString('c');
            
	
	}
}
