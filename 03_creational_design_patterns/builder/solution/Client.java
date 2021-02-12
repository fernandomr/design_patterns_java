package builder.solution;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * Builder pattern:
		 * Separate the construction of a complex object from its representation
		 * so that the same construction process can create different representations
		 * One construction process leads to multiple objects representation: SqlQuery and MongoDbQuery
		 * 
		 * Use builders to construct and object
		 */
		
		/*
		 * QueryBuilderDirector only has buildQuery method
		 */
		QueryBuilderDirector director = new QueryBuilderDirector();
		String from = "client table";
		String where = "client name = abcde";
		
		
		// Creates the SqlQuery (implements interface Query) using SqlQueryBuilder (implements interface QueryBuilder)
		QueryBuilder builder = new SqlQueryBuilder();
		// director.buildQuery receives the parameters from, where and builder, which is an QueryBuilder sub object
		// inside buildQuery it is returned builder.getQuery(), which is a Query object
		Query query = director.buildQuery(from, where, builder);
		query.execute();
		
		// Creates MongoDb Query using MongoDbQueryBuilder
		builder = new MongoDbQueryBuilder();
		query = director.buildQuery(from, where, builder);
		query.execute();
		
		/*
		 * By switching builders, different objects can be generated.
		 * 
		 * Use o padrão Builder quando você quer que seu código seja 
		 * capaz de criar diferentes representações do mesmo objeto 
		 * (por exemplo, casas com paredes de pedra ou paredes de madeira).
		 */
		
		// tests below:
		String wallType = "wood";
		int numberOfRooms = 4;
		boolean hasPool = false;
		
		HouseBuilderDirector dir = new HouseBuilderDirector();
		HouseBuilder houBuilder = new SimpleHouseBuilder();
		SimpleHouse house = (SimpleHouse) dir.buildHouse(wallType, numberOfRooms, hasPool, houBuilder);
		// by casting the return type I were able to access house properties
		house.printHouseProperties();
		System.out.println("Num of rooms: " + house.numberOfRooms );
		
		
		
		

	}

}
