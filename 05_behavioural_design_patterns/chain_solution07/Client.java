package chain_solution07;

public class Client {

	public static void main(String[] args) {
		
		// in client the handlers will be chained together
		
		PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
		CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();
		
		paymentCheckoutHandler.setNextHandler(customerInfoCheckoutHandler);
		
		paymentCheckoutHandler.handleCheckout();

	}

}
