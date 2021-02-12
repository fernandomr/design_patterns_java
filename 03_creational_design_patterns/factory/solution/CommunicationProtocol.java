package factory.solution;

public abstract class CommunicationProtocol {
	
	protected String tipo;
	
	protected String ip;
	
	protected int porta;
	
	public abstract String runCommunication();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	
}
