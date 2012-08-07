package apr.twenty.tree;

public class SQLInClause extends Pred_RightOperand {
	SQLQueryNode n;
	boolean negation;

	public SQLInClause() {

	}

	public SQLInClause(boolean neg, SQLQueryNode nd) {
		negation = neg;
		n = nd;
	}
}
