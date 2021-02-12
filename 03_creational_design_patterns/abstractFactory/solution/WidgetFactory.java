package abstractFactory.solution;

public interface WidgetFactory {
	
	/*
	 * This factory groups all related creational methods fro the framework
	 * 
	 */
	
	ScrollBar createScrollBar();
	
	Window createWindow();

}
