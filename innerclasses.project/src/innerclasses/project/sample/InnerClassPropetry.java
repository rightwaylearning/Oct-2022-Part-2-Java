package innerclasses.project.sample;

class Bank{
	Integer balance = 100;
	
	class Account{
		Integer balance = 1000;
		
		void m1() {
			Integer balance = 10000;
			System.out.println(balance);// searching sequence >> local >> my own class >> outer class
		    System.out.println(this.balance);
		    System.out.println(Bank.this.balance);
		}
		
	}
	
	
}


public class InnerClassPropetry {

	public static void main(String[] args) {
		
		new Bank().new Account().m1();
	}
}
