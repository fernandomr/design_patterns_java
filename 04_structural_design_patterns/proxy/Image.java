package proxy;

public class Image {
	
	private String url;
	
	public Image(String pStr) {
		System.out.println("Loading image");
		this.url = pStr;
	}
	
	public void draw() {
		System.out.println(this.url);
	}

}
