package decorator.solution;

public class IconWindowDecorator extends WindowDecorator {

	public IconWindowDecorator(Window wind) {
		super(wind);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing icon");
		window.draw();
	}
}
