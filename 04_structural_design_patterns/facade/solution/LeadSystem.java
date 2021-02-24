package facade.solution;

public class LeadSystem {
	
	private Lead l;
	
	public Lead createLead(String name, String email, String companyName) {
		l = new Lead(name, email, companyName);
		return l;
	}
	
	public void printLeadDetail() {
		System.out.println("Lead: " + l.getEmail());
	}

}
