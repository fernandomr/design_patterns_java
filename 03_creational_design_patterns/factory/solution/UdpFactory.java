package factory.solution;

public class UdpFactory extends CommunicationProtocolFactory {

	@Override
	CommunicationProtocol createPacket(String ip, int porta) {
		Tcp t = new Tcp();
		t.setTipo("UDP");
		t.setIp(ip);
		t.setPorta(porta);
		return t;
	}
	
}
