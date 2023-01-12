package equals.method;

class A{
	int x;
	int y;
	
	@Override
	public boolean equals(Object obj) { // Object obj = new A();
		A a2 = (A)obj;
		if(this.x == a2.x && this.y == a2.y) {
			return true;
		}
		return false;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		A a1= new A();
		a1.x =10; a1.y=20;
		
		A a2= new A();
		a2.x =10; a2.y=20;
		
		boolean r = a1.equals(a2); // internally a1==a2;
		
		System.out.println(r);
		
	}
}

// relation sheep  .equals() method & == operator 
// case 1]
 //  r1 == r2  >>> true then  r1.equals(r2)   >>>  true

// case 2]  r1 == r2 >> false  then r1.equals(r2)  >> so may be true or may false

//----------------------------------------------------------

// case 3] r1.equals(r2) >> true  then r1==r2 >> may be true or may false;

// case 4] r1.equals(r2) >> false then r1 == r2 >> 1000% false















