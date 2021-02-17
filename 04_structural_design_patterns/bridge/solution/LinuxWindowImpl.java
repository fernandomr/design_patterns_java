package bridge.solution;

public class LinuxWindowImpl extends WindowImpl {

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.println("Drawing on linux x: " + x + ", y: " + y + ", width: " + width + ", height: " + height);
	}
}
