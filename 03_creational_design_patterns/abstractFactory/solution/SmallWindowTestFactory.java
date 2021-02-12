package abstractFactory.solution;

public class SmallWindowTestFactory implements WindowTestFactory {

	@Override
	public WindowTest createWindow() {
		SmallWindowTest t = new SmallWindowTest();
		t.width = 250;
		return t;
	}

}
