package abstractFactory.solution;


public class Client {
	
	public static void initializeGUI(WidgetFactory factory) {
		/*
		 * This function delegates to the function below the creation
		 */
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}
	
	public static void initializeGUI(ScrollBar bar, Window window) {
		System.out.println("Do initialization logic here with " + bar.getClass().getName() 
				+ " and " + window.getClass().getName() );
	}
	
	// test functions
	public static void initializeTests(WindowTestFactory factory) {
		initializeTests(factory.createWindow());
	}
	
	public static void initializeTests(WindowTest window) {
		window.buildScreen();
	}

	public static void main(String[] args) {
		
		/*
		 * Now with two lines of code we have the initialization of related objects
		 * The creation logic is centralized in the factories 
		 */
		WidgetFactory factory = new PinkThemeWidgetFactory();
		initializeGUI(factory);
		
		factory = new YellowThemeWidgetFactory();
		initializeGUI(factory);
		
		WindowTestFactory windTestFact = new SmallWindowTestFactory();
		initializeTests(windTestFact);
		
	}

}
