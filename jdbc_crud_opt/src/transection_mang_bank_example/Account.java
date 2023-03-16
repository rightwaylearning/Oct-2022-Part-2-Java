package transection_mang_bank_example;

public class Account {

	private Integer accounTnumber;
	private String accountHolderName;
	private Double balance;
	
	public Account() {}

	public Account(Integer accounTnumber, String accountHolderName, Double balance) {
		super();
		this.accounTnumber = accounTnumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Integer getAccounTnumber() {
		return accounTnumber;
	}

	public void setAccounTnumber(Integer accounTnumber) {
		this.accounTnumber = accounTnumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accounTnumber=" + accounTnumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
		
}
