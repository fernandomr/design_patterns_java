package prototype.solution;

public class CommProtocolTool {
	
	private CommProtocol prototype;
	
	// creates CommProtocol using a prototype
	public CommProtocolTool(CommProtocol prototype) {
		this.prototype = prototype;
	}
	
	// method internal to the framework
	protected CommProtocol createCommProtocol() {
		return prototype.clone();
	}
	
	
	public void setPrototype(CommProtocol prototype) {
		this.prototype = prototype;
	}

}
