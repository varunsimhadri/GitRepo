package apr.twenty.tree;

public class OrderByExpression {
	SimpleExp exp;
	int orderType;

	/*
	 * orderType: 0 - no type 1 - ascending 2 - descending
	 */
	public OrderByExpression() {

	}

	public void setData(SimpleExp e, int t) {
		exp = e;
		orderType = t;
	}

}
