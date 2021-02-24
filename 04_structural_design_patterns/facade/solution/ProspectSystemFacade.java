package facade.solution;

public class ProspectSystemFacade {
	
	private LeadSystem leadSystem;
	private ProspectSystem prospectSystem;
	
	public void createProspect(String name, String email, String companyName) {
		
		leadSystem = new LeadSystem();
		prospectSystem = new ProspectSystem();
		
		Lead l = leadSystem.createLead(name, email, companyName);
		prospectSystem.convertLeadToProspect(l);
		
		leadSystem.printLeadDetail();
		prospectSystem.printProspect();
	}

}
