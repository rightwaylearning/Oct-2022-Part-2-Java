package wrapperclasses.example;

public class WrapperClassWithEqualityOpt {

	public static void main(String[] args) {
		
		Integer k = new Integer(127);
		Integer k1 = new Integer(127);
		System.out.println(k == k1); // false
		
		Integer i = 127;
		Integer j = 127;
		Integer n = Integer.valueOf(127);
		
		System.out.println(i==j); // true
		System.out.println(j==n); // true
		System.out.println(i==n); // true
		
		Integer g = 128;
		Integer h = 128;
		System.out.println(g==h); // false
		
		//---------------------------------------------------
		
		Float f = new Float(100.89f);
		Float f1 = 100.00F;
		Float f2 = 100.00F;
		System.out.println(f==f2);
		
		
		Character c = new Character('A');
		Character c1 = 'A';
		Character c2 = Character.valueOf('A');
		System.out.println(c ==c1); // false
		System.out.println(c1==c2); // true
		System.out.println(c==c2); // false
		
		//
		
		Integer i4 = new Integer(10);
		Integer i5 = i4;
		System.out.println(i4==i5); // true
		
		Integer i6 = 10;
		Integer i7 = 10;
		System.out.println(i6==i7); // true
		
		Integer i8 = 1000;
		Integer i9 = 1000;
		System.out.println(i8==i9); // false
		
		
		Boolean b = new Boolean(false);
		Boolean b1 = new Boolean("sachin");
		
		System.out.println(b==b1);  // false
		System.out.println(b.equals(b1)); // true
		
		Boolean s1= true;
		Boolean s2 = true;
		System.out.println(s1 ==s2); // true
		
		
		
	}
}
