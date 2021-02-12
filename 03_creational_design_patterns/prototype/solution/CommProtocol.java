package prototype.solution;

public abstract class CommProtocol {

	/*
	 * creates a clone if this object
	 */
	public abstract CommProtocol clone();
	
	/*
	 * this function serves to show that the state is also preserved
	 * after cloning
	 */
	public abstract String getServerUrl();
	
}
