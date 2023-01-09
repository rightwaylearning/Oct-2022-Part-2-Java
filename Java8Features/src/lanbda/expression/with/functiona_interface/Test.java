package lanbda.expression.with.functiona_interface;

interface Cal{
	void add(int a, int b);
}

class CalImpl implements Cal{

	@Override
	public void add(int a, int b) {
       System.out.println(a + b);		
	}
	
}

public class Test {
   public static void main(String[] args) {
	
	   Cal c = new CalImpl();
	   c.add(10,20);
  }
}
