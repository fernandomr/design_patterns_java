package state08.solution;

public class OpenTCPConnState implements TCPConnectionState {
	
	private TCPConnection connection;
	
	public OpenTCPConnState(TCPConnection conn) {
		this.connection = conn;
	}

	@Override
	public void open() {
		System.out.println("Reinitializing connection");
	}

	@Override
	public void close() {
		connection.setState(new ClosedTCPConnState(this.connection));
		System.out.println("Closing connection");
	}

	@Override
	public void acknowledge() throws Exception {
		System.out.println("Acknowledge");
	}

}
