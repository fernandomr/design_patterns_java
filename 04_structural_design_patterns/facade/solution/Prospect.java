package facade.solution;

public class Prospect {

	private String name;
	private String email;
	private String companyName;
	
	private String companyRegisterNumber;
	private int chanceToConvert;
	
	public Prospect() {
	}
	
	public Prospect(Lead pLead, String regNumber, int chanceConversion) {
		this.name = pLead.getName();
		this.email = pLead.getEmail();
		this.companyName = pLead.getCompanyName();
		this.companyRegisterNumber = regNumber;
		this.chanceToConvert = chanceConversion;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyRegisterNumber() {
		return companyRegisterNumber;
	}
	
	public void setCompanyRegisterNumber(String companyRegisterNumber) {
		this.companyRegisterNumber = companyRegisterNumber;
	}
	
	public int getChanceToConvert() {
		return chanceToConvert;
	}
	
	public void setChanceToConvert(int chanceToConvert) {
		this.chanceToConvert = chanceToConvert;
	}
	
}
