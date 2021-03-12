package visitor03.solution;

public abstract class CarPart {
	
	void acceptCarPartVisitor(CarPartVisitor carPartVisitor) {
		carPartVisitor.visit(this);
	}

}
