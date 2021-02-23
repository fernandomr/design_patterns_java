package flyweight;

public class Client {

	public static void main(String[] args) {
		
		WordProcessor wordProcessor = new WordProcessor();
		
		String textToAdd = "Hello i'm a word processor";
		
		int length = textToAdd.length();
		
		for (int i = 0; i < length; i++) {
			String value = textToAdd.substring(i, i+1);
			wordProcessor.addLetters(new Letter(value));
		}
		
		wordProcessor.printLetters();

	}

}
