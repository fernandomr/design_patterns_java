package facade.solution;

public class BillingSystem {
	
	public Bill createBill(int amount) {
		// let's assume some advanced logic happens here
		return new Bill(amount);
	}

}
