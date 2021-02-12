package factory.solution;

public class Tcp extends CommunicationProtocol{

	@Override
	public String runCommunication() {
		return ("Starting communication with [protocol, IP, door]: " + this.getTipo() + ", " + this.getIp() + ", " + this.getPorta());
	}

}
