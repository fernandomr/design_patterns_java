package observer04.solution;

public interface Subject {
	
	void attachObserver(Observer observer);
	
	void detachObserver(Observer observer);
	
	void change();

}
