package state08.solution;

public interface TCPConnectionState {
	
	void open();
	
	void close();
	
	void acknowledge() throws Exception;

}
