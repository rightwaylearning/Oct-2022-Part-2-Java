package treemap.demo;

public class Iteam{
	Integer itemId;
    String itemName;
    double pricePerItem;
    Integer qnty;
    Double totalPrice;
    
    public Iteam() {}

	public Iteam(Integer itemId, String itemName, double pricePerItem, Integer qnty) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.pricePerItem = pricePerItem;
		this.qnty = qnty;
		this.totalPrice = pricePerItem* qnty;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
		setTotalPrice();
	}

	public Integer getQnty() {
		return qnty;
	}

	public void setQnty(Integer qnty) {
		this.qnty = qnty;
		setTotalPrice();
	}
	
	private void setTotalPrice() {
		if(this.qnty != 0 && this.pricePerItem != 0.0) {
			this.totalPrice = this.qnty * this.pricePerItem;
		}
	}

	@Override
	public String toString() {
		return "Iteam [itemId=" + itemId + ", itemName=" + itemName + ", pricePerItem=" + pricePerItem + ", qnty="
				+ qnty + ", totalPrice=" + totalPrice + "]";
	}

	
}	