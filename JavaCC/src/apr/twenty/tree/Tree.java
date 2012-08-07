package apr.twenty.tree;

import apr.twenty.custom.*;

public class Tree {
	public SQLQueryNode root;
	String funcName;

	public Tree() {
		super();
		root = null;
	}

	public SQLQueryNode buildTree(Function func) {
		TupleConstructor tuple = new TupleConstructor();
		if (func.getParamList() != null)
			tuple.addList(func.getParamList());
		SQLQueryNode root = tuple;

		int i = 0;
		while (func.getMyBody().getStmtList().get(i) != null) {
			String type = func.getMyBody().getStmtList().get(i).getType();
			if (type == "decl") {
				DeclareStmt myDec = (DeclareStmt) func.getMyBody()
						.getStmtList().get(i);
				ApplyCross myApply = new ApplyCross("cross");
				TupleConstructor myTuple = new TupleConstructor();
				myTuple.addVarList(myDec.varList);
				myApply.left = root;
				myApply.right = myTuple;
				root = myApply;
			} else if (type == "asgn") {
				AssignStatement myAssign = (AssignStatement) func.getMyBody()
						.getStmtList().get(i);
				ApplyMerge myApply = new ApplyMerge("merge", myAssign.lhs);
				myApply.bindVarList.add(myAssign.lhs);
				TupleConstructor myTuple = new TupleConstructor();
				myTuple.addToMap(myAssign.lhs, myAssign.rhs);
				myApply.left = root;
				myApply.right = myTuple;
				root = myApply;
			}
			i++;
		}
		return root;
	}

}
