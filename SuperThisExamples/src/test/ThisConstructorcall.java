package test;

class KK{
	
	KK(){
		this(10);
		System.out.println("0");
	}
	
	KK(int a){
		System.out.println("1");
	}
	
	KK(int a, int b){
		this(10);
	//	super();
		System.out.println("2");
	}
}
public class ThisConstructorcall {

	public static void main(String[] args) {
		
		KK k= new KK();
		KK k1= new KK(10);
		KK k2= new KK(20,10);
	}
}
