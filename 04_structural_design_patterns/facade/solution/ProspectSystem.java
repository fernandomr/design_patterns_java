package facade.solution;

public class ProspectSystem {
	
	private Prospect p;
	
	public Prospect convertLeadToProspect(Lead lead) {
		this.p = new Prospect(lead, "", 5);
		return this.p;
	}
	
	public void printProspect() {
		System.out.println("Lead converted to prospect: " + this.p.getEmail());
	}

}
