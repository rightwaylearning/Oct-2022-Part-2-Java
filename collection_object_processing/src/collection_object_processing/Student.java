package collection_object_processing;

public class Student {

	private Integer rollNumber;
	private String name;
	private Double percentage;

	public Student() {
	}

	public Student(Integer rollNumber, String name, Double percentage) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
