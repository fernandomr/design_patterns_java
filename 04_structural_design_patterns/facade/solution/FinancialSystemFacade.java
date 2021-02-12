package facade.solution;

public class FinancialSystemFacade {

	private BillingSystem billingSystem;
	
	private InvoiceCustomerSystem invoiceCustomerSystem;
	
	public void createInvoice(int amount) {
		billingSystem = new BillingSystem();
		invoiceCustomerSystem = new InvoiceCustomerSystem();
		
		Bill bill = billingSystem.createBill(amount);
		invoiceCustomerSystem.createInvoiceForBill(bill);
	}

	public void setBillingSystem(BillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}

	public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
		this.invoiceCustomerSystem = invoiceCustomerSystem;
	}
	
}
