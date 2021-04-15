package mediator;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	private List<String> items = new ArrayList<String>();
	
	private InputText inputText;
	
	public void selectItem(int itemNumber) {
		String item = items.get(itemNumber);
		this.inputText.setValue(item);
	}
	
	public List<String> getItems() {
		return items;
	}
	
	public void setInputText(InputText inputText) {
		this.inputText = inputText;
	}
	
	
}
