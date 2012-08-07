package apr.twenty.tree;

public class QueryTableExp {
	public SQLQueryNode n;
	public String tableName;
	public int expType;

	/**
	 * expType: 1 - query node 2 - table name
	 */

	public QueryTableExp() {

	}

	public QueryTableExp(SQLQueryNode n) {
		this.n = n;
		expType = 1;
	}

	public QueryTableExp(String name) {
		tableName = name;
		expType = 2;
	}

}
