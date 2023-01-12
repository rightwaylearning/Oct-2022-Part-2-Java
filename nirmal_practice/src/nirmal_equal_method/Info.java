package nirmal_equal_method;

public class Info {

	private String Name = "nirmal";
	private Integer number = 8018762;

	@Override
	public int hashCode() {
		return this.Name.hashCode() + this.number.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.Name.equals(Name) && this.number.equals(number)) {
			return true;
		}
		return false;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
