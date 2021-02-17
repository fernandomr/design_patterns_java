package bridge.solution;

public class DirectXWindowImpl extends WindowImpl {
	
	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.println("Drawing on directX, x: " + x + ", y: " + y + ", width: " + width + ", height: " + height);
	}

}
