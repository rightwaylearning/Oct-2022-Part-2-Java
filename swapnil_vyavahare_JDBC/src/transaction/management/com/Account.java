package transaction.management.com;

public class Account {
	
	private Integer accountNumber;
	private String acoountholdername;
	private Double balance;
	
	public Account(){}

	public Account(Integer accountNumber, String acoountholdername, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.acoountholdername = acoountholdername;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAcoountholdername() {
		return acoountholdername;
	}

	public void setAcoountholdername(String acoountholdername) {
		this.acoountholdername = acoountholdername;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", acoountholdername=" + acoountholdername + ", balance="
				+ balance + "]";
	};
	
	

}
