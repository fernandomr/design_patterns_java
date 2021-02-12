package builder.solution;

public class SimpleHouse extends HouseStdModel implements House {

	@Override
	public void printHouseProperties() {
		System.out.println("This is only a simple house with pool: " + this.hasPool);
	}

}
