package visitor03;

public class Wheel extends CarPart{
	
	@Override
	void render() {
		System.out.println("Render Wheel");
	}

	@Override
	void upgrade() {
		System.out.println("Upgrade Wheel");
	}

	@Override
	void print() {
		System.out.println("Wheel");
	}

}
