package inheritance.mapping.table_per_concrete_class_example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card1")
public class Card1 extends Payment1{

	@Column(name="card_number")
	private Integer cardNumber;
	
	@Column(name="card_type")
	private String cardType;

	public Card1() {
	}

	public Card1(Integer cardNumber, String cardType,Integer txId, Double amount, String txDate) {
		super(txId,amount,txDate);
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
