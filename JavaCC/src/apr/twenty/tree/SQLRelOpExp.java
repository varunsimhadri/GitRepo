package apr.twenty.tree;

public class SQLRelOpExp extends Pred_RightOperand {
	String relOp;
	SimpleExp randExpr;
	SQLQueryNode randNode;

	/**
	 * 1 - all query 2 - any query 3 - sqlsimpleexpression
	 */
	int type;

	public SQLRelOpExp() {

	}

	public SQLRelOpExp(String op, int t, SimpleExp exp, SQLQueryNode n) {
		relOp = op;
		type = t;

		if (type == 1 || type == 2) {
			randNode = n;
		} else {
			randExpr = exp;
		}
	}

}
