package facade;

public class Client {
	
	public static void main(String[] args) {
		
		BillingSystem billingSystem = new BillingSystem();
		InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();
		
		Bill bill = billingSystem.createBill(1000);
		invoiceCustomerSystem.createInvoiceForBill(bill);
		
		/*
		 * The issue here is that to create a invoice first you have to call billing system
		 * to create a bill and then call the invoice system.
		 * 
		 * More complex system can demand you to call 10 different systems in order to
		 * generate an invoice, for example.
		 */
		
	}

}
