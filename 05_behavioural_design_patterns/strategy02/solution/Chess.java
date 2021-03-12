package strategy02.solution;

public class Chess {

	private ChessAlgorithm algorithm = new EasyChessAlgorithm();	// create the easy by default
	
	public int calculateNextStep() {
		// just do an object delegation
		return this.algorithm.calculateNextStep();
	}
	
	public void setAlgorithm(ChessAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
}
