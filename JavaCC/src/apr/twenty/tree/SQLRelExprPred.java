package apr.twenty.tree;

public class SQLRelExprPred extends SQLPredicate {
	SimpleExp leftRand;
	Pred_RightOperand rightRand;

	/**
	 * 1 - all query 2 - any query 3 - sqlsimpleexpression
	 */
	int type;

	public SQLRelExprPred() {

	}

	public SQLRelExprPred(SimpleExp left, Pred_RightOperand right) {
		leftRand = left;
		rightRand = right;
	}

}
