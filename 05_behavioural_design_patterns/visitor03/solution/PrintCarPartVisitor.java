package visitor03.solution;

public class PrintCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("print: " + carPart);
	}

}
