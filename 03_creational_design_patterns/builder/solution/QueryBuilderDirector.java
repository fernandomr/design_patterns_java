package builder.solution;

public class QueryBuilderDirector {
	
	/*
	 * This is the class where that actually builds the query
	 */
	
	/*
	 * Creates a query based on the from and where
	 * @param from
	 * @param where
	 * @param builder to define end result of the query or the representation of the query
	 * @return
	 */
	public Query buildQuery(String from, String where, QueryBuilder builder) {
		builder.from(from);
		builder.where(where);
		return builder.getQuery();
	}

}
