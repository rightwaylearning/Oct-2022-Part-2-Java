package example.generic;

class Saving{}
class GoldLoanAcc{}
class HomeLoanacc{};


public class Controller {

	public static void main(String[] args) {
		
		
		Account<Saving> acc = new Account<Saving>(new Saving());
		acc.showDataType();
		
		Account<GoldLoanAcc> acc1 = new Account<GoldLoanAcc>(new GoldLoanAcc());
		acc1.showDataType();
		
		Account<HomeLoanacc> acc2 = new Account<HomeLoanacc>(new HomeLoanacc());
		acc2.showDataType();
		
		
	}
}
