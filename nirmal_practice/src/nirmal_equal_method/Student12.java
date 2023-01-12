package nirmal_equal_method;

public class Student12 {

	private String Name;
	private Integer RollNumber;

	@Override
	public int hashCode() {
		return this.Name.hashCode() + this.RollNumber.hashCode();
//		we override hashcode method due to add a (object)data in hashtable that wys we can ovveride this method. 
	}

	@Override
	public boolean equals(Object obj) {
                                                                                                                                                 
		Student12 s = (Student12) obj;

		if (this.Name.equals(s.Name) && this.RollNumber.equals(s.RollNumber)) {

			return true;
		}
		return false;

//		override the equal method because of checking the two obj data or obj is same or not so thats why we can ovvride equals method
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}

}
