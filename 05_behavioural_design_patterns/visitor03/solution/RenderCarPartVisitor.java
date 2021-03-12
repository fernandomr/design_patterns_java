package visitor03.solution;

public class RenderCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("render: " + carPart);
	}
	
}
