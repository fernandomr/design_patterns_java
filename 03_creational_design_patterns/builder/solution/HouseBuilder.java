package builder.solution;

public interface HouseBuilder {
	
	void setWallType(String wallType);
	
	void setNumberOfRooms(int numberOfRooms);
	
	void setHasPool(boolean hasPool);
	
	House getHouse();

}
