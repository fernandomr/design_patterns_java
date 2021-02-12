package builder.solution;

public class MongoDbQuery implements Query {

	private String from;
	
	private String where;
	
	@Override
	public void execute() {
		System.out.println("Executing MongoDbQuery from: " + from + " where " + where);
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public void setWhere(String where) {
		this.where = where;
	}
	
}
