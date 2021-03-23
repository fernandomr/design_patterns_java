package chain_solution07;

public class CustomerInfoCheckoutHandler extends CheckoutHandler{

	@Override
	public void handleCheckout() {
		System.out.println("Handling customer info on checkout");
		
		if (this.nextHandler != null) {
			this.nextHandler.handleCheckout();
		}
	}
}
