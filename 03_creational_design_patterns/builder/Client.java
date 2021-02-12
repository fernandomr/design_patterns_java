package builder;

public class Client {
	public static void main(String[] args) {
		String from = "client table";
		String where = "client name = ...";
		
		// using sql query
		
		// Define the builder for sql
		
		// build the query by using the director
		SqlQuery sqlQuery = new SqlQuery();
		sqlQuery.setFrom(from);
		sqlQuery.setWhere(where);
		sqlQuery.execute();
		
		// using mongodb query
		MongoDbQuery mongoDbQuery = new MongoDbQuery();
		mongoDbQuery.setFrom(from);
		mongoDbQuery.setWhere(where);
		mongoDbQuery.execute();
		
		/*
		 * You can see that the creation process in SqlQuery is the same
		 * as in MongoDbQuery
		 */
	}
}
