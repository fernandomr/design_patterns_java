package visitor03;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	List<CarPart> carParts = new ArrayList<CarPart>();
	
	public List<CarPart> getCarParts() {
		return carParts;
	}
	
	public void setCarParts(List<CarPart> carParts) {
		this.carParts = carParts;
	}
	
	public void render() {
		for (CarPart carPart : this.carParts) {
			carPart.render();
		}
	}
	
	public void upgrade() {
		for (CarPart carPart : this.carParts) {
			carPart.upgrade();
		}
	}
	
	public void print() {
		for (CarPart carPart : this.carParts) {
			carPart.print();
		}
	}

}
