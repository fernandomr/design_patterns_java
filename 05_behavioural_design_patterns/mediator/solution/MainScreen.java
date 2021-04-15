package mediator.solution;

public class MainScreen implements ScreenDirector {
	
	private InputText inputText;

	@Override
	public void itemSelected(String item) {
		this.inputText.setValue(item);
	}
	
	public void setInputText(InputText inputText) {
		this.inputText = inputText;
	}
}
