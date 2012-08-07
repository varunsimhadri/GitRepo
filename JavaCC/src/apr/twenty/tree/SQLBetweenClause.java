package apr.twenty.tree;

public class SQLBetweenClause extends Pred_RightOperand {
	SimpleExp lowerLim;
	SimpleExp upperLim;
	boolean negation;

	public SQLBetweenClause() {

	}

	public SQLBetweenClause(boolean neg, SimpleExp l, SimpleExp u) {
		lowerLim = l;
		upperLim = u;
		negation = neg;
	}
}
