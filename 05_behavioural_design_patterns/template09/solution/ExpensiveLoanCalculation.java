package template09.solution;

public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	int getBaseAmount() {
		return 10500;
	}

	@Override
	double getInterest() {
		return 5.4;
	}

	@Override
	int calculateDiscount() {
		return 100;
	}

}
