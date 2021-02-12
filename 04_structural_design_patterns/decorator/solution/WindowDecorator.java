package decorator.solution;

public class WindowDecorator extends Window {

	protected Window window;
	
	public WindowDecorator(Window wind) {
		this.window = wind;
	}
	
	@Override
	public void draw() {
		window.draw();
	}
}
