package observer04.solution;

public class List implements Observer {
	
	public void setListValue(int num) {
		System.out.println("List set value: " + num);
	}
	
	@Override
	public void update() {
		this.setListValue(12);
	}

}
