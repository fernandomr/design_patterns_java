package proxy.solution;

import java.util.List;
import java.util.ArrayList;


public class Client {

	public static void main(String[] args) {
		
		ImageProxy img1 = new ImageProxy("test image");
		ImageProxy img2 = new ImageProxy("second image");
		
		List<Image> images = new ArrayList<Image>();
		images.add(img1);
		images.add(img2);
		
		Application application = new Application(images);
		
		System.out.println("Application setup");
		
		/*
		 * The images are only being 'loaded' here
		 */
		application.draw(); 

	}

}
