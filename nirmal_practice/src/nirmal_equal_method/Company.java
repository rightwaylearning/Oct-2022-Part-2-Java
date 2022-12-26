package nirmal_equal_method;

public class Company {

	private String CompanyName;
	private Integer CompanyRank;

	@Override
	public int hashCode() {
		return this.CompanyName.hashCode() + this.CompanyRank.hashCode();

	}
@Override
  public boolean equals(Object obj) {
	Company c = (Company)obj;
	
	if(this.CompanyName.equals(CompanyName) && this.CompanyRank.equals(CompanyRank)) {
		return true;
	}
	return false;
}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getCompanyRank() {
		return CompanyRank;
	}

	public void setCompanyRank(int companyRank) {
		CompanyRank = companyRank;
	}

}
