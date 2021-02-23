package proxy;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	private List<Image> images = new ArrayList<Image>();
	
	public Application(List<Image> pImgLst) {
		this.images = pImgLst;
	}
	
	public void draw() {
		for (Image image: images) {
			image.draw();
		}
	}

}
