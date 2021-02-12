package prototype.solution;

public abstract class Graphic {
	
	/*
	 * creates a clone if this graphic object
	 */
	public abstract Graphic clone();
	
	/*
	 * this function serves to show that the state is also preserved
	 */
	public abstract String getUrl();

}
