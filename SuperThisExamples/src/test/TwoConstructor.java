package test;

class Y{
	
	Y(int a){
		System.out.println("Y with 1 param");
	}
	
	Y(int a, int b){
		System.out.println("Y with 2 param");
	}
	
}

class X extends Y{
	
	X(){
		super(0);
	}
}


public class TwoConstructor {

	public static void main(String[] args) {
		
	}
}
