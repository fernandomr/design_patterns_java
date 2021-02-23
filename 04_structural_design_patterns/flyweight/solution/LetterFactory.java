package flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
	
	private Map<String, Letter> letterMap = new HashMap<String, Letter>();

	public Letter createLetter(String key) {
		
		Letter l = this.letterMap.get(key);
		
		if (l == null) {
			l = new Letter(key);
			letterMap.put(key, l);
		}
		
		return letterMap.get(key);
	}
}
