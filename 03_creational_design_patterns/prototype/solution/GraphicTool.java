package prototype.solution;

public class GraphicTool {
	
	private Graphic prototype;
	
	/*
	 * Creates a graphic tool by using a prototype
	 * @param prototype
	 */
	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}
	
	/*
	 * method internal to the framework
	 * @return
	 */
	protected Graphic createGraphic() {
		return prototype.clone();
	}
	
	/*
	 * prototype setter
	 */
	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}

}
