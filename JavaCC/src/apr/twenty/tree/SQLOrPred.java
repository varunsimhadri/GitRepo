package apr.twenty.tree;

public class SQLOrPred extends SQLPredicate {
	SQLPredicate rand1;
	SQLPredicate rand2;

	public SQLOrPred(SQLPredicate r1, SQLPredicate r2) {
		rand1 = r1;
		rand2 = r2;
	}

	public SQLOrPred() {

	}
}
