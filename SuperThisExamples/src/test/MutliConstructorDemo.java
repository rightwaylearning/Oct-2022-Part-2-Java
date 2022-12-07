package test;
class PP{
	PP(){
		System.out.println("parent zero arg constructor");
	}
	PP(int a){
		System.out.println("parent one arg constructor");
	}
}
class CC extends PP{
	CC(){
		super(10);
		System.out.println("child zero arg constructor");
	}
	CC(int a){
		super();
		System.out.println("child one arg constructor");
	}
}
public class MutliConstructorDemo {
	public static void main(String[] args) {
		//CC c = new CC();
		CC c1 = new CC(20);
	}
}


