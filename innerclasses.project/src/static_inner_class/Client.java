package static_inner_class;

public class Client {

	public static void main(String[] args) {
		
		YesBank.Account acc = new YesBank.Account();
		Double bal = acc.getMyBalance();
		System.out.println(bal);
			
	}
}
