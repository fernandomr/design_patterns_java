package decorator.solution;

public class ScrollbarWindowDecorator extends WindowDecorator {

	public ScrollbarWindowDecorator(Window wind) {
		super(wind);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing scrollbar");
		window.draw();
	}
	
}
