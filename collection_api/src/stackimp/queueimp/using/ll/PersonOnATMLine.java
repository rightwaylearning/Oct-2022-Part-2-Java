package stackimp.queueimp.using.ll;

public class PersonOnATMLine {

	private String name;
	private Double withdrawAmt;
	private String cardType;
	
	public PersonOnATMLine() {}

	public PersonOnATMLine(String name, Double withdrawAmt, String cardType) {
		super();
		this.name = name;
		this.withdrawAmt = withdrawAmt;
		this.cardType = cardType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWithdrawAmt() {
		return withdrawAmt;
	}

	public void setWithdrawAmt(Double withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "PersonOnATMLine [name=" + name + ", withdrawAmt=" + withdrawAmt + ", cardType=" + cardType + "]";
	}
	
	
}
