package memento_solution06;

public class ConnectionSolverCaretaker {
	
	private ConnectionSolverMemento connectionSolverMemento;
	
	public void saveState(ConnectionSolver connectionSolver) {
		connectionSolverMemento = connectionSolver.createMemento();
	}
	
	public void restoreState(ConnectionSolver connectionSolver) {
		connectionSolver.setMemento(connectionSolverMemento);
	}

}
