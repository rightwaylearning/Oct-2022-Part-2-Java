package inheritance.mapping.table_per_sub_class_example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card11")
@PrimaryKeyJoinColumn(name="fk_txid")
public class Card11 extends Payment11{

	@Column(name="card_number")
	private Integer cardNumber;
	
	@Column(name="card_type")
	private String cardType;

	public Card11() {
	}

	public Card11(Integer cardNumber, String cardType,Integer txId, Double amount, String txDate) {
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
