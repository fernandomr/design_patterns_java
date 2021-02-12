package prototype.solution;

public class Video extends Graphic {
	
	private String url;
	
	@Override
	public Graphic clone() {
		// create new clone
		Video clone = new Video();
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
