package template09.solution;

public abstract class LoanCalculationAlgorithm {
	
	/*
	 * the calculateLoan is the function that happens again and again and
	 * the parts that compose it that change, like getBaseAmount() can be changed depending on
	 * parameters or anything else in the implementation classes, like CheapLoanCalculation.
	 * These functions are generified here, and the extension points must be dealt with in
	 * the implementation classes
	 */
	
	public int calculateLoan() {
		return (int) ( (getBaseAmount() * getInterest()) - calculateDiscount() );
	}
	
	// the abstract functions below are the hooks that this base class provides
	abstract int getBaseAmount();
	
	abstract double getInterest();
	
	abstract int calculateDiscount();

}
