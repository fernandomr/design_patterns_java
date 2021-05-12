package state08.solution;

public class ClosedTCPConnState implements TCPConnectionState {
	
	private TCPConnection connection;
	
	public ClosedTCPConnState(TCPConnection conn) {
		this.connection = conn;
	}

	@Override
	public void open() {
		System.out.println("opening connection");
		this.connection.setState(new OpenTCPConnState(this.connection));
	}

	@Override
	public void close() {
		System.out.println("Already closed connection");
	}

	@Override
	public void acknowledge() throws Exception {
		throw new Exception("Cant acknowledge a closed connection");
	}

}
