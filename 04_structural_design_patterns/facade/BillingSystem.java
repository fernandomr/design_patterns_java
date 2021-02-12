package facade;

public class BillingSystem {
	
	public Bill createBill(int amount) {
		// let's assume some advanced loginc happens here
		return new Bill(amount);
	}

}
