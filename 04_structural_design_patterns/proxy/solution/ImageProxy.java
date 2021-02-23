package proxy.solution;

public class ImageProxy extends Image {
	// it is important do extend Image because ImageProxy should behave like an Image
	
	private Image image;
	
	public ImageProxy(String pUrl) {
		super();
		this.url = pUrl;
	}
	
	@Override
	public void draw() {
		
		if (image == null) {
			this.image = new Image(this.url);
		}
		image.draw();
	}
}
