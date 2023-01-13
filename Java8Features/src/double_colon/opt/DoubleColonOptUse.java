package double_colon.opt;

public class DoubleColonOptUse {

	public static void main(String[] args) {
		
		//Cal c = x -> System.out.println(x*x); // our own logic
		
		//Cal c= new MathsOpeartion() :: instanceMethod; // existing instance method logic reuse
		
		///Cal c= MathsOpeartion :: staticMethod; // existing static method logic reuse
		
		Cal c= MathsOpeartion :: new;  // use existing constructor logic
		
		c.squre(100);
		
	}
}
