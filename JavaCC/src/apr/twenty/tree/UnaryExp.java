package apr.twenty.tree;

public class UnaryExp extends SQLExpr {
	PrimaryExp rand;
	String sign;
	boolean isSignAssigned;

	public UnaryExp() {
	}

	public UnaryExp(PrimaryExp r) {
		super();
		isSignAssigned = false;
		rand = r;
	}

	public UnaryExp(String s, PrimaryExp r) {
		super();
		isSignAssigned = true;
		rand = r;
		sign = s;
	}

}
