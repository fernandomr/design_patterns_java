package strategy02.solution;

public class Client {

	public static void main(String[] args) {
		
		Chess chess = new Chess();
		
		System.out.println("Chess next step " + chess.calculateNextStep());
		
		chess.setAlgorithm(new HardChessAlgorithm());
		
		System.out.println("Chess next step " + chess.calculateNextStep());
		
		

	}

}
