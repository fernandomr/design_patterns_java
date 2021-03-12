package visitor03;

public class Light extends CarPart{
	
	@Override
	void render() {
		System.out.println("Render Light");
	}

	@Override
	void upgrade() {
		System.out.println("Upgrade light");
	}

	@Override
	void print() {
		System.out.println("Light");
	}

}
