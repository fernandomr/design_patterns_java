package template09.solution;

public class Client {

	public static void main(String[] args) {
		
		LoanCalculationAlgorithm algorithm = new ExpensiveLoanCalculation();
		System.out.println(algorithm.calculateLoan());
		
		algorithm = new CheapLoanCalculation();
		System.out.println(algorithm.calculateLoan());

	}

}
