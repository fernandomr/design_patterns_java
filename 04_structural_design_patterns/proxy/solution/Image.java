package proxy.solution;

public class Image {
	
	protected String url;
	
	public Image() {
	}
	
	public Image(String pStr) {
		System.out.println("Loading image");
		this.url = pStr;
	}
	
	public void draw() {
		System.out.println(this.url);
	}

}
