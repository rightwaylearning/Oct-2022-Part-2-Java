package nirmal_equal_method;

public class employeecontroller {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmployee("nirmal rajput");
		e.setRollNumber(12);

		Employee e1 = new Employee();
		e1.setEmployee("nirmal rajput");
		e1.setRollNumber(12);

		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		// when data is same of both object e and e1 that time equal method print true
		// other wise not.
		// data is diffrent that time print equal method false

//		System.out.println(e==e1);
	}

}
