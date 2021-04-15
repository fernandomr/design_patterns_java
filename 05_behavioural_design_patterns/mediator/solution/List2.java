package mediator.solution;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	private List<String> items = new ArrayList<String>();
	
	private ScreenDirector screenDirector;
	
	public void selectItem(int itemNumber) {
		String item = items.get(itemNumber);
		if (this.screenDirector != null) {
			this.screenDirector.itemSelected(item);
		}
		
	}
	
	public List<String> getItems() {
		return items;
	}
	
	public void setScreenDirector(ScreenDirector screenDirector) {
		this.screenDirector = screenDirector;
	}
	
	
}
