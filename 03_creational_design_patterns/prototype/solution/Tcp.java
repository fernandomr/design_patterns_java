package prototype.solution;

public class Tcp extends CommProtocol{
	
	private String serverUrl;

	@Override
	public CommProtocol clone() {
		Tcp clone = new Tcp();
		clone.setServerUrl(this.serverUrl);
		return clone;
	}
	
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}

	@Override
	public String getServerUrl() {
		return this.serverUrl;
	}

}
