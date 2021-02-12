package factory.solution;

public class Udp extends CommunicationProtocol{
	
	@Override
	public String runCommunication() {
		return ("Starting communication with [protocol, IP, door]: " + this.getTipo() + ", " + this.getIp() + ", " + this.getPorta());
	}

}
