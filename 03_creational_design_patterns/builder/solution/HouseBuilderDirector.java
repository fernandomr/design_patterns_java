package builder.solution;

public class HouseBuilderDirector {
	
	public House buildHouse(String wallType, int numberOfRooms, boolean hasPool, HouseBuilder builder) {
		builder.setWallType(wallType);
		builder.setNumberOfRooms(numberOfRooms);
		builder.setHasPool(hasPool);
		return builder.getHouse();
	}

}
