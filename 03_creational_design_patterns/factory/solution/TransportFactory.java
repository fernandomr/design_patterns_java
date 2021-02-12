package factory.solution;

public abstract class TransportFactory {
	
	abstract Transport create();
	
	/*
	 * Here the abstract factory is created
	 * 
	 * In the TransportFactory is the way we create Transport objects
	 * 
	 * Our objective is to users to use the Factory instead of specific constructors
	 */

}
