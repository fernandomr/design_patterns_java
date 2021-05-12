package template09.solution;

public class CheapLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	int getBaseAmount() {
		return 10500;
	}

	@Override
	double getInterest() {
		return 3;
	}

	@Override
	int calculateDiscount() {
		return 5000;
	}
}