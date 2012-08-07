package apr.twenty.tree;

public class SQLAndPred extends SQLPredicate {
	SQLPredicate rand1;
	SQLPredicate rand2;

	public SQLAndPred(SQLPredicate r1, SQLPredicate r2) {
		rand1 = r1;
		rand2 = r2;
	}

	public SQLAndPred() {

	}
}
