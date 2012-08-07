package apr.twenty.tree;

public class SQLLikeClause extends Pred_RightOperand {
	SimpleExp cmpExp;
	SimpleExp escapeExp;
	boolean negation;

	public SQLLikeClause() {

	}

	public SQLLikeClause(boolean neg, SimpleExp cmp) {
		negation = neg;
		cmpExp = cmp;
		escapeExp = null;
	}

	public SQLLikeClause(boolean neg, SimpleExp cmp, SimpleExp esc) {
		negation = neg;
		cmpExp = cmp;
		escapeExp = esc;
	}
}
