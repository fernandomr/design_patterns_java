package strategy02;

public class Chess {

	private Difficulty difficulty = Difficulty.EASY;
	
	public int calculateNextStep() {
		
		if (this.difficulty == Difficulty.EASY) {
			return 1;
		}
		
		if (this.difficulty == Difficulty.MEDIUM) {
			return 2;
		}
		
		if (this.difficulty == Difficulty.HARD) {
			return 3;
		}
		return 0;
		
	}
	
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
}
