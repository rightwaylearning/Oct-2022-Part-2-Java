package test;

class P{
	public P(String msg){
		System.out.println(msg);
	}
}

class C extends P{
    
	 Integer i;
     Integer j;
     
	public C(String msg, Integer i, Integer j) {
		super(msg);
		this.i = i;
		this.j = j;
	}


}

// Note :- if in parent class there is parameterize  constructor then , we have to take child class constructor & call super with param




public class SuperWithparam {

	public static void main(String[] args) {
		
		C c= new C("data",10,20);
	}
}
