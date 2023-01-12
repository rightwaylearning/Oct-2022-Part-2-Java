package wrapperclasses.example;

public class SampleExamples {

	public static void main(String[] args) {
		
		// way to create object of wrapper classes.
		
		int i = 10;
		
		Integer ii = i;   // Integer ii = Integer.valueOf(int i);
		Integer iii = 10; // Integer ii = Integer.valueOf(int i);
		
		Integer i1= Integer.valueOf(20);
		
		//--------------------------------------------
		
		Integer i2 = new Integer(10); //   public Integer(int i){}
		
		//-----------------------------------------------------------------------------
		
		// constructor of wrapper classes classes
		
		// 1]
		  /*
		   
		   public Integer(int i){
		     }
		   */
		 
		 Integer j = new Integer(10); 
		 
		 /*
		  *  public Integer(String str){
		  *  
		  *  }
		  */
		 
		 Integer j1 = new Integer("10");
		
		 // Note :- almost every wrapper class have above 2 constructor
		//-----------------------------------------
		 
		 Float f1 = new Float(10.10F);
		 Float f2 = new Float("10.10F");
		 
		 Float f3 = new Float(10.10);
		 Float f4 = new Float("10.10");
		 
	   // Character have only 1  constructor 
		 
		 // public Character(char ch){}
		 Character ch = new Character('A');
		 
	  // Boolean class	have 2 constructor 
		 
		 // public Boolean(boolean b){}
		 // public Boolean(String b){}
		 
		 Boolean b = new Boolean(false);
		 
		 Boolean b1 = new Boolean("sachin"); // false
		 Boolean b2 = new Boolean("TRUE");  // true
		 Boolean b3 = new Boolean("tRuE"); // true
		 Boolean b4 = new Boolean("false"); // false
		 Boolean b5 = new Boolean("fal"); // false
		 Boolean b6 = new Boolean("sachin"); // false
		 
		 System.out.println(b.equals(b6)); // true
		
		 //---------------------------------------------------
		 // ValueOf()  >> here valueOf() method converting primitive data OR primitive data string into wrapper class object
		 
		 // 1] it is static method
		 //  public Integer valueOf(int i){}
		 // public Integer valueOf(String s){}
		 
		 Integer k =Integer.valueOf(10);
		 Integer k1=Integer.valueOf("10");
		 
		 Character ch3 = Character.valueOf('A');
		 
		 // XXXValue() >> instance method >> wrapper >>>> into priitive
		 
		 Integer oo = Integer.valueOf(10);
		 
		 int p1 = oo.intValue();
		 
		 Character ch4 = Character.valueOf('A');
		 
		 char cc= ch4.charValue();
		 
		 //===========================================================================
		 
		 
	}
}
