package prototype.solution;

public class Image extends Graphic{
	
	private String url;
	
	@Override
	public Graphic clone() {
		// create new clone
		Image clone = new Image();
		clone.setUrl(this.url);
		return clone;
	}
	
	public void setUrl(String pUrl) {
		this.url = pUrl;
	}

	@Override
	public String getUrl() {
		return this.url;
	}

}
