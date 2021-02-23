package proxy;

import java.util.List;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		Image img1 = new Image("test image");
		Image img2 = new Image("second image");
		
		List<Image> images = new ArrayList<Image>();
		images.add(img1);
		images.add(img2);
		
		Application application = new Application(images);
		
		System.out.println("Application setup");
		
		application.draw();

	}

}
