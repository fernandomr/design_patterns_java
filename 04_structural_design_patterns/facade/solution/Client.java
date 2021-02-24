package facade.solution;

public class Client {
	
	public static void main(String[] args) {
		
//		BillingSystem billingSystem = new BillingSystem();
//		InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();
		
		FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
//		financialSystemFacade.setBillingSystem(billingSystem);
//		financialSystemFacade.setInvoiceCustomerSystem(invoiceCustomerSystem);
		
		/*
		 * I commented the lines above and moved then inside the financialSystemFacade
		 * so this code only calls one line
		 */
		
		
		financialSystemFacade.createInvoice(1200);
		
		// Tests:
		ProspectSystemFacade prospectFacade = new ProspectSystemFacade();
		prospectFacade.createProspect("Mr. John Doe", "john@doe.com", "John Doe");
		
	}

}
