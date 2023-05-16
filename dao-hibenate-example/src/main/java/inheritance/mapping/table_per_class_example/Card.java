package inheritance.mapping.table_per_class_example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "bycard")
public class Card extends Payment{

	@Column(name="card_number")
	private Integer cardNumber;
	
	@Column(name="card_type")
	private String cardType;

	public Card() {
	}

	public Card(Integer cardNumber, String cardType,Integer txId, Double amount, String txDate) {
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
