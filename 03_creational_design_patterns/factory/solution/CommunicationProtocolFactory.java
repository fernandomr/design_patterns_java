package factory.solution;

public abstract class CommunicationProtocolFactory {

	abstract CommunicationProtocol createPacket(String ip, int porta);
	
}
