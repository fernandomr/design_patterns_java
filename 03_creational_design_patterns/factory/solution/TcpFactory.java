package factory.solution;

public class TcpFactory extends CommunicationProtocolFactory {

	@Override
	CommunicationProtocol createPacket(String ip, int porta) {
		Tcp t = new Tcp();
		t.setTipo("TCP");
		t.setIp(ip);
		t.setPorta(porta);
		return t;
	}
	
}
