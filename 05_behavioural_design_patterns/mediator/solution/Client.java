package mediator.solution;

public class Client {

	public static void main(String[] args) {
		
		List2 list2 = new List2();
		InputText text = new InputText();
		MainScreen screenDirector = new MainScreen();
		
		screenDirector.setInputText(text);
		list2.setScreenDirector(screenDirector);
		
		list2.getItems().add("Data item one");
		list2.getItems().add("Data item two");
		list2.getItems().add("Data item three");
		
		list2.selectItem(1);
		
		System.out.println("Selected value is: " + text.getValue());

	}

}
