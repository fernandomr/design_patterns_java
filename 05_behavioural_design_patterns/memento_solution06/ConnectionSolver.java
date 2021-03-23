package memento_solution06;

import java.awt.geom.Point2D;


public class ConnectionSolver {
	
	private Point2D firstPoint;
	private Point2D secondPoint;
	
	public void setFirstPoint(Point2D firstPoint) {
		this.firstPoint = firstPoint;
	}
	
	public void setSecondPoint(Point2D secondPoint) {
		this.secondPoint = secondPoint;
	}
	
	public void calculateLine() {
		System.out.println("Calculate line between " + this.firstPoint + " and " + this.secondPoint);
	}
	
	public ConnectionSolverMemento createMemento() {
		return new ConnectionSolverMemento(this.firstPoint, this.secondPoint);
	}
	
	public void setMemento(ConnectionSolverMemento memento) {
		this.firstPoint = memento.getFirstPoint();
		this.secondPoint = memento.getSecondPoint();
	}

}
