package langauge.info.pack;

class PP{
	int a;
	int b;
	
	public PP(int a,int b) {
		this.a =a;
		this.b =b;
	}

	@Override
	public String toString() {
		return "PP [a=" + a + ", b=" + b + "]";
	}
	
}
public class ToStringDemo {
public static void main(String[] args) {
		
		String s = new String("test");
		PP p = new PP(10,20);
		
		System.out.println(s.toString());
		System.out.println(p.toString());
		
	}
}

