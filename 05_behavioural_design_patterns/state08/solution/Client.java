package state08.solution;

public class Client {

	public static void main(String[] args) throws Exception {
		// 
		TCPConnection connection = new TCPConnection();
		
		connection.open();
		
		connection.acknowledge();
		
		connection.close();
		
		// connection.acknowledge();

	}

}