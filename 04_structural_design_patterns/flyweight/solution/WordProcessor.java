package flyweight.solution;

import java.util.List;
import java.util.ArrayList;

public class WordProcessor {
	
	private List<Letter> letters = new ArrayList<Letter>();
	
	public void addLetters(Letter letter) {
		this.letters.add(letter);
	}
	
	public void printLetters() {
		for (Letter letter : letters) {
			System.out.print(letter.getValue());
		}
	}

}
