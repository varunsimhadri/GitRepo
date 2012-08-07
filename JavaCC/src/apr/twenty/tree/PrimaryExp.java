package apr.twenty.tree;

public class PrimaryExp extends SQLExpr {
	String tableCol;
	int number;

	/**
	 * type: 1 - table column 2 - number 3 - NULL
	 */
	int type;

	public PrimaryExp() {
	}

	public PrimaryExp(int t, String tc) {
		super();
		type = t;
		tableCol = tc;
	}

	public PrimaryExp(int t, int n) {
		super();
		type = t;
		number = n;
	}

	public PrimaryExp(int t) {
		super();
		type = t;
	}
}
