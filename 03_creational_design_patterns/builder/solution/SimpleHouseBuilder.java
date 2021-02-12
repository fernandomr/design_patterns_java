package builder.solution;

public class SimpleHouseBuilder implements HouseBuilder {
	
	private SimpleHouse house = new SimpleHouse();

	@Override
	public void setWallType(String wallType) {
		house.setWallType(wallType);
	}

	@Override
	public void setNumberOfRooms(int numberOfRooms) {
		house.setNumberOfRooms(numberOfRooms);
	}

	@Override
	public void setHasPool(boolean hasPool) {
		house.setHasPool(hasPool);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
