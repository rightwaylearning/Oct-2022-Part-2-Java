package inheritance.mapping.table_per_class_example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "bycheque")
public class Cheque extends Payment{

	@Column(name="cheque_number")
	private Integer chequeNumber;

	@Column(name="cheque_type")
	private String chequeType;

	public Cheque() {
	}

	public Cheque(Integer chequeNumber, String chequeType,Integer txId, Double amount, String txDate) {
		super(txId,amount,txDate);
		this.chequeNumber = chequeNumber;
		this.chequeType = chequeType;
	}

	public Integer getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(Integer chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

}
