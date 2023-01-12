package nirmal_equal_method;

public class Studentcontroller {

	public static void main(String[] args) {

		Student12 s = new Student12();
		s.setName("nirmal");
		s.setRollNumber(12);

		Student12 s1 = new Student12();
		s1.setName("rajput");
		s1.setRollNumber(13);

		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
