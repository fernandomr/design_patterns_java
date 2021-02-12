package prototype.solution;

public class Client {
	
	public static void main(String[] args) {
		
		/*
		 * First create a prototype to be able to use the prototype itself
		 */
		Image image = new Image();
		image.setUrl("http://test.com");
		
		GraphicTool tool = new GraphicTool(image);
		
		Graphic graphic = tool.createGraphic();
		
		System.out.println("Graphic instance: " + graphic.getClass());
		System.out.println("State also copied: " + graphic.getUrl());
		
		// what if we change Url at runtime
		image.setUrl("http://thisIsANewUrl.com");
		System.out.println("New URL of image: " + image.getUrl());
		System.out.println("Graphic still has URL: " + graphic.getUrl());
		graphic = tool.createGraphic();
		System.out.println("New URL copied to new graphic instance: " + graphic.getUrl());
		
		//
		Video video = new Video();
		video.setUrl("http://videoURL.com");
		tool.setPrototype(video);
		graphic = tool.createGraphic();
		System.out.println("Graphic instance: " + graphic.getClass());
		System.out.println("State also copied: " + graphic.getUrl());
		
		//
		System.out.println("=================");
		
		Tcp tcp = new Tcp();
		tcp.setServerUrl("ournewserver.url.com.br");
		CommProtocolTool t = new CommProtocolTool(tcp);
		CommProtocol com = t.createCommProtocol();
		System.out.println("Tcp instance: " + tcp.getClass());
		System.out.println("State also copied: " + com.getServerUrl());
	}

}
