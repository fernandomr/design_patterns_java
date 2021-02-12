package factory.solution;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * The Factory is an interface the client can work with
		 */
		
		/*
		 * At runtime it can be choosed what kind of factory will be created
		 */
		TransportFactory factory = new BikeFactory();
		
		// when needed to instantiate a new object, simply call:
		Transport transport = factory.create();
		
		System.out.println(transport.drive());
		
		// If there's need to change the bike to a car, call:
		factory = new CarFactory();
		transport = factory.create();
		System.out.println(transport.drive());
		
		
		// ================================
		String ipStr = "200.231.89.91";
		CommunicationProtocolFactory comFactory = new TcpFactory();
		CommunicationProtocol someProtocolComm = comFactory.createPacket(ipStr, 80);
		System.out.println(someProtocolComm.runCommunication());
		
		comFactory = new UdpFactory();
		someProtocolComm = comFactory.createPacket(ipStr, 443);
		System.out.println(someProtocolComm.runCommunication());

	}

}
