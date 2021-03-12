package strategy02;

public class Client {

	public static void main(String[] args) {
		
		Chess chess = new Chess();
		
		System.out.println("Chess next step " + chess.calculateNextStep());
		
		chess.setDifficulty(Difficulty.HARD);
		
		System.out.println("Chess next step " + chess.calculateNextStep());
		
		/*
		 * The problem here is that the algorithm is encapsulated in the Chess class
		 * And when needs to calculate the next step the code has to go through
		 * the different types of difficulty
		 */

	}

}
