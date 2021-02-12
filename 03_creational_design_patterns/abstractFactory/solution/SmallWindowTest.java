package abstractFactory.solution;

public class SmallWindowTest implements WindowTest {
	
	protected int width = 0;

	@Override
	public void buildScreen() {
		System.out.println("Building small screen with: " + width);
	}

}
