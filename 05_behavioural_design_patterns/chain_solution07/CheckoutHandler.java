package chain_solution07;

public abstract class CheckoutHandler {
	
	protected CheckoutHandler nextHandler;
	
	public abstract void handleCheckout();
	
	public void setNextHandler(CheckoutHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
