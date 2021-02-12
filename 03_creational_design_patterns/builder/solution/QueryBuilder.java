package builder.solution;

public interface QueryBuilder {
	
	void from(String from);
	
	void where(String where);
	
	Query getQuery();
}
