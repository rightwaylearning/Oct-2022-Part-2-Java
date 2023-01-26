package sorting.comparable;

public class Student implements Comparable<Student> {

	private Integer rollNumber;
	private String fisrtName;
	private String lastName;

	public Student() {
	}

	public Student(Integer rollNumber, String fisrtName, String lastName) {
		super();
		this.rollNumber = rollNumber;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", fisrtName=" + fisrtName + ", lastName=" + lastName + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;

		if (this.getRollNumber().equals(s1.getRollNumber()) && this.getFisrtName().equals(s1.getFisrtName())
				&& this.getLastName().equals(s1.getLastName())) {
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(Student o) {

		Integer i1 = this.getRollNumber();
		Integer i2 = o.getRollNumber();

		// natural sorting order b // ascending
//		if (i1 < i2) {
//			return -1;
//		} else if (i1 > i2){
//			return +1;
//		}else {
//			if(this.equals(o)) {
//				return 0;
//			}else {
//				return -1;
//			}
//			
//		}
		// desc order
		
//		if (i1 < i2) {
//			return +1;
//		} else if (i1 > i2){
//			return -1;
//		}else {
//			if(this.equals(o)) {
//				return 0;
//			}else {
//				return -1;
//			}
//		}
		
		//int i = i1.compareTo(i2); // DNSO
		//int i = i2.compareTo(i1); // Desc order
		//int i = - i2.compareTo(i1); // DNSO
//		if(i == 0) {
//			if(this.equals(o)) {
//				return 0;
//			}else {
//				return -1;
//			}
//		}else {
//			return i;
//		}
		
//		// only remove duplicate objects & keep insertion order as it is
//		
//		int i = i1.compareTo(i2);
//		if(i == 0) {
//			if(this.equals(o)) {
//				return 0;
//			}
//			return 1;
//		}
//		return 1;
		// only remove duplicate objects & reverse  order 
		
				int i = i1.compareTo(i2);
				if(i == 0) {
					if(this.equals(o)) {
						return 0;
					}
					return -1;
				}
				return -1;
	}

}
