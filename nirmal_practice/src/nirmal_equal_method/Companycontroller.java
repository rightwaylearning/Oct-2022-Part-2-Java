package nirmal_equal_method;

public class Companycontroller {
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.setCompanyName("Infosys");
		c.setCompanyRank(1);
		
		Company c1 = new Company();
		c1.setCompanyName("Infosys");
		c1.setCompanyRank(1);
		
		
		
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
	}
}
