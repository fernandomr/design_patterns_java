package chain_solution07;

public class PaymentCheckoutHandler extends CheckoutHandler{
	
	@Override
	public void handleCheckout() {
		System.out.println("Handling payment of the customer");
		
		if (this.nextHandler != null) {
			this.nextHandler.handleCheckout();
		}
	}

}
