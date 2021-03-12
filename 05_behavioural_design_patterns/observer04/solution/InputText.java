package observer04.solution;

public class InputText implements Observer {
	
	public void setText(String text) {
		System.out.println("InputText set text: " + text);
	}
	
	@Override
	public void update() {
		this.setText("button has been clicked");
	}

}
