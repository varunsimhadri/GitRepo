package apr.twenty.tree;

public class ScalarNode {
	public int Type;
	/*
	 * 1 for SQL Expression 2 for Select Statement
	 */
	public SimpleExp myExpr;
	public SQLQueryNode myQNode;

	public ScalarNode(int type, SimpleExp myExpr) {
		super();
		Type = type;
		this.myExpr = myExpr;
	}

	public ScalarNode(int type, SQLQueryNode myQNode) {
		super();
		Type = type;
		this.myQNode = myQNode;
	}

}
