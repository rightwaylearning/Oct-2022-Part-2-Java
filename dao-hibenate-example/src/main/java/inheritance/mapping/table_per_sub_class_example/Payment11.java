package inheritance.mapping.table_per_sub_class_example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "payment11")
@Inheritance(strategy = InheritanceType.JOINED)
abstract public class Payment11 {
	@Id
	@Column(name="tx_id")
	private Integer txId;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="tx_date")
	private String txDate;

	public Payment11() {
	}

	public Payment11(Integer txId, Double amount, String txDate) {
		super();
		this.txId = txId;
		this.amount = amount;
		this.txDate = txDate;
	}

	public Integer getTxId() {
		return txId;
	}

	public void setTxId(Integer txId) {
		this.txId = txId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTxDate() {
		return txDate;
	}

	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}

}
