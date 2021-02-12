package singleton.solution;

public class Preferences {

	// holder of the single instance of singleton class
	private static Preferences instance = null;

	// No other class can instantiate a singleton
	protected Preferences() {};
	
	// test variable to see if its the same instance
	public String aTestMessage = "";

	/**
	Create a singleton instance
	Use syncronized to allow one instance when using multiple treads
	**/
	private synchronized static void createInstance(){
		if (instance == null){
			instance = new Preferences();
		}
	}

	/**
	Access method to get hold of singleton instance
	@return the one singleton instance
	**/
	public static Preferences getInstance(){
		if (instance == null){
			createInstance();
		}
		return instance;
	}

	public void helloSingleton(){
		System.out.println("There's no way of creating a new instance of the preferences class");
	}

}