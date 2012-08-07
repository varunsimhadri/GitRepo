package apr.twenty.tree;

public class SimpleExp extends SQLExpr {
	MultiplyExp rand1;
	SimpleExp rand2;
	String rator;
	boolean isBinaryExpr;

	public SimpleExp() {
	}

	public SimpleExp(MultiplyExp r1) {
		super();
		isBinaryExpr = false;
		rand1 = r1;
	}

	public SimpleExp(MultiplyExp r1, String op, SimpleExp r2) {
		super();
		isBinaryExpr = true;
		rand1 = r1;
		rator = op;
		rand2 = r2;
	}

}
