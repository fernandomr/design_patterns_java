package bridge;

public class IconWindow implements Window{
	
	@Override
	public void draw(int x, int y, int width, int height, String color) {
		//
	}
	
	public void drawIcon() {
		draw(0, 0, 10, 10, "White");
		draw(0, 10, 10, 10, "Blue");
	}
}
