package factory;

public class Client {

	public static void main(String[] args) {
		
		Transport vehicle = new Transport();
		System.out.println(vehicle.drive());
		
		vehicle = new Car();
		System.out.println(vehicle.drive());
		
		/*
		 * The problem is, vehicle can be a Transport, a Car or something else
		 * It is simply not known in advance.
		 * 
		 */

	}

}
